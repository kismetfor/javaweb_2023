<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 高明
  Date: 2023/9/21
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示时间</title>
</head>
<body>
    <%
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(d);
        request.setAttribute("nowTime", dateTime);
    %>
    <h2>欢迎访问，访问的时间是：</h2>
    <jsp:include page="time.jsp"/>
</body>
</html>
