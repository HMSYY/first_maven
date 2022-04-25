package com.industry.service;

import com.industry.handle.MyAspect;
import com.industry.service.impl.SomeServiceImpl;
import org.aspectj.lang.JoinPoint;

/**
 * 自动代理生成器<aop:aspectj-autoproxy/> 相当于生成这个类！！！
 */
public class ServiceProxy {

    SomeService target = new SomeServiceImpl();
    MyAspect aspect = new MyAspect();

    public void doSome(String name,Integer age){

        aspect.myBefore(null);
        target.doSome("lisi",20);
    }

    public void doOther(){
        System.out.println("====doOther====");
    }
}
