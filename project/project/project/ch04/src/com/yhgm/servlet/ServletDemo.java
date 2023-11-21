package com.yhgm.servlet;

import com.yhgm.database.Book;
import com.yhgm.database.DBUtils;
import com.yhgm.database.PageModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/pageServlet")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        ServletContext sc = request.getServletContext();
        String ppage = request.getParameter("page");
        String ssize = request.getParameter("size");
        String isOk = request.getParameter("isOk");
        int p = 0;
        if (isOk != null) p = Integer.parseInt(isOk);
        String name = (String)sc.getAttribute("name");
        if (name == null) name = request.getParameter("name");
        String author = (String)sc.getAttribute("author");
        if (author == null) author = request.getParameter("author");
        String press = (String)sc.getAttribute("press");
        if (press == null) press = request.getParameter("press");

        if (p == 1) {
            name = request.getParameter("name");
            author = request.getParameter("author");
            press = request.getParameter("press");
        }
        int page = ppage == null ? 1 : Integer.parseInt(ppage);
        int size = ssize == null ? 5 : Integer.parseInt(ssize);

        request.setAttribute("page", page);
        request.setAttribute("size", size);
        DBUtils dbUtils = new DBUtils();
        if (name != null || author != null || press != null) {
            PageModel<Book> pageModel = dbUtils.getList(name, author, press, page, size);
            sc.setAttribute("name", name);
            sc.setAttribute("press", press);
            sc.setAttribute("author", author);
            request.setAttribute("pageModel", pageModel);
            request.getRequestDispatcher("showInfo.jsp").include(request, response);
            return;
        }
        PageModel<Book> pageModel = dbUtils.queryList(page, size);
        request.setAttribute("pageModel", pageModel);
        request.getRequestDispatcher("showInfo.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
