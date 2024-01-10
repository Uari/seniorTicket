package com.best.ticketting.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
  Logger logger = LoggerFactory.getLogger(MemberDao.class);

  @Autowired
  SqlSessionTemplate sqlSessionTemplate;

  public List<Map<String, Object>> memberList() {
    return null;
  }
}
