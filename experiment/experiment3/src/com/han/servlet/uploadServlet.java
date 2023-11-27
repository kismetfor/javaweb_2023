//package com.han.servlet;
//
//
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@WebServlet("/uploadServlet")
//@MultipartConfig // 必须加这个注解，不然无法解析part
//public class uploadServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String savePath = "/Users/rain/Desktop/javaweb/experiment/experiment3/web/file";
//        File f = new File(savePath);
//        if (!f.exists()) {
//            f.mkdirs();
//        }
//        Collection<Part> files = request.getParts();
//        for (Part part : files) {
//            String filename = part.getName();
//            part.write(savePath + File.separator + filename);
//            part.delete();
//        }
//        PrintWriter writer = response.getWriter();
//        writer.println("上传成功！");
//        writer.flush();
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
//    }