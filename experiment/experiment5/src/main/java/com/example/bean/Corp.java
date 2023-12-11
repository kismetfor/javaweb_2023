// Corp.java
package com.example.bean;

import java.util.ArrayList;
import java.util.List;

public class Corp {
    private String corpName;
    private List<Employee> staff = new ArrayList<>();

    public Corp() {
    }

    public Corp(String corpName, List<Employee> staff) {
        this.corpName = corpName;
        this.staff = staff;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }


//    把实验五的Corp类作为目标类，在Corp类中添加方法addWorker(Employee emp）作为实现AOP的切入点。
    public void add_worker(Employee employee) {
        //添加员工
        staff.add(employee);
        System.out.println("------------员工添加成功! : " +employee.toString() + "------------");
    }
}
