package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Corp corp = (Corp) context.getBean("corp");

        System.out.println("在调用addWorker之前的员工信息为:");
        System.out.println(corp.getCorpName() + corp.getStaff());

        // 调用 addWorker 方法
        corp.add_worker(new Employee("北桀", 1));

        System.out.println("在调用addWorker之后的员工信息为:");
        System.out.println(corp.getCorpName() + corp.getStaff());
    }
}
