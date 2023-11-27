<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/22
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/UploadServlet" method="post" enctype="multipart/form-data">
  上传文件：<input type="file" name="file"> <input type="submit" value="上传">
</form>
</fieldset>
<br>
<fieldset>
  <legend>上传多个文件</legend>
  <form action="UploadServlet" method="post" enctype="multipart/form-data">
    上传文件：
    <input type="file" name="file1">
    <input type="file" name="file2">
    <input type="submit" value="上传">
</form>
</body>
</html>
