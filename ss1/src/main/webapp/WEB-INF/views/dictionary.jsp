<%--
  Created by IntelliJ IDEA.
  User: hotruongan
  Date: 18/05/2023
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Dictionary</h1>
<form action="/dictionary" method="post">
    <label>English word</label>
    <input type="text" name="words">
    <br>
    <button type="submit">translate</button>
</form>
<p>vietnamese means is : ${result}</p>



</body>
</html>
