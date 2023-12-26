<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String data = "从forward文件传输过来的字符串数据";
  //使用请求转发将数据传输给另一个页面
  request.setAttribute("forward文件数据", data);
  //请求转发到目标页面
  request.getRequestDispatcher("/ch252_1.jsp").forward(request, response);
%>
</body>
</html>
