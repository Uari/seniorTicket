package com.best.ticket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.best.ticket.service.CommunityService;

@Controller
@RequestMapping("*community/*")
public class CommunityController {
  Logger logger = LoggerFactory.getLogger(CommunityController.class);

  @Autowired
  private CommunityService communityService;

  
}
