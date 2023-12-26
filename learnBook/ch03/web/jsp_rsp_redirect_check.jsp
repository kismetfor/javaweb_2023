<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("username");
    String pawd = request.getParameter("password");

    if ("admin".equals(name) && "admin".equals(pawd)) {
        response.sendRedirect("jsp_rsp_redirect_prompt.jsp?username="+name);
    } else {
        out.println("用户名或密码错误!");
    }
%>
</body>
</html>
