package com.industry.ba05;

import com.industry.ba05.School;
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
     *       属性：required：boolean类型的属性，默认true
     *            true：spring在启动的时候，创建容器对象的时候，会检查引用类型是否
     *                  赋值成功，如果赋值失败，会终止程序的执行并报错。
     *                  （将错误情况尽早暴露出来，推荐使用）
     *            false：引用类型赋值失败，程序正常执行不报错。引用类型的值是null。
     *       位置：1）在属性定义的上面，无需set方法，推荐使用
     *            2）在set方法上面
     *
     * byName自动注入：
     * 1）@Autowired：给引用类型赋值
     * 2）@Qualifier(value="bean的id")：表示从容器中找到指定名称的对象，
     *                                把这个对象赋值给引用类型。
     */
    //byName注入，两个注解没有先后顺序
    @Autowired(required = false)
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
