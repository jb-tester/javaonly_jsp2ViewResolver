<%--
  Created by IntelliJ IDEA.
  User: Irina.Petrovskaya
  Date: 2/6/2016
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP View Resolver with parameters test</title>
</head>
<body>

<p> Current IDEA Core QA group:</p>
There are ${amount} testers in the group:
<table>
<tr>
    <td>${currentGroup[0].firstname}</td>
    <td>${currentGroup[0].lastname}</td>

</tr>
<tr>
    <td>${currentGroup[1].firstname}</td>
    <td>${currentGroup[1].lastname}</td>
</tr>
<tr>
    <td>${currentGroup[2].firstname}</td>
    <td>${currentGroup[2].lastname}</td>
</tr>
<tr>
    <td>${currentGroup[3].firstname}</td>
    <td>${currentGroup[3].lastname}</td>
</tr>
<tr>
    <td>${currentGroup[4].firstname}</td>
    <td>${currentGroup[4].lastname}</td>
</tr>
<tr>
    <td>${currentGroup[5].firstname}</td>
    <td>${currentGroup[5].lastname}</td>
</tr>
<tr>
    <td>${currentGroup[6].firstname}</td>
    <td>${currentGroup[6].lastname}</td>
</tr>

</table>

<a href="/index">next</a>
<a href="/tester/1 1">details</a>
</body>
</html>
