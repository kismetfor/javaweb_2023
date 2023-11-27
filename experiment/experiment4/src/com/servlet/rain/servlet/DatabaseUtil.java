package com.servlet.rain.servlet;

//数据库连接

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DatabaseUtil")
public class DatabaseUtil extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // 显式注册MySQL JDBC驱动程序
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            out.println("MySQL JDBC驱动程序未找到");
            e.printStackTrace(out);
            return;
        }

        // JDBC连接参数
        String url = "jdbc:mysql://localhost:3306/bookstore?useSSL=false&serverTimezone=GMT";
        String user = "root";
        String password = "3345576297ltLT";

        try {
            // 步骤1: 加载数据库驱动程序（可以省略）数据库连接的对象
//              Class.forName("com.mysql.cj.jdbc.Driver");

            // 步骤2: 创建数据库连接
            Connection connection = DriverManager.getConnection(url, user, password);

            // 步骤3: 创建并执行SQL查询
            String query = "SELECT * FROM books";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // 步骤4: 处理查询结果
            out.println("<html><body><h2>Books in Bookstore:</h2><ul>");
            while (resultSet.next()) {
                String bookName = resultSet.getString("name");
                out.println("<li>" + bookName + "</li>");
            }
            out.println("</ul></body></html>");

            // 步骤5: 关闭连接
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(out);
        }
    }
}