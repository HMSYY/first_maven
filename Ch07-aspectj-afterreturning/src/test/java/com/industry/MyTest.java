package com.industry;

import com.industry.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ctx.getBean("someService");
        service.doSome("lisi",20);
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ctx.getBean("someService");
        String ret = service.doOther("lusi",20);

        System.out.println("test02中调用目标方法的结果：" + ret);
    }
}
