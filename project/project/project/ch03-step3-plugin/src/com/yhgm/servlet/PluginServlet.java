package com.yhgm.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class PluginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("pluginServlet is running...");
        resp.getWriter().print("pluginServlet is running...");
    }
}
