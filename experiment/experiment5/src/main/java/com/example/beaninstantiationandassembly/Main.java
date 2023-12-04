//// Main.java
//package com.example.beaninstantiationandassembly;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
//        // 通过构造注入
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
//        Corp corp1 = context1.getBean(Corp.class);
//        System.out.println("Corp (构造注入): " + corp1);
//
//        // 通过设值注入
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext-setter.xml");
//        Corp corp2 = context2.getBean(Corp.class);
//        System.out.println("Corp (设值注入): " + corp2);
//
//        // 使用注解进行装配
//        ApplicationContext context3 = new AnnotationConfigApplicationContext(CorpConfig.class);
//        Corp corp3 = context3.getBean("companyC", Corp.class);
//        System.out.println("Corp (注解装配): " + corp3);
//    }
//}
