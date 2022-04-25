package com.industry.ba04;

import com.industry.ba04.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
     * @Autowired：spring框架提供的，给引用类型赋值的，使用自动注入原理。
     *             支持byName,byType。默认是byType。
     *       位置：1）在属性定义的上面，无需set方法，推荐使用
     *            2）在set方法上面
     *
     * byName自动注入：
     * 1）@Autowired：给引用类型赋值
     * 2）@Qualifier(value="bean的id")：表示从容器中找到指定名称的对象，
     *                                把这个对象赋值给引用类型。
     */
    //byName注入，两个注解没有先后顺序
    @Autowired
    @Qualifier(value="mySchool")
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
