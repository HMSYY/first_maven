package com.industry.ba01;

import org.springframework.stereotype.Component;

/**
 *
 * @Component：表示创建对象，对象放在容器中。作用是<bean>
 *      属性：value，表示对象名称，也就是bean的id属性值
 *      位置：在类的上面，表示创建此类的对象。
 *
 * @Component(value = "myStudent")等同于
 * <bean id = "myStudent" class = "com.industry.ba01.Student"/>
 */

//使用value指定对象的名称
@Component(value = "myStudent")
//省略value
//@Component("myStudent")
//默认对象名称student
//@Component
public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("student无参数构造方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
