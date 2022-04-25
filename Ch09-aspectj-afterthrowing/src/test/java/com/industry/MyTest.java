package com.industry;

import com.industry.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.CodeFlow;

public class MyTest {

    @Test
    public void test01(){

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ctx.getBean("someService");
        service.doSecond("lisi");
    }
}
