<%--
  Created by IntelliJ IDEA.
  User: hotruongan
  Date: 18/05/2023
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Currency Tranfer</h1>
<form action="/currency" method="post">
    <label> USD</label> <input type="number" name="usd">
    <br>
    <div>
    <button type="submit">calculate</button>
    </div>
</form>
<h1>result : ${result} VND</h1>

</body>
</html>
