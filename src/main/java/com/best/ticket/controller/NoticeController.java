package com.best.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.best.ticket.service.NoticeService;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
  @Autowired
  private NoticeService noticeService;

  @GetMapping("noticeList")
  public String noticeList(){
    

    return "/openNotice";
  }
}
