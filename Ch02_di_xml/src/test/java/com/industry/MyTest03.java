package com.industry;

import com.industry.ba03.School;
import com.industry.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class MyTest03 {

    @Test
    public void test01(){

        String config = "ba03/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ctx.getBean("myStudent3");
        System.out.println("student = " + student);
    }

    @Test
    public void test02(){

        //获取File对象
        String config = "ba03/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        File file = (File) ctx.getBean("myFile");
        System.out.println("file = " + file.getName());
    }
}





















