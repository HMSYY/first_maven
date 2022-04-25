package com.industry.ba06;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.industry.ba06.School;

import javax.annotation.Resource;

@Component("myStudent")
public class Student {

    /**
     * 简单类型的属性赋值：@Value
     *
     * @Value：简单类型的属性赋值
     *   属性：value：简单类型的属性值
     *   位置：1）在属性定义的上面，无需set方法，推荐使用
     *        2）在set方法的上面
     */
    @Value("${myName}")
    private String name;
    @Value("${myAge}")
    private int age;

    /**
     * 引用类型
     * @Resource：给引用类型赋值
     */
    //默认byName自动注入
    @Resource(name = "mySchool")
    private School school;

    public Student() {
        System.out.println("student无参数构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
