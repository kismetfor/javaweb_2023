// Employee.java
package com.example.beaninstantiationandassembly;

public class Employee {
    //Employee{name（姓名）,workNumber（工号））
    private String name;
    private String workNumber;


    public Employee() {
        // 默认构造函数
    }

    public Employee(String name, String workNumber) {
        this.name = name;
        this.workNumber = workNumber;
    }

    public String getName() {
        return name;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }
}
