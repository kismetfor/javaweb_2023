<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/3
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Maven</title>
  </head>
  <body>
  <h2>实验五基于Maven项目完成Bean的实例化及装配内容：</h2>
  <p>1．创建Maven项目，完成项目环境的搭建；</p>
  <p>2.
    Bean的实例化和装配
    定义二个类：Employee{name（姓名）,workNumber（工号））和Corp [corpName（公司名）,staff（职员）)。其中，staff的类型为List<%--<Employee>--%>。</p>
  <p>要求：</p>
  <p>．分别用设值注入和构造注入完成对Corp类的装配，在测试类中通过输出实例查看装配的结果。</p>
  <p>．使用注解（Annotation）完成对Corp类的装配，测试装配结果。</p>
  <p>目的：</p>
  <p>．掌握bean的实例化及装配方法。</p>
  <p>注意和提示：可以考虑引入util约束；对Corp类staff属性至少注入2个值。</p>
  </body>
</html>
