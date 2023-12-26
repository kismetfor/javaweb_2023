<%@ page import="java.util.Locale" %><%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  Locale locale = request.getLocale();
  String str = "Other language!";

  if (locale.equals(Locale.US)) {
    str = "Welcome to my HomePage!";
  }

  if (locale.equals(Locale.CHINA)) {
    str = "欢迎光临我的个人主页!";
  }
%>
<h2>国际化示例：</h2>

<p><%= str %></p>
</body>
</html>
