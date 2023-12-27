<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${empty param.score}" var="result">
    <h3>&lt;c:choose&gt; 条件选择标签</h3>
    <form action="" name="form1" method="post">
        成绩: <input name="score" type="text" id="score"><br />
        <input type="submit" value="查询">
    </form>
</c:if>
<%--<c:if test="${not empty result}">--%>
<c:if test="${!result}">
    <c:choose>
        <c:when test="${param.score>=90 && param.score<=100}">优秀!</c:when>
        <c:when test="${param.score>=70 && param.score<90}">良好!</c:when>
        <c:when test="${param.score>=0 && param.score<60}">不及格!</c:when>
        <c:when test="${param.score>=60 && param.score<70}">及格!</c:when>
        <c:otherwise>成绩无效!</c:otherwise>
    </c:choose>
</c:if>

</body>
</html>
