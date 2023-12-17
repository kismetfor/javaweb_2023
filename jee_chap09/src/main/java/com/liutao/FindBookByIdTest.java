package com.liutao;
// FindBookByIdTest.java

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindBookByIdTest {
    public static void main(String[] args) {
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("applicationContext1.xml");
        BookDao bookDao = appContext.getBean(BookDao.class);
        Book book = bookDao.findBookById(100);
        System.out.println(book);
    }
}
