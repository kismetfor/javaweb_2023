<%@ page import="com.yhgm.database.PageModel" %>
<%@ page import="com.yhgm.database.User" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="javax.swing.text.DefaultStyledDocument" %>
<%@ page import="com.yhgm.database.Book" %><%--
  Created by IntelliJ IDEA.
  User: 高明
  Date: 2023/10/26
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示数据</title>
</head>
<%
    PageModel<Book> pageModel = (PageModel<Book>)request.getAttribute("pageModel");
    request.setAttribute("list", pageModel.getList());
    request.setAttribute("pageCount", pageModel.getTotalPages());
%>
<style>
    body {
        font-family: Arial, sans-serif;
    }

    table {
        width: 80%;
        margin: 0 auto;
        border-collapse: collapse;
        background-color: #fff; /* 白色背景 */
    }

    th, td {
        border: 1px solid #dddddd;
        text-align: center;
        padding: 8px;
    }
    /* 偶数行 */
    table tr:nth-child(even) {
        background-color: #f2f2f2; /* 浅灰色背景 */
    }

    /* 奇数行 */
    table tr:nth-child(odd) {
        background-color: #fff; /* 白色背景 */
    }

    th {
        background-color: #f2f2f2; /* 浅灰色表头背景 */
    }

    h2 {
        margin: 0;
        text-align: center;
        color: #333; /* 深灰色文本颜色 */
    }

    .button {
        cursor: pointer;
        background-color: #007bff; /* 蓝色按钮背景 */
        color: #fff; /* 白色文本颜色 */
    }

    .button.disabled {
        background-color: #ccc;
        cursor: not-allowed;
    }

    .flex-container {
        display: flex;
        justify-content: center;
        margin-top: 10px;
    }

    .flex-container a {
        margin: 0 5px;
    }

    .flex-container input[type="text"] {
        padding: 5px;
        margin: 0 5px;
        border: 1px solid #ccc; /* 浅灰色边框 */
        border-radius: 5px;
    }

    .flex-container input[type="button"] {
        background-color: #007bff; /* 蓝色按钮背景 */
        color: #fff; /* 白色文本颜色 */
        border: none;
        border-radius: 5px;
        padding: 5px 10px;
    }

    /* 添加书籍表单容器 */
    .add-book-container {
        display: flex;
        align-items: center;
        padding: 10px;
        border: 1px solid #ddd; /* 浅灰色边框 */
        border-radius: 5px;
        margin: 10px 0;
        background-color: #f9f9f9; /* 微灰色背景 */
    }

    /* 查询书籍表单容器 */
    .search-book-container {
        display: flex;
        align-items: center;
        padding: 10px;
        border: 1px solid #ddd; /* 浅灰色边框 */
        border-radius: 5px;
        background-color: #f9f9f9; /* 微灰色背景 */
    }

    /* 分割线样式 */
    hr {
        border: none;
        border-top: 1px solid #ccc; /* 浅灰色分割线 */
    }
</style>
<body>
<table>
    <tr>
        <td align="center" colspan="7">
            <h2>书籍信息</h2>
        </td>
    </tr>
    <!-- 表头行 -->
    <tr align="center">
        <th width="10%">序号</th>
        <th width="20%">书名</th>
        <th width="20%">作者</th>
        <th width="30%">出版社</th>
        <th width="5%">数量</th>
        <th width="10%" colspan="2">操作</th>
    </tr>
    <c:if test="${list == null || list.size() < 1}">
        <p align="center">还没有任何数据！</p>
    </c:if>
    <c:if test="${list != null}">
        <c:forEach items="${list}" var="book" varStatus="status">
            <tr align="center">
                <td>${((page - 1) * size) + status.index + 1}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.press}</td>
                <td>${book.amount}</td>
                <td>
                    <c:if test="${book.amount == 0}">
                        <input type="button" value="购买" style="cursor: pointer" disabled="disabled"/>
                    </c:if>
                    <c:if test="${book.amount != 0}">
                        <input type="button" value="购买" style="cursor: pointer" onclick="buyBook(${book.id})"/>
                    </c:if>
                </td>
                <td><input type="button" value="删除信息" style="cursor: pointer" onclick="deleteInfo(${book.id})"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table>

