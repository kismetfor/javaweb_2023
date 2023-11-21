<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/21
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Date"  %>
<%@page import="java.text.SimpleDateFormat" %>
<html>
  <head>
    <title>jsp_first.jsp</title>
  </head>
  <body>
  <%
    Date dNow = new Date();
    out.print("<h2 >" + dNow.toString() +"</h2");
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH mm ss");
    out.print("<h2" + ft.format(dNow) +"</h2>");
  %>
  </body>
</html>
