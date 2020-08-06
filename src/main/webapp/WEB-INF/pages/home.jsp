<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 05-08-2020
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<hr>
<section>
    <form:form modelAttribute="listCountry" action="home" method="get" >
        <label for="contry">Choose a Country:</label>
        <select name="name" id="contry">
            <option  value="global">Global</option>
            <c:forEach items="${listCountry}" var="contry">
            <option  value="${contry}">${contry}</option>
            </c:forEach>
        </select>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>

    <h3>${data}</h3>
</section>
</body>
</html>
