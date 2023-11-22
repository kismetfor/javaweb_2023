package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet1 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //TODO初始化方法
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理表单对象声明的get方法 客户端发送请求,有servelt的doGet方法请求
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理表单对象的method的post属性,数据提交到Servlet
    }
}
