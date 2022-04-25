package com.industry.service.impl;

import com.industry.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("业务方法doSome(),创建商品的订单");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("执行业务方法doOther，处理库存");
        return "abcd";
    }

    @Override
    public String doFirst(String name) {
        System.out.println("执行业务方法doFirst，处理库存");
        return "doFirst";
    }

    @Override
    public void doSecond(String name) {
        System.out.println("执行业务方法doSecond，处理库存");
    }

    @Override
    public void doThird() {
        System.out.println("执行业务方法doThird()");
    }

    /*@Override
    public void doThird() {
        System.out.println("执行业务方法doThird()" + (10/0));
    }*/
}
