package com.industry;

import com.industry.service.OtherService;
import com.industry.service.SomeService;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 *
 */
public class MyTest {

    //spring创建对象，调用的是哪个方法？
    @Test
    public void test01() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService service = ctx.getBean(SomeService.class);
        service.doSome();
    }

    @Test
    public void test02() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //SomeService service = ctx.getBean(SomeService.class);
        //service.doSome();
    }

    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        //获取容器中定义的java对象的数量
        int nums = ctx.getBeanDefinitionCount();
        System.out.println("在容器中定义对象的数量 = " + nums);

        //获取容器中定义的对象的名称
        String names[] = ctx.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println("容器中对象的名称 = " + name);
        }
    }

    //让spring创建非自定义类对象，即有class文件，就能让spring创建对象
    @Test
    public void test04() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Date date = (Date) ctx.getBean("myDate");
        System.out.println("date = " + date);

        OtherService service = (OtherService) ctx.getBean("otherService");
        service.doOther();
    }
}
