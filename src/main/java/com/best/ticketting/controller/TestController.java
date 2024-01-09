package com.best.ticketting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.best.ticketting.logic.TestLogic;

@Controller
public class TestController {
  
  @Autowired
  private TestLogic testLogic ;

}
