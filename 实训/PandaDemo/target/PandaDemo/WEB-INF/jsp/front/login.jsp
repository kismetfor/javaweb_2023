<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2024/1/3
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewpoint" content="width=device-width, initial-scale=1.0">
    <title>大佐旅行网</title>
    <link rel="stylesheet" href="/css/loginRegister.css">
</head>
<body>
<div class="panda_container">
    <div class="panda_login">
        <div class="panda_login_bg">
            <img src="/imgs/loginRegister/login_bg.jpg" alt="">
        </div>
        <div class="panda_login_box">
            <div class="panda_login_form">
                <h2 class="login_title">
                    大佐旅游网账号登录
                </h2>
                <form action="/LoginServlet" method="post">
                    <ul class="panda_form">
                        <c:if test="${requestScope.error != null}">
                            <li>
                            <span style="color: red;text-align: center">
                            ${requestScope.error}
                            </span>
                            </li>
                        </c:if>
                        <li>
                            <input type="text" name="username" class="panda_form_input" placeholder="输入用户名">
                        </li>
                        <li>
                            <input type="password" name="password" class="panda_form_input" placeholder="输入密码">
                        </li>
                        <input type="submit" value="点击登录" class="login_submit">
                    </ul>
                </form>
                <a href="" class="go_register">没有账号? 点击免费注册</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
