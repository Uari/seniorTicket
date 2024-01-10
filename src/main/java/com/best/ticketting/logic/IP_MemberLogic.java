package com.best.ticketting.logic;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best.ticketting.dao.MemberDao;

@Service
public class IP_MemberLogic  implements IF_MemberLogic{
  Logger logger = LoggerFactory.getLogger(IP_MemberLogic.class);

  @Autowired
  private MemberDao memberDao;
  
  @Override
  public List<Map<String,Object>> memberList() throws Exception{

    return memberDao.memberList();
  }
}
