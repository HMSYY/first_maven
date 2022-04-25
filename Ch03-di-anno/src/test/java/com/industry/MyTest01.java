package com.industry;

import org.junit.Test;
import com.industry.ba01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {

    @Test
    public void test01(){
        String config = "applicationContext-manyPackage.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("student = " + student);
    }
}
