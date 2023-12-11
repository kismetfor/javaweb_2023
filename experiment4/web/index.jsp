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

  <a href="http://localhost:8080/experiment4_Web_exploded/DatabaseUtil">点击查询books中的所有书籍</a>
  <br>
  <br>
  <br>
  <a href="http://localhost:8080/experiment4_Web_exploded/BuyServlet">点击购买书籍</a>
  <br>
  <br>
  <br>
  <a href="http://localhost:8080/experiment4_Web_exploded/DeleteServlet">点击删除书籍</a>
  <br>
  <br>

  <p>2．参照教材案例，对数据表bookstore实现分页功能。</p>
  <p>要求：运用EL、JSTL技术对教材案例进行改写。</p>
  <a href="http://localhost:8080/experiment4_Web_exploded/EmpServlet">EmpServlet</a> <br>

  <h2>实验七 Spring持久化操作及事务管理的实现 </h2>
  <p>内容：</p>
  <p>对实验四的数据表bookstore(id,name,author,press,amount）进行持久化操作及完成基于注解的事务管理。</p>
  <p>操作；</p>
  <p>. 使用基于注解的声明式事务管理方式来完成对数据表bookstore的事务管理（任选增删改一种）;</p>
  <p>测试事务管理的效果。</p>
  <p>目的：</p>
  <p>掌握基于JdbcTemplate的Spring持久化操作及基于注解的声明式事务管理。</p>
  </body>
</html>
