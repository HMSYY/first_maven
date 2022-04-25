package com.industry;

import com.industry.Service.impl.SomeServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void test01(){

        SomeService service = new SomeServiceImpl();
        service.doSome();
        System.out.println("============================================");
        service.doOther();
    }
}
