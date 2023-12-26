<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp_action_forward_c</title>
</head>
<body>
<h1>jsp_action_forward_c</h1>
<%
    String strName = request.getParameter("Name");
    String strPwd = request.getParameter("Pwd");
    //实际上是通过参数名来获取参数的值，而不是通过 <jsp:param> 中定义的名称。
    if (!"".equals(strName) && strName != null && !"".equals(strPwd) && strPwd != null) {
%>
<%= strName %> 您好，您的密码是： <%= strPwd %>
Welcome, Forward~~
<%
    } else {
        // 处理参数为空的情况
        out.println("参数为空");
    }
%>

</body>
</html>
