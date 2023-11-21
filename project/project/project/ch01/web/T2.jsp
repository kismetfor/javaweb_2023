<%--
  Created by IntelliJ IDEA.
  User: 高明
  Date: 2023/9/14
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page errorPage="T2_exception.jsp" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      int age = Integer.parseInt("age");
      out.println("age is " + age);
    %>
</body>
</html>
