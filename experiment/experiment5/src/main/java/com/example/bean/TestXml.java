package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");

        Corp corp = (Corp) con.getBean("corp");

        System.out.println("在调用add_worker方法之前----");
        System.out.println(corp.getCorpName() + corp.getStaff());

        // 调用 addWorker 方法
        corp.add_worker(new Employee("刘涛", 1));

        System.out.println("在调用add_worker方法之后-----:");
        System.out.println(corp.getCorpName() + corp.getStaff());
    }
}
