package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(CorpConfig.class);
        Corp corp = (Corp) context1.getBean("companyC");

        System.out.println("在调用addWorker之前的员工信息为:");
        System.out.println(corp.getCorpName()+corp.getStaff());

        // 调用 addWorker 方法
        corp.add_worker(new Employee("李杰", 1));

        System.out.println("在调用addWorker之后的员工信息为:");
        System.out.println(corp.getCorpName()+corp.getStaff());
    }
}
