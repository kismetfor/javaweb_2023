<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/26
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>实验四</title>
  </head>
  <body>
  <h1>实验四 使用JDBC及EL、JSTL技术 </h1>
  <p>1．1．创建MySQL数据表bookstore (id,name／书名，author／作者，press／出版社，amount／数量）。</p>
  <p>要求：实现对数据表bookstore的增删改查操作。（可控制台演示结果）</p>
  <a href="http://localhost:8080/experiment4_war_exploded/DatabaseUtil">点击查询books中的所有书籍</a>
  <br>
  <br>
  <br>
  <a href="http://localhost:8080/experiment4_war_exploded/BuyServlet">点击购买书籍</a>
  <br>
  <br>
  <br>
  <a href="http://localhost:8080/experiment4_war_exploded/DeleteServlet">点击删除书籍</a>
  <br>
  <br>

  <p>2．参照教材案例，对数据表bookstore实现分页功能。</p>
  <p>要求：运用EL、JSTL技术对教材案例进行改写。</p>
  <a href="http://localhost:8080/experiment4_war_exploded/Step2Servlet">点击跳转step2</a>

  </body>
</html>
