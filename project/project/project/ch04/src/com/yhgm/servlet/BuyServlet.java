package com.yhgm.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yhgm.database.DBUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/buyServlet")
public class BuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        // 从请求体中获取JSON数据
        StringBuilder requestData = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            requestData.append(line);
        }

        // 解析JSON数据
        JSONObject json = JSON.parseObject(requestData.toString());
        String id = json.getString("id");

        DBUtils dbUtils = new DBUtils();
        dbUtils.buyBook(Integer.valueOf(id));

        // 构建响应JSON
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("code", "1");
        String jsonResponseStr = JSON.toJSONString(jsonResponse, SerializerFeature.WriteMapNullValue);
        response.getWriter().print(jsonResponseStr);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
