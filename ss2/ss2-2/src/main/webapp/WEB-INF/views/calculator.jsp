<%--
  Created by IntelliJ IDEA.
  User: hotruongan
  Date: 19/05/2023
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calculator</title>
</head>
<body>
<h1> Calculator</h1>
<form>
    <label>number 1</label>
    <input type="number" name="number1">
    <label>number 2</label>
    <input type="number" name="number2">
    <br>
    <div>
        <button type="submit" name ="calculator" value="addition">Addition(+)</button>
        <button type="submit" name ="calculator" value="subtraction">Subtraction(-)</button>
        <button type="submit" name ="calculator" value="multiplication">Multiplication(x)</button>
        <button type="submit" name ="calculator" value="division">Division(/)</button>
    </div>
</form>
<h2>Result = ${result}</h2>


</body>
</html>
