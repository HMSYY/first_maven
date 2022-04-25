package com.industry;

import com.industry.Service.impl.SomeServiceImpl;
import com.industry.proxy.ServiceProxy;
import org.junit.Test;

public class MyTest {

    @Test
    public void test01(){

        SomeService service = new SomeServiceImpl();
        service.doSome("lisi",20);
        System.out.println("============================================");
        service.doOther();
    }

    @Test
    public void test02(){

        SomeService service = new ServiceProxy();
        service.doSome("lisi",20);
    }
}
