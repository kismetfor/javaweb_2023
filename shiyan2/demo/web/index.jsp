<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/13
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>index.jsp</h1>
<h2><a href="http://localhost:8080/demo_war_exploded/SharedDataServlet">SharedDataServlet</a></h2>
<h2><a href="http://localhost:8080/demo_war_exploded/AnotherServlet">AnotherServlet</a></h2>
<p>1．编写程序，利用ServletContext实现多个Servlet对象共享数据。</p>

<h2><a href="http://localhost:8080/demo_war_exploded/your-package/ReadParametersServlet">ReadParametersServlet</a></h2>
<p>2．编写一个Servlet，用注解方式创建二个参数：username和password，读取并输出这二个参数。</p>
<form action="http://localhost:8080/demo_war_exploded/your-package/ReadParametersServlet" method="post">
    Username: <label>
    <input type="text" name="username">
</label><br>
    Password: <label>
    <input type="password" name="password">
</label><br>
    <input type="submit" value="Submit">
</form>


<h2><a href="http://localhost:8080/demo_war_exploded/IndexDisplayServlet">IndexDisplayServlet</a></h2>
<p>编写一个类（Servlet)，该类能访问完几个Servlet（至少二个，可在同一包下）后，还能在浏览器地址栏中显示出index.jsp路径。</p>

</body>
</html>
