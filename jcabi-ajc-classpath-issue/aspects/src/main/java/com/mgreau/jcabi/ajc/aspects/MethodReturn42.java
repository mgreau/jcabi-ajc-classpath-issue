package com.mgreau.jcabi.ajc.aspects;

import com.mgreau.jcabi.ajc.commons.Return42;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MethodReturn42 {

  @Around("execution(* *(..)) && @annotation(com.mgreau.jcabi.ajc.commons.Return42)")
  public Object wrapMethod(ProceedingJoinPoint pjp) throws Throwable {

    Object[] args = pjp.getArgs();
    Object retVal = pjp.proceed(args);
    System.out.print("[ASPECT] Real result: " + ((Integer)retVal).intValue());
    return new Integer("42");
  }

}
