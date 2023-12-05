package com.example.bean;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@Configurable
public class CorpConfig {
    @Bean("companyC")
    public Corp corpInfo(){
        Corp corp=new Corp();
        corp.setCorpName("companyC");

        List<Employee> staff=new ArrayList<>();
        staff.add(new Employee("注解员工1",001));
        staff.add(new Employee("注解员工2",002));

        corp.setStaff(staff);

        return corp;
    }

}

