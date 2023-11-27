package com.experiment.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("this is from servlet2");
        // 获取ServletContext对象
        ServletContext context = getServletContext();

        // 获取共享数据
        String sharedData = (String) context.getAttribute("sharedData");

        response.getWriter().println("Servlet2 receive data: " + sharedData);
    }
}
