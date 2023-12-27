<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>&lt;c:if&gt;条件判断标签</h3>

<c:if test = "${empty param.username}"
>
  <form name = "form" method="post">
    <label for="username"> 姓名: </label>
    <input type="text" name="username" id="username"><br>
    <input type="submit" name="submit" value="OK"><br>
  </form>
</c:if>
<c:if test="${'admin' == param.username}">
<%--<c:if test="${not empty param.username}">--%>
  <b>${param.username}</b> , 欢迎您!!!
</c:if>
<c:if test="${1==1}">
  <p>Hello World</p>
</c:if>
<c:if test="1==1">
  <p>Hello World2</p>
</c:if>
<c:if test="2==2">
  Hello World2==2
</c:if>
<c:if test="1==3">
  Hello World1==3
</c:if>
</body>
</html>
