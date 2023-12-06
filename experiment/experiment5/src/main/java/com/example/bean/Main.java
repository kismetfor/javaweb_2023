// Main.java
package com.example.bean;

import com.example.bean.CorpConfig;
import com.example.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 使用Spring容器加载配置
        ApplicationContext context0 = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 通过Spring容器获取名为 "user" 的Bean
        User user = (User) context0.getBean("user");

        System.out.println(user);
        System.out.println("<----大作的实验五---->");


        // 使用注解配置加载Spring容器
        ApplicationContext context1 = new AnnotationConfigApplicationContext(CorpConfig.class);
        Corp cropByAnnotation=(Corp) context1.getBean("注解装配公司");
        System.out.println("注解装配: "+cropByAnnotation.getCorpName()+cropByAnnotation.getStaff());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Corp corpBySetter=(Corp) context.getBean("bySetter");
        System.out.println("设值装配: "+corpBySetter.getCorpName()+corpBySetter.getStaff());

        Corp corpByConstructor=(Corp) context.getBean("byConstructor");
        System.out.println("构造注入: "+corpBySetter.getCorpName()+corpByConstructor.getStaff());

    }
}