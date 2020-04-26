package com.zhouyq.spring.ba01;

/**
 * @Description TODO
 * @Date 2020/4/26 21:39
 * @Author zhouyq
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Student 无参构造方法");
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        System.out.println("set name: " + name);
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        System.out.println("set age: " + age);
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
