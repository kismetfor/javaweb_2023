<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.liutao.jstl.Person" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<li><c:out value="out输出示例"></c:out></li>
<h4>&lt;c:set&gt; Variable Setting Tag Example</h4>

<ul>
<li>
    把一个值放入 session 中。
    <c:set value="apple" var="name1" scope="session"></c:set>
</li>
<li>
    从 session 中获得值: ${sessionScope.name1}
</li>
<li>
    把另一个值放入 application 中。
    <c:set var="name2" value="watch" scope="application"></c:set>
</li>
<li>
<%--使用 <c:out> 标签和 EL 表达式嵌套获得值:--%>
    <c:out value="${applicationScope.name2}">未指定作用域的值</c:out>
    </li>
    </ul>

    <h4>&lt;c:set&gt; 设置 JavaBean 的属性</h4>
    <%
        // 在 JavaBean 中设置属性值
        Person person = new Person();
        person.setName("vincent");
        person.setAge(25);
        person.setSex("男");
    %>

    <c:set target="${person}" property="name" value="vincentx"></c:set>
    <c:set target="${person}" property="age" value="25"></c:set>
    <c:set target="${person}" property="sex" value="男"></c:set>

    <p>使用的目标对象为: ${person}</p>
    <p>从 Bean 中得到的 name 值为: ${person.name}</p>
    <p>从 Bean 中得到的 age 值为: ${person.age}</p>
    <p>从 Bean 中得到的 sex 值为: ${person.sex}</p>
</body>
</html>
