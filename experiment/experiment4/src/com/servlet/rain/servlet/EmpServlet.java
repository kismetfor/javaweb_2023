package com.servlet.rain.servlet;

import com.servlet.rain.database.EmpDao;
import com.servlet.rain.database.PageModel;
import com.servlet.rain.database.EmpEntity;
import com.servlet.rain.database.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String pPageSize = request.getParameter("pageSize");// 每页显示行数
        String pPageNum = request.getParameter("pageNum");// 当前显示页次

        int pageSize = pPageSize == null ? 10 : Integer.parseInt(pPageSize);
        int pageNum = pPageNum == null ? 1 : Integer.parseInt(pPageNum);

        request.setAttribute("pageSize", String.valueOf(pageSize));
        request.setAttribute("pageNum", String.valueOf(pageNum));

        //新建Dao对象，获取pageModel
        EmpDao client = new EmpDao();
        PageModel<EmpEntity> pageModel = client.queryEmpList(pageNum, pageSize);
        request.setAttribute("pageModel", pageModel);//前端获取这个值
        request.getRequestDispatcher("yourPage.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}


