<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String name = request.getParameter("username");
  out.println("登录成功，欢迎您 " + name);
%>
</body>
</html>
