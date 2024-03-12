<%--
  Created by IntelliJ IDEA.
  User: Irina.Petrovskaya
  Date: 2/6/2016
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<div id="content">
    <fieldset>
        <legend>Add Tester</legend>
        <form name="tester" action="add.html" method="post">
            Firstname: <input type="text" name="firstname"/> <br/>
            Lastname: <input type="text" name="lastname"/> <br/>
            <input type="submit" value="   Save   "/>
        </form>
    </fieldset>
    <br/>
    <h1>IDEA Core QA group ( ${model.groupSize}):</h1>
    <table class="datatable">
        <tr>
            <th>Firstname</th>
            <th>Lastname</th>
        </tr>

        <tr>
            <td>${model.testerList[0].firstname}</td>
            <td>${model.testerList[0].lastname}</td>
        </tr>
        <tr>
            <td>${model.testerList[1].firstname}</td>
            <td>${model.testerList[1].lastname}</td>
        </tr>
        <tr>
            <td>${model.testerList[2].firstname}</td>
            <td>${model.testerList[2].lastname}</td>
        </tr>
        <tr>
            <td>${model.testerList[3].firstname}</td>
            <td>${model.testerList[3].lastname}</td>
        </tr>
        <tr>
            <td>${model.testerList[4].firstname}</td>
            <td>${model.testerList[4].lastname}</td>
        </tr>
        <tr>
            <td>${model.testerList[5].firstname}</td>
            <td>${model.testerList[5].lastname}</td>
        </tr>
        <tr>
            <td>${model.testerList[6].firstname}</td>
            <td>${model.testerList[6].lastname}</td>
        </tr>


    </table>
</div>
</body>
</body>
</html>
