<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>ch252_1.jsp</h1>
<%
  String data = (String) request.getAttribute("forward文件数据");
  out.println("Data from forward 文件: " + data);
%>
</body>
</html>
