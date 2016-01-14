package com.mgreau.jcabi.ajc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {

  @Test
  public void shouldReturn42() {

    final int[] values = { 5, 6, 1};
    final Sum tester = new Sum(values);

    assertEquals("AJC didn't weave the Sum method!", 42, tester.getResult().intValue());
  }

}
