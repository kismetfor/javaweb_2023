<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/21
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp_action_forword_b</title>
</head>
<body>
<%
    String strName = request.getParameter("UserName");
    String strPwd = request.getParameter("UserPwd");
    if (!"".equals(strName) && strName != null && !"".equals(strPwd) && strPwd != null) {
        out.println(strName + "您好，您的密码是：" + strPwd);
    } else {
        out.println("Welcome, Forword~~");
    }
%>

</body>
</html>
