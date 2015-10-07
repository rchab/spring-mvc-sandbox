<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h1>${message}</h1>

<form:form modelAttribute="person" action="${pageContext.request.contextPath}/savePerson" title="Save Person Dialog" method="post">

    <form:label path="firstName">Name:</form:label>
    <form:input path="firstName"></form:input>

    <form:label path="surname">Surname:</form:label>
    <form:input path="surname"></form:input>

    <input type="submit" value="Save"/>

</form:form>

<c:forEach items="${personList}" var="personElement">
    =====================
    <h2>${personElement.firstName}</h2>

    <h2>${personElement.surname}</h2>

</c:forEach>

</body>
</html>