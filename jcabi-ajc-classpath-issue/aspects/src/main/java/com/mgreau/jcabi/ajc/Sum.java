package com.mgreau.jcabi.ajc;

import com.mgreau.jcabi.ajc.commons.Return42;

public class Sum {

  private int[] values;

  public Sum(int args[]) {
    this.values = args;
  }

  @Return42
  public Integer getResult() {
    Integer sum = 0;
    for (int i : values) {
      sum += i;
    }
    return sum;
  }

}
