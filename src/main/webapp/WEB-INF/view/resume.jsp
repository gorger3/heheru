<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
    <h2>Резюме</h2>

    <form:form action="save-resume" modelAttribute="res">
        <form:hidden path="id"/>

        ФИО <form:input path="fullName"/>
        <br><br>

    <form:form action="save-resume" modelAttribute="cont">
        Телефон <form:input path="phone"/>
        <br><br>
        Почта <form:input path="mail"/>
        <br><br>
        Адрес <form:input path="address"/>
        <br><br>
        Linkedin <form:input path="linkedin"/>
        <br><br>
        Github <form:input path="github"/>
        <br><br>
        <input type="submit" value="Ок"/>
    </form:form>



    </form:form>



</body>
</html>
