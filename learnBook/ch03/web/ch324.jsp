<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>客户端信息：</h2>

<p>协议： <%= request.getProtocol() %></p>
<p>提交方式： <%= request.getMethod() %></p>
<p>地址 URL： <%= request.getRequestURL() %></p>
<p>客户端 IP 地址： <%= request.getRemoteAddr() %></p>
<p>客户端主机名： <%= request.getRemoteHost() %></p>
<p>脚本文件路径： <%= request.getServletPath() %></p>
<p>服务器端口号： <%= request.getServerPort() %></p>
<p>服务器名称： <%= request.getServerName() %></p>

<h2>HTTP 头信息：</h2>

<p>Host： <%= request.getHeader("host") %></p>
<p>User-Agent： <%= request.getHeader("user-agent") %></p>
<p>Accept-Language： <%= request.getHeader("accept-language") %></p>
<p>Accept： <%= request.getHeader("accept") %></p>

</body>
</html>
