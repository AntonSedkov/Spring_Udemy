<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Details</title>
</head>
<body>

<%--<h2 align="center">
    Dear, ${param.empName} !!! You are welcome!!! ${description}
</h2>--%>

<h2 align="center">
    Dear, ${employee.name} !!! You are welcome!!!
</h2>
<br/>
<br/>
Your surname: ${employee.surname}
<br/>
<br/>
Your salary: ${employee.salary}
<br/>
<br/>
Your department: ${employee.department}
<br/>
<br/>
Your car: ${employee.carBrand}
<br/>
<br/>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>


</body>
</html>
