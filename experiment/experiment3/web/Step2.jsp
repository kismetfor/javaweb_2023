<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/22
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>文件上传</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 20px;
    }

    fieldset {
      margin-bottom: 20px;
      border: 1px solid #ddd;
      padding: 10px;
      border-radius: 5px;
      background-color: #fff;
    }

    legend {
      font-weight: bold;
      color: #333;
    }

    form {
      margin-bottom: 10px;
    }

    input[type="file"] {
      margin-right: 10px;
    }

    input[type="submit"] {
      padding: 5px 10px;
      background-color: #4caf50;
      color: #fff;
      border: none;
      border-radius: 3px;
      cursor: pointer;
    }
  </style>
</head>
<body>

<fieldset>
  <legend>上传单个文件</legend>
  <form action="${pageContext.request.contextPath}/UploadServlet" method="post" enctype="multipart/form-data">
    上传文件：<input type="file" name="file"> <input type="submit" value="上传">
  </form>
</fieldset>

<fieldset>
  <legend>上传多个文件</legend>
  <form action="UploadServlet" method="post" enctype="multipart/form-data">
    上传文件：
    <input type="file" name="file1">
    <input type="file" name="file2">
    <input type="submit" value="上传">
  </form>
</fieldset>

</body>
</html>
