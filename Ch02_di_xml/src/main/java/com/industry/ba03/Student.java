package com.industry.ba03;

import com.industry.ba02.School;

public class Student {

    private String name;
    private int age;
    //引用类型
    private com.industry.ba02.School school;


    public Student() {
        System.out.println("student的无参数构造方法");
    }

    //创建有参数构造方法
    public Student(String initialName, int initialAge, School initialSchool){
        System.out.println("Student有参数构造方法");
        //给属性依次赋值
        this.name = initialName;
        this.age = initialAge;
        this.school = initialSchool;
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

    public void setSchool(School school) {
        System.out.println("setSchool = " + school);
        this.school = school;
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
