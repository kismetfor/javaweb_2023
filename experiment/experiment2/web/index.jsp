<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/21
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>实验二 Servlet技术的使用</h1>
  <p>1．编写程序，利用ServletContext实现多个Servlet对象共享数据。</p>
  <a href="http://localhost:8080/experiment2_war_exploded/Servlet1">点击跳转Servlet1</a>
  <a href="http://localhost:8080/experiment2_war_exploded/Servlet2">点击跳转Servlet2</a>
  <p>2．编写一个Servlet，用注解方式创建二个参数：username和password，读取并输出这二个参数。</p>
  <p>3．编写一个类（Servlet)，该类能访问完几个Servlet（至少二个，可在同一包下）后，还能在浏览器地址栏中显示出index.jsp路径。</p>
  <p>提示：3题可考虑先请求包含（RequestDispatcher对象的include(）方法）,再重定向。完成实验至少需要学完教材第六章。</p>
  <p>要求：使用注解配置所有问题的Servlet。</p>
  </body>
</html>
