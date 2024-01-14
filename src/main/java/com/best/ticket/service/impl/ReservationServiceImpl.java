package com.best.ticket.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best.ticket.dao.ReservationDao;
import com.best.ticket.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{
  Logger logger = LoggerFactory.getLogger(ReservationService.class);

  @Autowired
  private ReservationDao reservationDao;

  @Override
  public List<Map<String, Object>> ticketList(List<Map<String, Object>> pmap) throws Exception {
    
    return null;
  }
}
