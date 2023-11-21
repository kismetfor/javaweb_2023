<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/21
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>2.3.1 JSP表达式</title>
</head>
<body>
<%String name = "admin"; %>
姓名: <%= name %> <br>
5 + 6 = <%= 5+6 %> <br>
<p>
    <%String url = "test.jpg"; %>
    <img src="images/<%=url %>">
</p>
<p>
    今天的日期是: <%= (new java.util.Date()).toLocaleString()%>
</p>
</body>
</html>
