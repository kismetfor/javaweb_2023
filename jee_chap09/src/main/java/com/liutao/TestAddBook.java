package com.liutao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddBook {
    public static void main(String[] args) {
        // 加载 Spring 配置文件
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        // 获取 BookDao 实例
        BookDao bookDao = appContext.getBean(BookDao.class);

        // 创建一个 Book 实例，用于插入数据库
        Book book = new Book();
        book.setName("Java编程思想");
        book.setAuthor("Bruce Eckel");
        book.setPress("机械工业出版社");
        book.setAmount(50);

        // 调用 BookDao 的添加方法
        int num = bookDao.addBook(book);

        // 判断插入是否成功
        if (num > 0) {
            System.out.println("成功插入了" + num + "条数据！");
        } else {
            System.out.println("插入操作执行失败！");
        }
    }
}
