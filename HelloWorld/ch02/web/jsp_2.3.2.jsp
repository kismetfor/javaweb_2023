<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/21
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>2.3.2 声明标识</title>
</head>
<body>
<%!
    int number = 0; //全局变量
    int count(){
        number++;
        return number;
    }
%>
<p>
    页面刷新的次数: <%= count() %>
</p>
</body>
</html>
