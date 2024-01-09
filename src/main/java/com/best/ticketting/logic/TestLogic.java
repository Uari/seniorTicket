package com.best.ticketting.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best.ticketting.dao.TestDao;

@Service
public class TestLogic {
  
  @Autowired
  private TestDao testDao;
  
}
