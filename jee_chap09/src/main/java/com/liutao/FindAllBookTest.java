package com.liutao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FindAllBookTest {
    public static void main(String[] args) {
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("applicationContext1.xml");
        BookDao bookDao = appContext.getBean(BookDao.class);
        List<Book> books = bookDao.findAllBooks();
//        System.out.println(books);
        books.forEach(System.out::println);
    }
}