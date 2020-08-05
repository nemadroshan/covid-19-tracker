<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 05-08-2020
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: red;text-align: center">Covid-19 Tracker Application</h1>
<form action="home" method="get">
  Conuntry :   <input type="text" name="name" >&nbsp;&nbsp;<input type="submit" value="send">
</form>

<h3>${data}</h3>
</body>
</html>
