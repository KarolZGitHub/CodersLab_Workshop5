<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 07.06.2023
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Form</title>
</head>
<body>
<form method="post" action="/books">
    Id:<input type="number" name="id"><br>
    Isbn: <input type="text" name="isbn"><br>
    Title: <input type="text" name="title"><br>
    Author: <input type="text" name="author"><br>
    Publisher: <input type="text" name="publisher"><br>
    Description: <input type="text" name="description"><br>
    <input type="submit" value="Create book">
</form>
</body>
</html>
