package com.best.ticket.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best.ticket.dao.CommunityDao;
import com.best.ticket.service.CommunityService;

@Service
public class CommunityServiceImpl implements CommunityService{
  Logger logger = LoggerFactory.getLogger(CommunityServiceImpl.class);

  @Autowired
  private CommunityDao communityDao;

  @Override
  public List<Map<String, Object>> CommunityList(List<Map<String, Object>> pmap) throws Exception {
    
    return null;
  }
}
