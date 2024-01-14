package com.best.ticket.service;

import java.util.List;
import java.util.Map;

public interface ReservationService {

  public List<Map<String,Object>> ticketList(List<Map<String, Object>> pmap) throws Exception;
} 