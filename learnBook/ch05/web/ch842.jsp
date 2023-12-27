<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.liutao.www.Course" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  request.setAttribute("name", "null");
  request.setAttribute("name1", "andi");
%>
<h3>EL 表达式判断是否为空</h3>
${empty name}
<h2>条件运算</h2>
\${name == 'andi'?'Yes':'NO'}
<br>
${name == 'andi'?'Yes':'NO'}
<br>
\${name1 == 'andi'?'Yes':'NO'}
<br>
${name1 == 'andi'?'Yes':'NO'}

</body>
</html>
