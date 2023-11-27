package com.rain.servlet;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yhgm.database.DBUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        // ���������л�ȡJSON����
        StringBuilder requestData = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            requestData.append(line);
        }

        // ����JSON����
        JSONObject json = JSON.parseObject(requestData.toString());
        String id = json.getString("id");

        DBUtils dbUtils = new DBUtils();
        dbUtils.deleteBook(Integer.valueOf(id));

        // ������ӦJSON
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("code", "1");
        String jsonResponseStr = JSON.toJSONString(jsonResponse, SerializerFeature.WriteMapNullValue);
        System.out.println(jsonResponseStr);
        response.getWriter().print(jsonResponseStr);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}