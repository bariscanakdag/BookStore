<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: p1352
  Date: 07.07.2019
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>

<h1>Login Page Welcome</h1>

<form:form name='user' modelAttribute="user" action="/auth/login" method='post'>
    <table>
        <tr>
            <td>User:</td>
            <td> <form:input path="userName"/> </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td> <form:input path="password"/></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="Gir" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>
