package com.experiment.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import java.io.IOException;

@WebServlet("/Step3Servlet")

public class Step3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.getRequestDispatcher("/Servlet1").include(req, resp);
        req.getRequestDispatcher("/Servlet2").include(req, resp);
        req.getRequestDispatcher("/Step2Servlet").include(req, resp);

        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}