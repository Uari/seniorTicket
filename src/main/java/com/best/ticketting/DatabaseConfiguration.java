package com.best.ticketting;

import javax.sql.DataSource;//커넥션풀사용할때나 원격객체를 호출할때사용

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//스프링부트  스타터에서는 의존관계에대한 처리뿐아리나 의존전이도 "자동화" 하였다
//서버기동시 스캔한다
@Configuration // spring-data.xml
// @PropertySource("classpath:/application.properties")
@PropertySource("classpath:/application.yml")
// @MapperScan(basePackages = "com.example.demo.mapper")
public class DatabaseConfiguration {// NullPointerException->BeanCreationException
    private static final Logger logger = LogManager.getLogger(DatabaseConfiguration.class);

    // Bean있는 메소드는 ByName,byType호출이 가능함
    // 하드코딩하지말고 메소드의 리턴타입으로 객체주입함 -결합도 낮추는 코드전개 한가지
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari") // yml파일의 정보를 얻는다
    public HikariConfig hikariConfig() {
        return new HikariConfig();// 생성자호출 -상위클래스 생성자도 먼저 호출된다
    }

    // connection = sqlsessionFactory ->sqlsessionTemplate
    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new HikariDataSource(hikariConfig());// yml파일에서 얻어온정보로 소스를가져옴
        logger.info("datasource : {}", dataSource);
        return dataSource;
    }

    // ApplicationContext 스프링에서 제공되는 컨테이너
    // 역할은 : 여러가지 Bean을 관리해준다 -> 객체에대한 라이프사이클 관리해줌
    // 클래스 이름앞에 @Autowired 사용함
    // DatabaseConfiguration.java
    // 왜굳이 여기넣었어 ? 다른언어,외부파일 정보를 담으려면,찾으려면 ApplicationContext 객채 @Autowired 사용
    @Autowired
    private ApplicationContext applicationContext;

    // SqlSessionFactory 상위 , sqlSessionFactoryBean 하위클래스
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // setter - 파라미터로넘어온값이 전변에 초기화됨
        sqlSessionFactoryBean.setDataSource(dataSource);
        // classpath는 src/main/resourcs이고 해당 쿼리가 있는 xml 위치는 본인의 취향대로 위치키시고 그에 맞도록 설정해주면
        // 된다.
        // MapperLocation = XXX,xml applicationContext=bean객체관리
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/**/*.xml"));
        // sqlSessionFactoryBean 생성된객체에 정보를 담음
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

/*
 * NoticeDao와 오라클서버를 myBatis라이브러리를 활용해서 연동하기
 * 스프링부트에서 사용할수록 클래스 제공해줌
 * NoticeDao - SqlsessionFactoryBean(mybatis-sptring.jar)-오라클서버
 * 
 * 디폴트 beanContainer - ApplicationContext -이른객체주입 - bean이름설계
 *
 */