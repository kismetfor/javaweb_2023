<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--禁用缓存是为了确保客户端每次都从服务器获取最新的数据，而不使用本地缓存。--%>
<%
  response.setHeader("Cache-Control", "no-store");
  response.setDateHeader("Expires", 0);
%>
<%--通过设置响应头的 "refresh" 参数，可以实现页面定时刷新。--%>
<%
  response.setHeader("refresh", "1"); // 刷新间隔为1秒
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  String now = sdf.format(new Date());
  out.println("当前时间: " + now);
%>
<%--定时跳转：--%>
<%--通过设置响应头的 "refresh" 参数，可以实现页面在一定时间后跳转到指定的URL。
下面的例子展示了9秒后自动跳转到 "index.jsp" 页面：--%>
<%
  response.setHeader("refresh", "9;URL=index.jsp");
%>
</body>
</html>
