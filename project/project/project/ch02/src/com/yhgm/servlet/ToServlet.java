package com.yhgm.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:yanghua
 * Date:2023/10/2 11:15
 */
@WebServlet("/login")
public class ToServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("loginServlet is running...");
        ServletContext sc = req.getServletContext();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username == null || password == null) {
            resp.getWriter().println("用户名或密码为空！");
            return;
        }
        sc.setAttribute("username", username);
        sc.setAttribute("password", password);
        req.getRequestDispatcher("/check").forward(req, resp);
    }
}
