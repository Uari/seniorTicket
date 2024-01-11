package com.best.ticket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.best.ticket.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberContoller {
  Logger logger = LoggerFactory.getLogger(MemberContoller.class);

  @Autowired
  private MemberService memberService;
  
  /*
    작성자 : pbh
    작성일자 : 
    기능 : 회원삭제
   */
  // @GetMapping("path")
  // public SomeData getMethodName(@RequestParam String param) {
  //     return new SomeData();
  // }
  
  
}
