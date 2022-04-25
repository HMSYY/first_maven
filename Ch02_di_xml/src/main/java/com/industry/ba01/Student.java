package com.industry.ba01;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("student的无参数构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName == " + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge == " + age);
        this.age = age;
    }

    public void setEmail(String email){
        //email属性  <property name = "email" value = "1111@qq.com"/>
        System.out.println("setEmail == " + email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
