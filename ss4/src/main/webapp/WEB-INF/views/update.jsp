<%--
  Created by IntelliJ IDEA.
  User: hotruongan
  Date: 22/05/2023
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>setting</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        .weight{
            font-weight: 700;
        }
    </style>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<<h2 style="text-align: center"> New Setting</h2>

<div class="container" align="center">
    <form:form action="/email" method="post" modelAttribute="email">
        <table class="table" style="width: 30vw;align-content: center">
            <thead>
            <tr>
                <td class="weight">
                    <form:label path="language">Languages</form:label>
                </td>
                <td class="weight">
                    <form:select path="language">
                        <form:options items="${language}"/>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td class="weight">
                    <form:label path="pageSize">Page Size : </form:label>
                </td>
                <td>
                    Show <form:select path="pageSize">
                    <form:options items="${pageSize}"/>
                </form:select> emails per page
                </td>
            </tr>
            <tr>
                <td class="weight">
                    <form:label path="spamsFilter">Spams Filter : </form:label>
                </td>
                <td>
                    <form:checkbox path="spamsFilter" value="Enable spams filter"/> Enable spams filter
                </td>
            </tr>

            <tr>
                <td class="weight">
                    <form:label path="signature">Signature : </form:label>
                </td>
                <td>
                    <form:textarea type="text" path="signature"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Update" class="btn btn-secondary">
                    <input type="button" value="Cancel" class="btn btn-danger" onclick="window.location.href='/'">
                </td>
            </tr>
            </thead>
        </table>
    </form:form>
</div>
</body>
</html>
