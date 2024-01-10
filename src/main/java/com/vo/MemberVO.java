package com.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVO {
  private int mem_no;
  
  @Builder
    public MemberVO(int mem_no){
      super();
      this.mem_no = mem_no;
    }
}
