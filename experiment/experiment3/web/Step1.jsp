<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/22
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Step1</title>
</head>
<body>
<form action="Step1Servlet" method="get">
  <table>
    <tr>
      <td>用户名：</td>
      <td><input type="text" name="username"></td>
    </tr>
    <tr>
      <td> 密码：</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td><input type="submit" value="登录"></td>
      <td><input type="reset" value="重置"></td>
    </tr>
  </table>
</form>
</body>
</html>
