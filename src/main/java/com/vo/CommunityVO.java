package com.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommunityVO {
  private int mem_no;
  
  @Builder
    public CommunityVO(int mem_no){
      super();
      this.mem_no = mem_no;
    }
}
