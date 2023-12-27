package com.liutao.www;

import java.util.List;

public class Student {
    public String name;
    public int age;
    private Course course;
    private List<String> addr;

    public Student() {
    }

    public Student(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Student(String name, int age, Course course, List<String> addr) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.addr = addr;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<String> getAddr() {
        return addr;
    }

    public void setAddr(List<String> addr) {
        this.addr = addr;
    }
}
