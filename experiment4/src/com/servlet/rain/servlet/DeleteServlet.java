package com.servlet.rain.servlet;

import com.servlet.rain.database.BookManager;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.servlet.rain.database.BookManager;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    private BookManager bookManager;

    public void init() {
        bookManager = new BookManager();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");

        // 获取输出流
        PrintWriter out = response.getWriter();

        // 输出HTML表单
        out.println("<html><body>");
        out.println("<h2>删除图书</h2>");
        out.println("<form method=\"get\">");
        out.println("书籍ID：<input type=\"number\" name=\"bookId\"><br>");
        out.println("<input type=\"submit\" value=\"删除\">");
        out.println("</form>");

        // 如果是表单提交，则处理删除操作
        String bookIdStr = request.getParameter("bookId");

        if (bookIdStr != null) {
            // 表单已提交，进行删除操作
            int bookId = Integer.parseInt(bookIdStr);
            bookManager.deleteBook(bookId);

            // 输出删除成功信息
            out.println("<h3>删除成功</h3>");
            out.println("<p>书籍ID：" + bookId + "</p>");
        }

        out.println("<br>");
        out.println("<a href=\"http://localhost:8080/experiment4_war_exploded/DatabaseUtil\">点击查询books中的所有书籍</a>");
        out.println("<br>");



        out.println("</body></html>");
    }
}


