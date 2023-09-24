<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>
    <h2>Резюме</h2>

    <form:form action="save-resume" modelAttribute="res">
        <form:hidden path="id"/>

        ФИО <form:input path="fullName"/>
        <br><br>
        Телефон <form:input path="contact.phone"/>
        <br><br>
        Почта <form:input path="contact.mail"/>
        <br><br>
        Адрес <form:input path="contact.address"/>
        <br><br>
        Linkedin <form:input path="contact.linkedin"/>
        <br><br>
        Github <form:input path="contact.github"/>
        <br><br>
        <input type="submit" value="Ок"/>

    </form:form>



</body>
</html>
