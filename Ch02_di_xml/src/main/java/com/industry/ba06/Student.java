package com.industry.ba06;

public class Student {

    private String name;
    private int age;
    //引用类型
    private School school;


    public Student() {
        System.out.println("student的无参数构造方法");
    }

    //创建有参数构造方法
    public Student(String initialName, int initialAge, School initialSchool){
        //给属性依次赋值
        this.name = initialName;
        this.age = initialAge;
        this.school = initialSchool;
    }

    public Student(String initialName, int initialAge) {

        this.name = initialName;
        this.age = initialAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
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
