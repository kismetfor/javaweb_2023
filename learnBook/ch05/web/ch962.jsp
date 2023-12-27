<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body><h4>使用·，作为分隔符</h4>
<c:forTokens var="token" items="望庐山瀑布李白 日照香炉生紫烟,遥看瀑布挂前川。飞流
直下三千尺，疑是银河落九天。" delims="·">
    &nbsp;&nbsp;<c:out value="${token}"/><br>
</c:forTokens>
<h4>使用''、∴，'、'。'一起做分隔符</h4>
<c:forTokens var="token" items="望庐山瀑布 李白日照香炉生紫烟,遥看瀑布挂前川。飞流
直下三千尺，疑是银河落九天。" delims="''、∴，'、'。'">
    &nbsp;&nbsp;<c:out value="${token}"/><br>
</c:forTokens>
<h4>begin和end范围设置</h4>
<c:forTokens var="token" items="望庐山瀑布李白 日照香炉生紫烟,遥看瀑布挂前川。飞流
直下三千尺，疑是银河落九天。" delims="，。" varStatus="s" begin="2" end="5">
    &nbsp;&nbsp;<c:out value="${token}"/><br>
</c:forTokens>

</body>
</html>
