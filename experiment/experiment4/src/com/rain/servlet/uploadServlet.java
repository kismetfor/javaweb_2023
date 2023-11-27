package com.rain.servlet;


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
@MultipartConfig // ��������ע�⣬��Ȼ�޷�����part,��ʶΪ֧���ļ��ϴ�
public class uploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String savePath = request.getServletContext().getRealPath("web/WEB-INF/file");
        File f = new File(savePath);

        if (!f.exists())
            f.mkdirs();

        Collection<Part> parts = request.getParts();
        for (Part part : parts) {
            String filename = part.getName();
            part.write(savePath + File.separator + filename);
            part.delete();
        }
        PrintWriter writer = response.getWriter();
        writer.println("�ϴ��ɹ���");
        writer.flush();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}