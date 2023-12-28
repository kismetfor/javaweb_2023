package com.liutao.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet123")
public class Servlet123 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 将数值放入 request 属性中
        request.setAttribute("servletNumber", 200);

        // 转发到 JSP 页面
        request.getRequestDispatcher("/ch963.jsp").forward(request, response);
    }
}
