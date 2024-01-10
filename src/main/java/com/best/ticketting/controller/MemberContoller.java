package com.best.ticketting.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.best.ticketting.logic.IP_MemberLogic;

@Controller
@RequestMapping("/member/*")
public class MemberContoller {
  Logger logger = LoggerFactory.getLogger(MemberContoller.class);

  @Autowired
  private IP_MemberLogic memberLogic;
  
}
