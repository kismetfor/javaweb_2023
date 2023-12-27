<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>realpath=<%=pageContext.getServletContext().getRealPath("/")%></h3>
<h3>info=<%=pageContext.getRequest().getParameter("info")%></h3>
</body>
</html>
