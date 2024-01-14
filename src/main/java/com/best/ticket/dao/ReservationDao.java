package com.best.ticket.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationDao {
  Logger logger = LoggerFactory.getLogger(ReservationDao.class);

  @Autowired
  SqlSessionTemplate sqlSessionTemplate;

  
}
