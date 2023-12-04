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
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            System.out.println("EmpServlet's doGet method is called.");

            String pPageSize = request.getParameter("pageSize");// 每页显示行数
            String pPageNum = request.getParameter("pageNum");// 当前显示页次

            int pageSize = pPageSize == null ? 5 : Integer.parseInt(pPageSize);
            int pageNum = pPageNum == null ? 1 : Integer.parseInt(pPageNum);

            System.out.println("pageSize: " + pageSize);
            System.out.println("pageNum: " + pageNum);

            request.setAttribute("pageSize", String.valueOf(pageSize));
            request.setAttribute("pageNum", String.valueOf(pageNum));

            // 新建 Dao 对象，获取 pageModel
            EmpDao client = new EmpDao();
            PageModel<EmpEntity> pageModel = client.queryEmpList(pageNum, pageSize);

            System.out.println("pageModel: " + pageModel);

            request.setAttribute("pageModel", pageModel);
            request.getRequestDispatcher("yourPage.jsp").forward(request, response);

        } catch (Exception e) {
            // 在控制台输出异常信息
            e.printStackTrace();

            // 在日志中记录异常信息
            Logger logger = Logger.getLogger("EmpServlet");
            logger.log(Level.SEVERE, "An exception occurred in EmpServlet", e);

            // 返回一个错误页面或者其他处理方式
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An unexpected error occurred.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}



