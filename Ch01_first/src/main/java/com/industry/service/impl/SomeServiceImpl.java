package com.industry.service.impl;

import com.industry.service.SomeService;

public class SomeServiceImpl implements SomeService {

    //若"SomeServiceImpl的无参数构造方法"这句话执行，
    // 说明SomeServiceImpl类型的对象被创建了
    public SomeServiceImpl(){

        System.out.println("SomeServiceImpl的无参数构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了doSome()方法");
    }
}
