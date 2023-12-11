package com.servlet.rain.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.servlet.rain.database.BookManager;

@WebServlet("/BuyServlet")
public class BuyServlet extends HttpServlet {
    private BookManager bookManager;

    //通过初始化（init() 方法）创建了一个 BookManager 对象：
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
        out.println("<h2>购买图书</h2>");
        out.println("<form method=\"get\">");
        out.println("书名：<input type=\"text\" name=\"bookName\"><br>");
        out.println("作者：<input type=\"text\" name=\"author\"><br>");
        out.println("出版社：<input type=\"text\" name=\"press\"><br>");
        out.println("数量：<input type=\"number\" name=\"amount\"><br>");
        out.println("<input type=\"submit\" value=\"购买\">");
        out.println("</form>");

        // 如果是表单提交，则处理购买操作
        String bookName = request.getParameter("bookName");
        String author = request.getParameter("author");
        String press = request.getParameter("press");
        String amountStr = request.getParameter("amount");

        if (bookName != null && author != null && press != null && amountStr != null) {
            //调用 addBook 方法

            // 表单已提交，进行购买操作
            int amount = Integer.parseInt(amountStr);
            bookManager.addBook(bookName, author, press, amount);

            // 输出购买成功信息
            out.println("<h3>购买成功</h3>");
            out.println("<p>书名：" + bookName + "</p>");
            out.println("<p>作者：" + author + "</p>");
            out.println("<p>出版社：" + press + "</p>");
            out.println("<p>数量：" + amount + "</p>");
        }

        out.println("<br>");
        out.println("<a href=\"http://localhost:8080/experiment4_war_exploded/DatabaseUtil\">点击查询books中的所有书籍</a>");
        out.println("<br>");
        out.println("<a href=\"http://localhost:8080/experiment4_war_exploded/DeleteServlet\">点击删除书籍</a>");
        out.println("<br>");
        out.println("</body></html>");
    }
}
