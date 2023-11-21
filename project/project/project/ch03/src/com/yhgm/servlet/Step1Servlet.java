package com.yhgm.servlet;

/**
 * Author:yanghua
 * Date:2023/10/13 8:14
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Step1Servlet")
public class Step1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (password == null || username == null) {
            response.getWriter().print("对不起，用户名或密码为空！");
            return;
        }
        if (!"123456".equals(password)) {
            response.getWriter().print("对不起，用户名或密码错误！");
            return;
        }
        response.getWriter().print("欢迎你：" + username + "</br>");
        response.getWriter().print("您的密码是：" + password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
