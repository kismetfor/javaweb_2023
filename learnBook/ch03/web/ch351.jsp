<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="javax.servlet.ServletContext" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  ServletContext appcon = request.getServletContext();

  // 获取所有初始化参数的名字
  Enumeration<String> e = appcon.getInitParameterNames();

  // 遍历并输出初始化参数的名字和值
  while (e.hasMoreElements()) {
    String name = e.nextElement();
    String value = appcon.getInitParameter(name);
    out.println(name + ": " + value + "<br>");
  }
%>

</body>
</html>
