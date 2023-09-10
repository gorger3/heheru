<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>Список резюме</h2>
<br>

<table>
    <tr>
        <th>id</th>
        <th>ФИО</th>
    </tr>
    <c:forEach var="res" items="${allRes}">
        <tr>
            <td>${res.id}</td>
            <td>${res.fullName}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
