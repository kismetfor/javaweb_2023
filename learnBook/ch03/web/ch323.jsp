<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.nio.charset.StandardCharsets" %><%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ch323</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();

    if(cookies != null && cookies.length > 0) {
        out.println("<h2>获取Cookie</h2>");

        for(int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            out.print("参数名:" + cookie.getName() + "<br>");
            out.print("参数值:" + URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8) + "<br>");
            out.print("<br>");
        }
    } else {
        out.println("<p>没有发现 Cookie</p>");
    }
%>
</body>
</html>
