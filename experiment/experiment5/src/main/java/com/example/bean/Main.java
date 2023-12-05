// Main.java
package com.example.bean;

import com.example.bean.CorpConfig;
import com.example.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        System.out.println(user);
        System.out.println("<----练习测试---->");
        ApplicationContext context1=
                new AnnotationConfigApplicationContext(CorpConfig.class);
        Corp cropByAnnotation=(Corp) context1.getBean("companyC");
        System.out.println("注解装配"+cropByAnnotation.getCorpName()+cropByAnnotation.getStaff());

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Corp corpBySetter=(Corp) context.getBean("corpBySetter");
        System.out.println("设值装配"+corpBySetter.getCorpName()+corpBySetter.getStaff());

        Corp corpByConstructor=(Corp) context.getBean("corpConstructor");
        System.out.println("构造注入"+corpBySetter.getCorpName()+corpByConstructor.getStaff());


        System.out.println("Hello world!");
    }
}