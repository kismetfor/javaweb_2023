<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="com.servlet.rain.database.*" %>
<%@ page import="com.servlet.rain.servlet.*" %>
<%-- Import Bootstrap CSS for styling --%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<%
  String pageSize = (String) request.getAttribute("pageSize");
  String pageNum = (String) request.getAttribute("pageNum");
  @SuppressWarnings("unchecked")
  PageModel<EmpEntity> pageModel = (PageModel<EmpEntity>) request.getAttribute("pageModel");
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
  <script>
    function updatePageNum(newPageNum) {
      document.getElementById('pageNum').value = newPageNum;
      document.form1.submit();
    }
  </script>
  <%-- Add some simple Bootstrap styling --%>
  <style>
    body {
      padding: 20px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-bottom: 20px;
    }

    table, th, td {
      border: 1px solid #dee2e6;
    }

    th, td {
      padding: 10px;
      text-align: left;
    }

    th {
      background-color: #007bff;
      color: white;
    }

    td {
      background-color: #f8f9fa;
    }

    .pagination {
      display: flex;
      justify-content: center;
      align-items: center;
      margin-top: 20px;
    }

    .pagination a {
      padding: 10px;
      margin: 0 5px;
      text-decoration: none;
      color: #007bff;
      background-color: #ffffff;
      border: 1px solid #007bff;
      border-radius: 5px;
    }

    .pagination a:hover {
      background-color: #007bff;
      color: #ffffff;
    }

    .current-page {
      font-weight: bold;
      background-color: #007bff;
      color: #ffffff;
    }
  </style>
</head>
<body>
<table class="table">
  <thead>
  <tr>
    <th>图书id</th>
    <th>作者</th>
    <th>出版社编号</th>
    <th>图书数量</th>
  </tr>
  </thead>
  <tbody>
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
  </tbody>
</table>
<form name="form1" action="EmpServlet" method="post">
  <table border="0" width="100%">
    <tr>
      <td align="left">
        <label for="pageSize">每页条数</label>
        <select name="pageSize" id="pageSize" onchange="this.form.submit();">
          <c:forEach items="${['5', '10', '15']}" var="size">
            <option value="${size}" <c:if test="${size == pageSize}">selected="selected"</c:if>>${size}</option>
          </c:forEach>
        </select>
      </td>
      <td align="right">
        <a href="#" onclick="updatePageNum(1)">首页</a>
        <a href="#" onclick="updatePageNum(${pageModel.previousPageNum})">上一页</a>
        <a href="#" onclick="updatePageNum(${pageModel.nextPageNum})">下一页</a>
        <a href="#" onclick="updatePageNum(${pageModel.totalPages})">尾页</a>
        <label for="pageNum">第</label>
        <select name="pageNum" id="pageNum" onchange="this.form.submit();">
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
