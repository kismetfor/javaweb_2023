<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post" name="Form">
  <!-- 提交给本页处理 -->
  用户名<input name="UserName" type="text" /> <br/>
  密&nbsp;&nbsp;码 <input name="UserPwd" type="text" /> <br/>
  <input type="submit" value="登录" />
</form>

<%
  // 当单击“登录”按钮时，调用 Form.submit() 方法提交表单至本文件
  //用户名和密码均不为空时，跳转到jsp_action_forward_c.jsp，并且把用户名和密码以数形式传递
  String s1 = request.getParameter("UserName");
  String s2 = request.getParameter("UserPwd");
  //获取表单提交的用户名和密码。

  if (s1 != null && s2 != null && !"".equals(s1) && !"".equals(s2)) {
%>
<!-- 页面跳转，传递参数 -->
<jsp:forward page="jsp_action_forward_c.jsp">
  <jsp:param name="Title" value="Param" />
  <jsp:param name="Name" value="<%=s1%>" />
  <jsp:param name="Pwd" value="<%=s2%>" />
</jsp:forward>
<%
  }
%>

</body>
</html>
