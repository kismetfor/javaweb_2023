package com.rain.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

public class PServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        resp.getWriter().println("<html>");
        resp.getWriter().println("<head><meta charset=\"UTF-8\"></head>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("这是我的第一个插件");
        resp.getWriter().println("这是大佐的第一个插件");
        resp.getWriter().println("</body>");
        resp.getWriter().println("</html>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        this.doGet(req, resp);
    }
}
