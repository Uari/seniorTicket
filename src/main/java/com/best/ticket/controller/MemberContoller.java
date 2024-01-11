package com.best.ticket.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.best.ticket.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberContoller {
  Logger logger = LoggerFactory.getLogger(MemberContoller.class);

  @Autowired
  private MemberService memberService;
  
  /*
    작성자 : 홍길동
    작성일자 : 24.01.12
    기능 : 회원조회
   */
  @GetMapping("memberList")
    public String memberList(@RequestParam List<Map<String,Object>> pmap, Model model) throws Exception{
      logger.info("Controller : memberList 호출");

      memberService.memberList(pmap);
      
      return null;
  }
}
