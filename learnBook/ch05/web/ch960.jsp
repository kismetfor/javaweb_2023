<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> position = new ArrayList<String>();
    position.add("大数据开发工程师");
    position.add("大数据平台架构师");
    position.add("数据仓库工程师");
    position.add("ETL工程师");
    position.add("软件架构师");
    request.setAttribute("positions", position);
%>

<b><c:out value="全部查询"></c:out></b><br>
<c:forEach items="${positions}" var="pos">
    <c:out value="${pos}"></c:out><br>
</c:forEach>

<br><br>
<li>
    <b><c:out value="部分查询(begin 和 end 的使用)"></c:out></b><br>
    <c:forEach items="${positions}" var="pos" begin="1" end="3" step="2">
        <c:out value="${pos}"></c:out><br>
    </c:forEach>

    <b><c:out value="varstatus 属性的使用"></c:out></b><br>
    <c:forEach items="${positions}" var="item" begin="3" end="4" step="1" varStatus="s">
        <c:out value="${item}" />的4种属性:<br>
        总共已迭代的次数:<c:out value="${s.count}" /><br>
        所在位置(索引):<c:out value="${s.index}" /><br>
        是否为最后一个位置:<c:out value="${s.last}" /><br>
        是否为第一个位置:<c:out value="${s.first}" /><br>
    </c:forEach>
</li>
</body>
</html>
