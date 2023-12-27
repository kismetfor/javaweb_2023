package com.han.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {

    private static final String SAVE_DIRECTORY = "/Users/rain/Desktop/javaweb/experiment/experiment3/web/file";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        File fileSaveDir = new File(SAVE_DIRECTORY);

        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }

        Collection<Part> parts = request.getParts();
        for (Part part : parts) {
            String fileName = getSubmittedFileName(part);

            if (fileName != null && !fileName.isEmpty()) {
                part.write(fileSaveDir + File.separator + fileName);
            }
        }

        PrintWriter writer = response.getWriter();
        writer.println("上传成功");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private String getSubmittedFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                String fileName = content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
                // 处理文件名，确保安全性，例如防止包含路径信息
                fileName = new File(fileName).getName();
                return fileName;
            }
        }
        return null;
    }
}
