<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.04.2019
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="styles/style.css" rel="stylesheet" type="text/css">


    <style>
        fieldset {
            width: 400px;
            height: 400px;
            background: #F5F5F5;
            margin: auto;
        }

        textarea{
            width: 390px;
            height: 120px;
        }
        input{
            float: right;
            margin-right: 10px;
        }
    </style>
</head>
<body>


<form action ="hello2" method = "POST">
    <div class="brd">
        <fieldset>
            <legend>TextReader Servlet</legend>

            <br><b>Write your keys here:</b></br>
            <textarea name="textArea1">${text111}</textarea></p>
            <b>Write your text:</b></br>
            <p><textarea name="textArea2">${text222}</textarea></p>
            <p><input type = "submit" value="Start"></p>
            <input type="button" value="Reset" onClick='location.href="http://localhost:8080/TextReaderServlet_war"'>
        </fieldset>
    </div>

</form>

</body>
</html>

