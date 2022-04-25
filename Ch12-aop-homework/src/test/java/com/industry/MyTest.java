package com.industry;

import com.industry.service.NumberService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){

        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        NumberService service = (NumberService) ctx.getBean("numberService");
        Integer count = service.addInteger(9,9,9);
        System.out.println("最终的执行结果为：" + count);
    }
}
