<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask Details</title>
</head>


<body>
<h2 align="center">Dear man, introduce yourself!</h2>
<br/>
<br/>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br/><br/>
    Surname <form:input path="surname"/>
    <br/><br/>
    Salary <form:input path="salary"/>
    <br/><br/>
    Department
    <form:select path="department">
        <form:options items="${employee.departments}"/>

        <%-- <form:option value="Informantion Technology" label="IT"/>
         <form:option value="Human Resources" label="HR"/>
         <form:option value="Sales" label="Sales"/>--%>

    </form:select>
    <br/><br/>

    Which car do you want? <br/>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <%-- BMW <form:radiobutton path="carBrand" value="BMW"/>
     Audi <form:radiobutton path="carBrand" value="Audi"/>
     MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <br/><br/>

    Foreign language(s):<br/>
    <form:checkboxes path="languages" items="${employee.languagesMap}"/>

    <%-- EN <form:checkbox path="languages" value="English"/>
     DE <form:checkbox path="languages" value="Deutsch"/>
     ES <form:checkbox path="languages" value="Espanol"/>--%>
    <br/><br/>


    <br/><br/>
    <input type="submit" value="OK">

</form:form>


</body>


<%--<body>
<h2 align="center">Dear man, introduce yourself!</h2>
<br/>
<br/>
<form action="showDetails" method="get">
    <input type="text" name="empName" placeholder="Write your name"/>
    <input type="submit"/>
</form>
</body>--%>


</html>
