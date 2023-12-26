<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp_req_param</title>
</head>
<body>
<p>name: <%= request.getParameter("name")
%></p>
<p>sex: <%= request.getParameter("sex")
%></p>
<p>id: <%= request.getParameter("id")
%></p>
<p>pwd: <%= request.getParameter("pwd")
%></p>
</body>
</html>
