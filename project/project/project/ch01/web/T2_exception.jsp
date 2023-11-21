<%--
  Created by IntelliJ IDEA.
  User: 高明
  Date: 2023/9/14
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    错误提示为：<%=exception.getMessage() %> <br>
    错误信息为：<%=exception.toString() %> <br>
</body>
</html>
