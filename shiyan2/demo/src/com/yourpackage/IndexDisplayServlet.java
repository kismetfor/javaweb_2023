package com.yourpackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import java.io.IOException;

@WebServlet("/your-package/IndexDisplayServlet")
public class IndexDisplayServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 使用 RequestDispatcher 来包含其他两个 Servlet

        // 获取ServletContext对象
        ServletContext context = getServletContext();

        // 在ServletContext中存储数据
        context.setAttribute("sharedData", "This data is shared among servlets.");

        // 包含第一个Servlet
        request.getRequestDispatcher("/your-package/FirstServlet").include(request, response);

        // 包含第二个Servlet
        request.getRequestDispatcher("/your-package/SecondServlet").include(request, response);

        // 等待5秒钟
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 重定向到index.jsp
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}
