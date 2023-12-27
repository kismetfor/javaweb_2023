<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.ServletContext" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ServletContext applica = request.getServletContext();

    // 获取当前Web应用程序的上下文路径
    out.println("当前Web应用程序的上下文路径: " + applica.getContextPath() + "<br>");

    // 获取Web服务器的版本信息
    out.println("当前Web服务器的版本信息: " + applica.getServerInfo() + "<br>");

    // 获取Servlet API的主版本号
    out.println("Servlet API的主版本号: " + applica.getMajorVersion() + "<br>");

    // 获取Servlet API的次版本号
    out.println("Servlet API的次版本号: " + applica.getMinorVersion() + "<br>");

    // 获取当前Web应用程序的名称
    out.println("当前Web应用程序的名称: " + applica.getServletContextName() + "<br>");
%>
</body>
</html>
