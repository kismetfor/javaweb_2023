package com.cn.controller;

import com.cn.entity.User;
import com.cn.service.UserService;
import com.cn.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        UserService userService = new UserServiceImpl();
        User user = userService.getUserByNameAndPass(username,password);
    }
}
