package com.best.ticket.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommunityDao {
  Logger logger = LoggerFactory.getLogger(CommunityDao.class);

  @Autowired
  SqlSessionTemplate sqlSessionTemplate ;

  public List<Map<String, Object>> memberList(List<Map<String, Object>> pmap) {
    logger.info("Dao : memberList 호출");
    
    sqlSessionTemplate.selectList("memberList", pmap);

    return null;
  }

}
