package com.liutao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class TestJdbcTemplate {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        JdbcTemplate jdTemplate = (JdbcTemplate) appContext.getBean("jdbcTemplate");
//        jdTemplate.execute("CREATE TABLE books1 ("
//                + "id INT AUTO_INCREMENT PRIMARY KEY,"
//                + "name VARCHAR(255),"
//                + "author VARCHAR(255),"
//                + "press VARCHAR(255),"
//                + "amount INT"
//                + ")");
//        System.out.println("表books1创建成功！");


        // 修复 SQL 语句和属性值问题
        jdTemplate.execute("insert into books(id, name, author, press, amount) values (88, '男人的自我修养', '张宇小', '西华师范大学出版社', 3)");
        System.out.println("books表添加数据成功！");
    }
}

