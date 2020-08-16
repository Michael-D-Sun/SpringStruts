<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Michael
  Date: 2020/8/16
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Users</title>
</head>
<body>
    <table width="80%" align="center">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Pwd</td>
        </tr>
        <c:forEach items="${list}" var="bean">
            <tr>
                <td>${bean.id}</td>
                <td>${bean.name}</td>
                <td>${bean.pwd}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
