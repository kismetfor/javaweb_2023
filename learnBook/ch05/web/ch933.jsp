<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/27
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>&lt;c:remove&gt; Variable Removal Tag Example</h4>
<c:set var="name1" value="zhyuxiao" />
<li>
    remove 之前 name1 的值:<c:out value="${name1}" default="空"/>
</li>

<c:remove var="name1" />

<li>
    remove 之后 name1 的值:<c:out value="${name1}" default="空" />
</li>

</body>
</html>
