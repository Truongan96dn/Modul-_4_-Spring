<%--
  Created by IntelliJ IDEA.
  User: hotruongan
  Date: 22/05/2023
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<h1 style="text-align: center"> Settings</h1>
<div class="container" align="center">
    <table class="table" style="width: 30vw">
        <tr>
            <td>
                <strong>Language : </strong> ${email.language}
            </td>
        </tr>
        <tr>
            <td>
                <strong>Page Size  : </strong> ${email.pageSize}
            </td>
        </tr>
        <tr>
            <td>
                <strong>Spams filter : </strong> ${email.spamsFilter}
            </td>
        </tr>
        <tr>
            <td>
                <strong>Signature : </strong>${email.signature}
            </td>
        </tr>
        <tr>
            <td>
                <a name="" id="" class="btn btn-secondary" href="/update-form"
                   role="button">Update</a>
            </td>
        </tr>
    </table>
</div>

</body>
</html>
