<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.servlet.jsp.PageContext" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<%
  // 在 PAGE_SCOPE 中设置属性值
  pageContext.setAttribute("value1", "11", PageContext.PAGE_SCOPE);
  // 在 REQUEST_SCOPE 中设置属性值
  pageContext.setAttribute("value2", "22", PageContext.REQUEST_SCOPE);
  // 在 SESSION_SCOPE 中设置属性值
  pageContext.setAttribute("value3", "33", PageContext.SESSION_SCOPE);
  // 在 APPLICATION_SCOPE 中设置属性值
  pageContext.setAttribute("value4", "44", PageContext.APPLICATION_SCOPE);

  // 转发到另一个页面
  pageContext.forward("jsp_pagecontext2.jsp?info=张三zhangsan@gmail.com");
%>
</body>
</html>
