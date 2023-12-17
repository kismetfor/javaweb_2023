package com.liutao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUpdateBook {
    public static void main(String[] args) {
        // 加载 Spring 配置文件
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        // 获取 BookDao 实例
        BookDao bookDao = appContext.getBean(BookDao.class);

        // 创建一个 Book 实例，用于更新数据库中的记录
        Book book = new Book();
        book.setId(6);  // 设置要更新的书籍的ID
        book.setName("新的书名");
        book.setAuthor("新的作者");
        book.setPress("新的出版社");
        book.setAmount(100);

        // 调用 BookDao 的更新方法
        int num = bookDao.updateBook(book);

        // 判断更新是否成功
        if (num > 0) {
            System.out.println("成功修改了" + num + "条数据！");
        } else {
            System.out.println("修改操作执行失败！");
        }
    }
}
