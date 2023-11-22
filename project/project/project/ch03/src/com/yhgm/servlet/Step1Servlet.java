package com.yhgm.servlet;

/**
 * Author:yanghua
 * Date:2023/10/13 8:14
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebServlet("/Step1Servlet")
public class Step1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (password == null || username == null) {
            response.getWriter().print("�Բ����û���������Ϊ�գ�");
            return;
        }
        if (!"123456".equals(password)) {
            response.getWriter().print("�Բ����û������������");
            return;
        }
        response.getWriter().print("��ӭ�㣺" + username + "</br>");
        response.getWriter().print("���������ǣ�" + password);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
