package com.yhgm.servlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/check")
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        System.out.println("checkServlet is running...");
        ServletContext application = req.getServletContext();
        String userName = (String)application.getAttribute("username");
        String passWord = (String)application.getAttribute("password");

        PrintWriter out = resp.getWriter();
        if (userName == null || passWord == null) {
            out.write("对不起，用户名或密码为空！");
            return;
        }
        System.out.println("userName=" + userName);
        System.out.println("passWord=" + passWord);
        out.write("欢迎你：" + userName);
    }
}
