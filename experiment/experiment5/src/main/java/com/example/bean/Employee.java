// Employee.java
package com.example.bean;

public class Employee {
    private String name;
    private int workNumber;
    public Employee(){

    }
    public Employee(String name,int workNumber){
        this.name=name;
        this.workNumber=workNumber;
    }



    public String getName() {
        return name;
    }

    public int getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(int workNumber) {
        this.workNumber = workNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "员工信息="+'{'+"姓名='"+name+'\''+
                '}';
    }
}

