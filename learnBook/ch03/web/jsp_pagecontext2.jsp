<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Ch3PageContext作用域:</h3>
Value1: <%= pageContext.getAttribute("value1")%><br>
Value4: <%= pageContext.getAttribute("value4")%><br>
<%=pageContext.findAttribute("value1")%>
</body>
</html>
