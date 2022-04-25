package com.industry.Service.impl;

import com.industry.SomeService;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        //在业务方法开始时记录时间
        System.out.println("日志功能：记录方法执行时间 = " + new Date());

        System.out.println("业务方法doSome，计算商品的购买金额");

        //在业务方法之后，提交事务
        System.out.println("事务功能：提交事务处理");
    }

    @Override
    public void doOther() {
        //在业务方法开始时记录时间
        System.out.println("日志功能：记录方法执行时间 = " + new Date());

        System.out.println("业务方法doOther，消除库存");

        //在业务方法之后，提交事务
        System.out.println("事务功能：提交事务处理");
    }
}
