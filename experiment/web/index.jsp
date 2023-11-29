<%--
  Created by IntelliJ IDEA.
  User: rain
  Date: 2023/11/21
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <style>
    body {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
      background-color: #f5f5f5; /* Set a background color for the entire page */
    }

    h1 {
      text-align: center;
      color: #333; /* Set the color of the heading */
    }

    table {
      border-collapse: collapse;
      width: 50%;
      margin-top: 20px; /* Add some spacing at the top */
    }

    th, td {
      padding: 10px;
      text-align: center;
    }

    th {
      background-color: #3498db; /* Set the background color for header cells */
      color: #fff; /* Set the text color for header cells */
    }

    a {
      text-decoration: none; /* Remove underline from links */
      color: #e74c3c; /* Set the color of the links */
      font-size: 20px; /* Set the font size of the links */
      font-weight: bold; /* Make the links bold */
      transition: color 0.3s; /* Add a smooth color transition on hover */
    }

    a:hover {
      color: #c0392b; /* Change the color on hover */
    }
  </style>
  <title>javaweb实验跳转</title>
</head>
<body>
<h1>大佐的实验</h1>
<table>
  <tr>
    <th>实验名称</th>
    <th>链接</th>
  </tr>
  <tr>
    <td>实验二</td>
    <td><a href="http://localhost:8080/experiment2_war_exploded/">跳转</a></td>
  </tr>
  <tr>
    <td>实验2</td>
    <td><a href="http://localhost:8080/experiment2_war_exploded/">跳转</a></td>
  </tr>
  <tr>
    <td>实验3</td>
    <td><a href="http://localhost:8080/experiment3_war_exploded/">跳转</a></td>
  </tr>
  <tr>
    <td>实验四</td>
    <td><a href="http://localhost:8080/experiment4_war_exploded/">跳转</a></td>
  </tr>
</table>
</body>
</html>
