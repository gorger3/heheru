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
        <th>Операция</th>
    </tr>
    <c:forEach var="res" items="${allRes}">

        <%-- Переход по этой ссылке срабатывает при нажатии на кнопку Обновить ниже.
        Ссылка вызывает метод контроллера с @RequestMapping("/update-info") и передаств этот метод
        параметр с именем "resId" и значением res.id, полученном из переменной res --%>
        <c:url var="updateButton" value="/update-info"> <%-- несмотря на красноту работает. Если поставить второй --%>
            <c:param name="resId" value="${res.id}"/>   <%-- слеш, краснота пройдёт и тоже будет работать    --%>
        </c:url>

        <tr>
            <td>${res.id}</td>
            <td>${res.fullName}</td>
            <td>
                <%-- Навесли на кнопку ссылку с именем переменной = updateButton                    --%>
                <input type="button" value="Обновить" onclick="window.location.href='${updateButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>

<input type="button" value="Добавить" onclick="window.location.href='resume-info'">

</body>
</html>
