package com.yourpackage;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/your-package/AnotherServlet")
public class AnotherServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取ServletContext对象
        ServletContext context = getServletContext();

        // 从ServletContext中获取共享的数据
        String sharedData = (String) context.getAttribute("sharedData");

        // 输出共享的数据到浏览器页面
        response.getWriter().println("Data shared among servlets: " + sharedData);
    }
}
