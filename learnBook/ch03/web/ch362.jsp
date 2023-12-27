<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>管理输出缓冲区</h2>
<% out.println("out对象缓冲区内容:"); %><br>
缓冲大小:<%= out.getBufferSize() %><br>
剩余缓存大小:<%= out.getRemaining() %><br>
是否自动刷新:<%= out.isAutoFlush() %><br>

</body>
</html>
