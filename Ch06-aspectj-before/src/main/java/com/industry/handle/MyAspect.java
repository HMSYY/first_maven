package com.industry.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * 表示切面类
 */
@Aspect
public class MyAspect {

    /*@Before(value = "execution(public void " +
            "com.industry.service.impl.SomeServiceImpl.doSome(String, Integer))")
    public void myBefore(){
        //切面的代码
        System.out.println("前置通知，切面的功能，在目标方法之前先执行：" + new Date());
        System.out.println("\r\n");
    }*/

    /**
     * 给方法加参数
     */
    @Before(value = "execution(void *..SomeServiceImpl.do*(..))")
    public void myBefore(JoinPoint jp){

        //获取目标方法的定义
        //System.out.println("前置通知中，获取目标方法的定义：" + jp.getSignature()）
        //获取目标方法的名称
        //System.out.println("前置通知中，获取目标方法的定义：" + jp.getSignature().getName());
        //获取方法执行时的参数
        //Object args[] = jp.getArgs();
        //for(Object obj:args){
            //System.out.println("前置通知，获取方法的参数：" + obj);
        //}

        String methodName = jp.getSignature().getName();
        if("doSome".equals(methodName)){
            //切面的代码
            System.out.println("doSome输出日志====前置通知，切面的功能，在目标方法之前先执行：" + new Date());
        }else if("doOther".equals(methodName)){
            System.out.println("doOther输出日志====前置通知，作为方法名称，参数的记录。");
        }
    }
}






















