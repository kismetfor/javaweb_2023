package com.yhgm.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:yanghua
 * Date:2023/10/2 14:24
 */
@WebServlet(value = "/Step2Servlet", initParams = {
        @WebInitParam(name = "username", value = "¸ßÃ÷yy"),
        @WebInitParam(name = "password", value = "123456")
})
public class Step2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Step2Servlet is running...");
        resp.setContentType("text/html;charset=UTF-8");
        String username = getServletConfig().getInitParameter("username");
        String password = getServletConfig().getInitParameter("password");
        resp.getWriter().println("username: " + username);
        resp.getWriter().println("password: " + password);
    }
}
