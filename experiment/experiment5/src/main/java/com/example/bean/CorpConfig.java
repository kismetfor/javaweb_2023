package com.example.bean;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configurable
@EnableAspectJAutoProxy
@ComponentScan("com.example.bean")
//让Spring能够自动扫描
public class CorpConfig {

    // 定义一个名为 "注解装配" 的Bean，并注册到Spring容器
    @Bean("companyC")
    public Corp corpInfo(){
        Corp corp=new Corp();
        corp.setCorpName("618有限公司");

        List<Employee> staff=new ArrayList<>();
        staff.add(new Employee("小鹏",001));
        staff.add(new Employee("小朋",002));

        corp.setStaff(staff);

        return corp;
    }

}

