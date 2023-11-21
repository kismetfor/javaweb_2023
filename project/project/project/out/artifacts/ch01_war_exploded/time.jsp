
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%--
  Created by IntelliJ IDEA.
  User: 高明
  Date: 2023/9/21
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>时间</title>
</head>
<body>
<h2><%= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())%>  </h2>
<h3>
    <p class="tips">
    </p>
</h3>
</body>
<script>
    let tip = document.querySelector('.tips')
    time()
    setInterval(time,1000)

    function time() {
        let date = new Date()
        let hours = date.getHours()
        let min = date.getMinutes()
        let sec = date.getSeconds()

        hours = hours < 10 ? '0'+hours : hours
        min = min < 10 ? '0'+min : min
        sec = sec < 10 ? '0'+sec : sec
        tip.innerHTML = "动态更新时间：" + hours + ":" + min + ":" + sec
    }
</script>
</html>

