package com.best.ticket.service;

import java.util.List;
import java.util.Map;

/*
    작성자 : 
    작성일자 : 24.01.12
    기능 : MemberService (Interface) 
*/
public interface MemberService {

  public List<Map<String,Object>> memberList(List<Map<String, Object>> pmap) throws Exception;

}
