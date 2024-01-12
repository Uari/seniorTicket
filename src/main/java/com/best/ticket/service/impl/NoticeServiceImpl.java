package com.best.ticket.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best.ticket.dao.NoticeDao;
import com.best.ticket.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService{
  @Autowired
  private NoticeDao noticeDao;

  @Override
  public List<Map<String, Object>> noticeList(List<Map<String, Object>> pmap) throws Exception {
  
    return null;
  }
}
