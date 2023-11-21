<%--
  Created by IntelliJ IDEA.
  User: 高明
  Date: 2023/10/13
  Time: 8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实现文件上传</title>
</head>
<body>
<fieldset>
    <legend>上传单个文件</legend>
    <form action="uploadServlet" method="post" enctype="multipart/form-data">
        上传文件：<input type="file" name="file"> <input type="submit" value="上传">
    </form>
</fieldset>
<br>
<fieldset>
    <legend>上传多个文件</legend>
    <form action="uploadServlet" method="post" enctype="multipart/form-data">
        上传文件：
        <input type="file" name="file1">
        <input type="file" name="file2">
        <input type="submit" value="上传">
    </form>
</fieldset>
<br>
</body>
</html>
