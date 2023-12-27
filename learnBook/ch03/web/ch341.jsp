<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--设置Session属性：--%>
<%
  session.setAttribute("name", "创建session");
  session.setAttribute("info", "保存数据到session");
%>
<h3>session示例</h3>
<%
    out.print(session.getAttribute("info")+ "<br>");
    out.print(session.getAttribute("name")+ "<br>");
    out.print(session.getId());
%>
<h3>测试remove</h3>
<%
    session.removeAttribute("info");
    out.print("info remove  "+ session.getAttribute("info")+ "<br>");
    out.print("name  "+ session.getAttribute("name")+ "<br>");
%>
</body>
</html>
