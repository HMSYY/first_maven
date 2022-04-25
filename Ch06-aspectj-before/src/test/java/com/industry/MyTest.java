package com.industry;

import com.industry.service.ServiceProxy;
import com.industry.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        /*
        没有加入代理的处理：
        1）目标方法执行时，没有切面的功能。
        2）Service对象没有被改变。
         */
        //加入代理后：
        // com.sun.proxy.$Proxy8 代理      $Proxy = ServiceProxy
        SomeService service = (SomeService) ctx.getBean("someService");
        //代理对象，调用方法（ServiceProxy中的方法），还有切面的功能增强。
        service.doSome("lisi",20);
        //service.doOther();
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        SomeService service = (SomeService) ctx.getBean("someService");
        service.doOther();
    }

    /**
     * ServiceProxy类暂时有问题，JoinPoint暂时不知道怎么赋值。
     * 因此该测试错误。
     */
    @Test
    public void test03(){

        ServiceProxy service = new ServiceProxy();
        service.doSome("lisi",20);
    }
}
