// Corp.java
package com.example.bean;

import java.util.ArrayList;
import java.util.List;

public class Corp {
    private String corpName;
    private List<Employee> staff = new ArrayList<>();

    public Corp() {

    }

    public Corp(String corpName, List staff) {
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

}
