package com.liutao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
public class TransactionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext1.xml");

        // 获取BookService实例
        BookService bookService = (BookService) applicationContext.getBean("bookService");

        List<Book> beforeRollback = bookService.getAllBooks();

        try {
            // 执行增加和更新操作
            Book newBook = new Book(123, "启动", "Author", "Press", 10);
            bookService.addBookAndThenUpdate(newBook);

            System.out.println("事务提交成功！");
        } catch (Exception e) {
            System.out.println("事务回滚，发生异常：" + e.getMessage());
        }

        // 检查数据库中的数据是否符合预期
        System.out.println("回滚以后");
        List<Book> afterRollback = bookService.getAllBooks();
        printBookList(afterRollback);
    }

    private static void printBookList(List<Book> books) {
        System.out.println("查询所有图书：");
        for (Book book : books) {
            System.out.println("ID: " + book.getId());
            System.out.println("Name: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Press: " + book.getPress());
            System.out.println("Amount: " + book.getAmount());
            System.out.println("-------------------------");
        }
    }
}

