package com.industry.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

@Aspect
public class MyAspect {

    @Before(value = "mypc()")
    public void myBefore(){
        System.out.println("前置通知，在目标方法执行之前先执行的");
    }

    /**
     * 最终通知
     */
    @After(value = "mypc()")
    public void myAfter(){
        System.out.println("最终通知，总是会被执行的");
    }

    /**
     * @Pointcut：定义和管理切入点，不是通知注解
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void mypc(){

    }
}





















