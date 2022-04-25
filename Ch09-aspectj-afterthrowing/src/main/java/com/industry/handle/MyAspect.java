package com.industry.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {

    /**
     * 异常通知
     */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",
                   throwing = "ex")
    public void myAfterThrowing(Exception ex){

        System.out.println("异常通知，在目标方法抛出异常时执行的，异常原因是：" +
                ex.getMessage());
        /*
           异常发生可以做：
           1. 记录异常的时间、位置等信息
           2. 发送邮件、短息通知开发人员
         */
    }
}





















