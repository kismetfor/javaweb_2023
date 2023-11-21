package com.yhgm.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:yanghua
 * Date:2023/10/7 15:15
 */
@WebServlet("/Step3Servlet")
public class Step3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.getRequestDispatcher("/login").include(req, resp);
        req.getRequestDispatcher("/check").include(req, resp);
        req.getRequestDispatcher("/Step2Servlet").include(req, resp);

        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
