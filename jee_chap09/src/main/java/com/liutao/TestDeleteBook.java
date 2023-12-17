package com.liutao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeleteBook {
    public static void main(String[] args) {
        // 加载 Spring 配置文件
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        // 获取 BookDao 实例
        BookDao bookDao = appContext.getBean(BookDao.class);

        // 调用 BookDao 的删除方法，删除书籍ID为88的记录
        int num = bookDao.deleteBook(88);

        // 判断删除是否成功
        if (num > 0) {
            System.out.println("成功删除了" + num + "条数据！");
        } else {
            System.out.println("删除操作执行失败！");
        }
    }
}
