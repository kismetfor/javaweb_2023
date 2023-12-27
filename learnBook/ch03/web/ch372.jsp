<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  javax.servlet.ServletConfig config1 = getServletConfig();

  // 输出 Servlet 的名称
  out.println("ServletName: " + config1.getServletName() + "<br>");

  // 输出配置参数的值
  out.println("Name Configuration Parameter: " + config1.getInitParameter("name") + "<br>");
  out.println("Age Configuration Parameter: " + config1.getInitParameter("age") + "<br>");
%>
</body>
</html>
