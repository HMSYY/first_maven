package com.industry.Service.impl;

import com.industry.SomeService;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    //希望文档里有代码和日志
    public void doSome(String name,Integer age) {

        System.out.println("业务方法doSome，计算商品的购买金额");
    }

    @Override
    public void doOther() {

        System.out.println("业务方法doOther，消除库存");
    }
}
