<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/12/25
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>FirstWeb</h1>

  <p>在IDEA中创建一个Web空项目firstWeb。</p>
  <p> 要求：能以地址(URL)http://localhost:8080/firstWeb/访问到项目首页</p>
  <p> 使用exception隐式对象创建异常处理页面，能查看异常发生时的异常信息。</p>
  <a href="http://localhost:8080/experiment1_war_exploded/triggerError.jsp">triggerError</a>
  <br>
  <a href="http://localhost:8080/experiment1_war_exploded/errorPage.jsp">errorPage</a>
  <p>  创建2个jsp文件：show.jsp和time.jsp。其中，time.jsp能显示当前系统时间。</p>
  <p>要求：在浏览器访问show.jsp页面时，显示“欢迎访问，现在的时间是：+ 当前时间”等信息。 </p>
  <a href="http://localhost:8080/experiment1_war_exploded/time.jsp">time.jsp</a>
  <p>     提示：2题至少需要创建2个页面，且需分别用到page指令中的isErrorPage、errorPage等属性。 </p>
  </body>
</html>
