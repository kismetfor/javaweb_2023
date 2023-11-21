package com.yourpackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/your-package/ReadParametersServlet")
public class ReadParametersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 禁用浏览器缓存
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");

        // 从 ServletContext 属性中获取参数
        String username = (String) getServletContext().getAttribute("username");
        String password = (String) getServletContext().getAttribute("password");
        //之前使用的getParameter不行

        response.getWriter().println("GET Request - Username: " + username);
        response.getWriter().println("GET Request - Password: " + password);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 处理 POST 请求的逻辑
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 将参数存储在 ServletContext 属性中
        getServletContext().setAttribute("username", username);
        getServletContext().setAttribute("password", password);

        response.getWriter().println("POST Request - Username: " + username);
        response.getWriter().println("POST Request - Password: " + password);
    }
}
