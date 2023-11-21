// FileUploadServlet.java
package com.yourpackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // 获取上传的文件
        Part filePart = request.getPart("file");

        // 从请求头中获取文件名
        String fileName = getFileName(filePart);

        // 获取上传文件的输入流
        InputStream fileContent = filePart.getInputStream();

        // 保存文件到服务器端
        Files.copy(fileContent, Paths.get("path/to/upload/directory/" + fileName),
                StandardCopyOption.REPLACE_EXISTING);

        response.getWriter().println("File uploaded successfully.");
    }

    private String getFileName(final Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
