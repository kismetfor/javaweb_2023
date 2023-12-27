<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String visitCountKey = "visitCount";
  String userIDKey = "12345";
  String userID = "202113840218";
  int visitCount = 0;

  // 检查 session 中是否已经存在这些属性
  if (session.getAttribute(visitCountKey) != null) {
    visitCount = (int) session.getAttribute(visitCountKey);
    visitCount++;
  } else {
    session.setAttribute(userIDKey, userID);
  }

  // 更新访问次数到 session
  session.setAttribute(visitCountKey, visitCount);

  // 其他信息的获取
  String sessionId = session.getId();
  Date createTime = new Date(session.getCreationTime());
  Date lastAccessTime = new Date(session.getLastAccessedTime());

  // 格式化日期
  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  // 显示信息的代码
%>
<h3>Session 页面访问统计</h3>
<table border="1">
  <tr bgcolor="#949494">
    <th>Session 信息</th>
    <th>值</th>
  </tr>
  <tr>
    <td>id</td>
    <td><%= sessionId %></td>
  </tr>
  <tr>
    <td>创建时间</td>
    <td><%= df.format(createTime) %></td>
  </tr>
  <tr>
    <td>最后访问时间</td>
    <td><%= df.format(lastAccessTime) %></td>
  </tr>
  <tr>
    <td>用户ID</td>
    <td><%= userID %></td>
  </tr>
  <tr>
    <td>访问次数</td>
    <td><%= visitCount %></td>
  </tr>
</table>

</body>
</html>
