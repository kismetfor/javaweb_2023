<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>

<html>
<head>
  <title>Error Page</title>
</head>
<body>

<h1>An error occurred:</h1>
<%
  try {
    String errorMessage = exception.getMessage();
    out.print(errorMessage);
  } catch (Exception e) {
    out.println("直接访问该页面没有错误信息");
    out.println("访问到错误页面才会重定向");
  }
%>
</body>
</html>
