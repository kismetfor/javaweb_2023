package com.example.beaninstantiationandassembly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CorpConfig {
    @Bean("companyC")
    public Corp corpInfo() {
        Corp corp = new Corp();

        corp.setCorpName("companyC");

        List<Employee> staff = new ArrayList<>();
        Employee f = new Employee("注解1", "F123");
        Employee s = new Employee("注解2", "S456");
        staff.add(f);
        staff.add(s);

        corp.setStaff(staff);
        return corp;
    }
}
