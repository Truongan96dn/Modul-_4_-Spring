<%--
  Created by IntelliJ IDEA.
  User: hotruongan
  Date: 19/05/2023
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose Condiment</title>
</head>
<body>
<h1> Choose Condiment</h1>
<form>
    <input type="checkbox"  name="condiment" value="lettuce">
    <label > Lettuce</label>
    <input type="checkbox"  name="condiment" value="lomato" >
    <label > Tomato</label>
    <input type="checkbox" name="condiment" value="lustard">
    <label > Mustard</label>
    <input type="checkbox" name="condiment" value="sprouts">
    <label > Sprouts</label>
    <button type="submit">Send</button>
</form>
<div>
    <ul>
        <c:forEach var="element" items="${list}">
            <li>
                    ${element}
            </li>
        </c:forEach>
    </ul>

</div>


</body>
</html>
