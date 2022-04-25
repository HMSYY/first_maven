package com.industry.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

@Aspect
public class MyAspect {

    /**
     * 最终通知
     */
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter(){

        System.out.println("最终通知，总是会被执行的");
    }
}





















