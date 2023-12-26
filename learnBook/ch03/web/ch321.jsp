<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/26
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<li>
    <a href="jsp_reg_param.jsp?name=张三李四&sex=man&id=" rel="external follow">访问请求参数</a>
<%--    通过 ? 后面的参数列表进行传递。各个参数使用 & 进行分隔。
在这个示例中，name 参数的值是"张三李四"，
sex 参数的值是"man"，而id 参数没有指定值。--%>

</li>
</body>
</html>
