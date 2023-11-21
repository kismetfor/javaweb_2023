<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/21
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>param</title>
</head>
<body>
<form action="" method="post" name="Form">
    用户名<input name="UserName" type="text" /><br/>
    密码<input name="UserPwd" type="text" /><br/>
    <input type="submit" value="登录"/>
</form>
<%
    // 当点击"登录"按钮时，提交表单到当前文件
    // 如果用户名和密码不为空，就转发到jsp_action_forword_b.jsp
    String s1 = request.getParameter("UserName");
    String s2 = request.getParameter("UserPwd");
    if(s1 != null && s2 != null && !"".equals(s1) && !"".equals(s2)) {
%>
<jsp:forward page="jsp_action_forword_b.jsp">
    <jsp:param name="Title" value="Param"/>
    <jsp:param name="Name" value="<%=s1%>"/>
    <jsp:param name="Pwd" value="<%=s2%>"/>
</jsp:forward>
<%
    }
%>

</body>
</html>
