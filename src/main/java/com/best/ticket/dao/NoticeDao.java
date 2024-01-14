package com.best.ticket.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDao {
  Logger logger = LoggerFactory.getLogger(NoticeDao.class);

  @Autowired
  SqlSessionTemplate sqlSessionTemplate;

  /*ex)
    작성자 : 홍길동
    작성일자 : 24.01.12
    기능 : 회원조회 (Dao)
   */
  public List<Map<String, Object>> noticeList(List<Map<String, Object>> pmap) {
    logger.info("Dao : noticeList 호출");
    
    sqlSessionTemplate.selectList("noticeList", pmap);

    return null;
  }
}
