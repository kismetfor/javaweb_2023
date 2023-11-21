package com.yhgm.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@WebServlet("/uploadServlet")
@MultipartConfig // ��������ע�⣬��Ȼ�޷�����part
public class uploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String savePath = "D:/Yh/JavaWeb/ʵ���/project/ch03/web/file";
        File f = new File(savePath);
        if (!f.exists()) {
            f.mkdirs();
        }
        Collection<Part> files = request.getParts();
        for (Part part : files) {
            String filename = part.getName();
            part.write(savePath + File.separator + filename);
            part.delete();
        }
        PrintWriter writer = response.getWriter();
        writer.println("�ϴ��ɹ���");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
