<%-- 
    Document   : arithmeticcalculator
    Created on : 18-Jan-2022, 7:18:44 PM
    Author     : emman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label>First: </label>
            <input type="number" name="first" id="first">
            <br>
            <label>Second: </label>
            <input type="number" name="second" id="second">
            <br>
            <button type="submit" name="func" value="add"> + </button>
            <button type="submit" name="func" value="subtr"> - </button>
            <button type="submit" name="func" value="multi"> * </button>
            <button type="submit" name="func" value="divi"> % </button>
            <br>
            <br>
            ${result}
            <br>
            <a href="age"> Age Calculator </a>
        </form>
    </body>
</html>