<form action="pageServlet" method="post" id="form1">
    <div class="flex-container">
        <a>每页条数</a>
        <select name="size"
                onchange="document.all.page.value='1';document.all.form1.submit()">
            <c:if test="${size == 5}">
                <option value="5" selected="selected">5</option>
            </c:if>
            <c:if test="${size != 5}">
                <option value="5">5</option>
            </c:if>
            <c:if test="${size == 10}">
                <option value="10" selected="selected">10</option>
            </c:if>
            <c:if test="${size != 10}">
                <option value="10">10</option>
            </c:if>
            <c:if test="${size == 20}">
                <option value="20" selected="selected">20</option>
            </c:if>
            <c:if test="${size != 20}">
                <option value="20">20</option>
            </c:if>
        </select>
    </div>
    <div class="flex-container">
        <a href="javascript:document.all.page.value='<%=pageModel.getTopPageNum()%>';document.all.form1.submit();">首页</a>
        <a href="javascript:document.all.page.value='<%=pageModel.getPreviousPageNum()%>';document.all.form1.submit();">上一页</a>
        <a href="javascript:document.all.page.value='<%=pageModel.getNextPageNum()%>';document.all.form1.submit();">下一页</a>
        <a href="javascript:document.all.page.value='<%=pageModel.getTotalPages()%>';document.all.form1.submit();">尾页</a>
        <a>第</a>
        <select name="page" onchange="document.all.form1.submit()">
            <c:forEach begin="1" end="${pageCount}" step="1" var="i">
                <c:if test="${page == i}">
                    <option value="${i}" selected = "selected" >
                            ${i}
                    </option>
                </c:if>
                <c:if test="${page != i}">
                    <option value="${i}" >
                            ${i}
                    </option>
                </c:if>
            </c:forEach>
        </select>
        <a>页</a>
    </div>
</form>

<hr />

<%--添加--%>
<div style="display: flex; flex-direction: column">
    <h2>添加书籍</h2>
    <div class="flex-container add-book-container">
        <input type="text" placeholder="请输入书名" id="bookName"/>
        <input type="text" placeholder="请输入作者" id="bookAuthor"/>
        <input type="text" placeholder="请输入出版社" id="bookPress"/>
        <input type="text" placeholder="请输入书籍数量" id="bookAmount"/>
        <input type="button" class="button" value="添加" onclick="addBook()"/>
    </div>
</div>
<hr />
<%--查询--%>
<div  style="display: flex; flex-direction: column">
    <h2>查询书籍</h2>
    <div class="flex-container search-book-container">
        <input type="text" placeholder="请输入书名" id="bookNameSel"/>
        <input type="text" placeholder="请输入作者" id="bookAuthorSel"/>
        <input type="text" placeholder="请输入出版社" id="bookPressSel"/>
        <input type="button" class="button" value="查询" onclick="queryBook()"/>
    </div>
</div>

<script src="./js/axios-0.18.0.js"></script>
<script>
    function queryBook() {
        let bookName = document.getElementById("bookNameSel").value
        let bookAuthor = document.getElementById("bookAuthorSel").value
        let bookPress = document.getElementById("bookPressSel").value
        const params = {
            name : bookName,
            author : bookAuthor,
            press : bookPress,
            isOk: 1
        }
        axios.get("pageServlet", {params}).then(resp=>{
            console.log(resp)
            document.body.innerHTML = resp.data
        })
    }
    function addBook() {
        let bookName = document.getElementById("bookName").value
        let bookAuthor = document.getElementById("bookAuthor").value
        let bookPress = document.getElementById("bookPress").value
        let bookAmount = document.getElementById("bookAmount").value
        if (bookName.trim() === "" || bookAuthor.trim() === "" || bookPress.trim() === "" || bookAmount.trim() === "") {
            alert("书籍信息未填写完成！")
            return
        }
        const data = {
            "name" : bookName,
            "author" : bookAuthor,
            "press": bookPress,
            "amount": bookAmount
        }
        axios.post("addServlet", data).then(resp=>{
            if (resp.data.code === "1") {
                alert("添加书籍成功！")
                window.location.reload()
            }
        })
    }
    function deleteInfo(id) {
        const confirmation = confirm("您确定要删除吗？")
        if (confirmation) {
            axios({
                method: 'post',
                url: "http://localhost:8080/content/ch04/deleteServlet",
                data: {
                    "id" : id
                }
            }).then((resp)=>{
                if (resp.data.code === "1") {
                    alert("删除成功！")
                    window.location.reload()
                }
            })
        } else {
            console.log('用户取消删除')
        }
    }
    function buyBook(id) {
        axios({
            method: 'post',
            url: "http://localhost:8080/content/ch04/buyServlet",
            data: {
                "id" : id
            }
        }).then(resp=>{
            if (resp.data.code === "1") {
                alert("购买成功！")
                window.location.reload()
            }
        })
    }
</script>
</body>
</html>
