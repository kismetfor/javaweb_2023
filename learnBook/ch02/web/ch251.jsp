<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" flush="true"/>
<%--flush="true" 的设置表示在包含的页面执行完毕后，
将缓冲区中的内容立即刷新输出到客户端，而不等到整个页面执行完毕--%>
<h2>jsp:include</h2>
<p>在 JSP 中，jsp:include>
  标签用于包含其他页面的内容，类似于传统的 include 功能。
  这使得可以在一个 JSP 页面中引用并包含另一个 JSP 页面的内容</p>
<jsp:include page="footer.jsp"/>
</body>
</html>
