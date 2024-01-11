package com.best.ticket.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best.ticket.dao.MemberDao;
import com.best.ticket.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
  Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

  @Autowired
  private MemberDao memberDao;
  


  @Override
  public List<Map<String,Object>> memberList() throws Exception{

    return memberDao.memberList();
  }



  @Override
  public int memberInsert() throws Exception {
  
    return 0;
  }



  
}
