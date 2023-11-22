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

<form action="/your-context-root/uploadServlet" method="post" enctype="multipart/form-data">
  <label for="file1">选择文件：</label>
  <input type="file" id="file1" name="file1"><br>

  <label for="file2">选择文件：</label>
  <input type="file" id="file2" name="file2"><br>

  <!-- 添加更多文件上传的input -->

  <input type="submit" value="上传">
</form>
</body>
</html>
