<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  try {
    int number = 0;
    request.setAttribute("stat", "good");
    request.setAttribute("result", 100 / number);
  } catch (Exception e) {
    request.setAttribute("stat", "bad");
    request.setAttribute("result", "Page error!");
  }
%>
<jsp:forward page="jsp_req_attr_b.jsp"></jsp:forward>
</body>
</html>
