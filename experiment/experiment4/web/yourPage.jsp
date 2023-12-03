<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/30
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="com.servlet.rain.database.*" %>
<%@ page import="com.servlet.rain.servlet.*" %>
<%
  String pageSize = (String) request.getAttribute("pageSize");
  String pageNum = (String) request.getAttribute("pageNum");
  PageModel<EmpEntity> pageModel = (PageModel<EmpEntity>)request.getAttribute("pageModel");

  if (pageModel != null) {
    List<EmpEntity> list = pageModel.getList();
    pageContext.setAttribute("list", list);
    pageContext.setAttribute("pageSize", pageSize);
    pageContext.setAttribute("pageNum", pageNum);
    pageContext.setAttribute("pageModel", pageModel);
  }
%>
<%@ page import="java.util.logging.Logger" %>

<%
  Logger logger = Logger.getLogger("EmpServlet");
  logger.info("Entering yourPage.jsp...");

%>


<html>
<head>
  <title>图书列表</title>
</head>
<body>
<c:out value="PageModel.list size: ${pageModel.list.size()}"/>
<c:out value="PageModel.totalSize: ${pageModel.totalSize}"/>
<c:out value="PageModel.pageNum: ${pageModel.pageNum}"/>
<c:out value="PageModel.pageSize: ${pageModel.pageSize}"/>
<c:out value="PageModel.list: ${pageModel.list}" />


<table align="center">
  <tr>
    <td align="center" colspan="3">
      <h2>图书信息</h2>
    </td>
  </tr>
  <tr align="center">
    <td><b>图书Id</b></td>
    <td><b>作者</b></td>
    <td><b>出版社编号</b></td>
    <td><b>图书数量</b></td>
  </tr>
  <c:choose>
    <c:when test="${empty pageModel.list}">
      <tr>
        <td colspan="4" align="center">还没有任何数据！</td>
      </tr>
    </c:when>
    <c:otherwise>
      <c:forEach items="${pageModel.list}" var="emp">
        <tr>
          <td>${emp.id}</td>
          <td>${emp.author}</td>
          <td>${emp.press}</td>
          <td>${emp.amount}</td>
        </tr>
      </c:forEach>
    </c:otherwise>
  </c:choose>
</table>

<form name="form1" action="pageServlet" method="post">
  <table border="0" width="100%">
    <tr>
      <td align="left">
        <label for="pageSize">每页条数</label>
        <select name="pageSize" id="pageSize" onchange="this.form.submit();">
          <c:forEach items="${['10', '20', '30']}" var="size">
            <option value="${size}" <c:if test="${size == pageSize}">selected="selected"</c:if>>${size}</option>
          </c:forEach>

        </select>
      </td>
      <td align="right">
        <a href="#">首页</a>
        <a href="javascript:document.getElementById('pageNum').value='${pageModel.previousPageNum}';document.form1.submit();">上一页</a>
        <a href="javascript:document.getElementById('pageNum').value='${pageModel.nextPageNum}';document.form1.submit();">下一页</a>
        <a href="javascript:document.getElementById('pageNum').value='${pageModel.totalPages}';document.form1.submit();">尾页</a>
        <label for="pageNum">第</label>
        <select name="pageNum" id="pageNum" onchange="document.form1.submit();">
          <c:forEach var="i" begin="1" end="${pageModel.totalPages}">
            <option value="${i}" <c:if test="${i eq pageModel.pageNum}">selected="selected"</c:if>>${i}</option>
          </c:forEach>
        </select>
        <label for="pageNum">页</label>
      </td>
    </tr>
  </table>
</form>

</body>
</html>
