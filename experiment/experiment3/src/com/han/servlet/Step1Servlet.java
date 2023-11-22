package com.han.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Step1Servlet")
public class Step1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //终于解决乱码问题了
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (password == null || username == null) {
            response.getWriter().print("请输入用户名和密码！");
            return;
        }
        if (!"123456".equals(password)) {
            response.getWriter().print("用户名或密码错误！");
            return;
        }
        response.getWriter().print("欢迎您：" + username + "<br/>");
        response.getWriter().print("您的密码是：" + password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        response.setContentType("text/html;charset=UTF-8");
    }
}
