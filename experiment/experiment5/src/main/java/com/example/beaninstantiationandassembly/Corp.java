// Corp.java
package com.example.beaninstantiationandassembly;

import java.util.List;

public class Corp {
    //Corp [corpName（公司名）,staff（职员）)
    private String corpName;
    private List<Employee> staff;

    // 无参构造方法，Spring 默认使用此构造方法实例化对象
    public Corp() {
    }

    // 1. 使用构造注入
    public Corp(String corpName, List<Employee> staff) {
        this.corpName = corpName;
        this.staff = staff;
    }

    // 2. 使用设值注入
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }

    // 省略其他方法
}
