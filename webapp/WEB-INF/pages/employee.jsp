<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>

<h2>Employee Information</h2>
<form:form method="POST" action="addEmp">
   <table>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="age">Age</form:label></td>
        <td><form:input path="age" /></td>
    </tr>
    <tr>
        <td><form:label path="phone">phone</form:label></td>
        <td><form:input path="phone" /></td>
    </tr>
    <tr>
        <td><form:label path="city">city</form:label></td>
        <td><form:input path="city" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>