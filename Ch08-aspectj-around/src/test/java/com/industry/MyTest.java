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
        String ret = service.doFirst("lisi");
        System.out.println("ret调用目标方法的结果 = " + ret);
    }

    @Test
    public void test02() throws Throwable {

        MyHandler handler = new MyHandler();
        String res = handler.doFirst();
        System.out.println("res = " + res);
    }
}
