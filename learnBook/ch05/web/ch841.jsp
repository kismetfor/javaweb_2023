<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.liutao.www.Student" %>
<%@ page import="com.liutao.www.Course" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "张宇小");
    request.setAttribute("age", 11);
%>
<h3>EL 获取简单数据</h3>
姓名: ${name}<br>
年龄: ${age}<br>
<%
    Student student = new Student("清华", 19, new Course(1, "大数据"));
    request.setAttribute("stu", student);
%>
<h3>EL 获取JavaBean对象</h3>
姓名: ${stu.name}<br>
年龄: ${stu.age}<br>
课程名字: ${stu.course.courseName}
</body>
</html>
