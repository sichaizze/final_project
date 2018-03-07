<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Game of Life</title>

    <script type="text/javascript"
            src="/js/jquery-2.2.0.js"></script>
    <script type="text/javascript"
            src="/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css"
          href="/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css"
          href="/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"
          href="/css/custom.css">

</head>
<body>
<div class="container">
    <div class="jumbotron">
        <h1>Game of Life</h1>
        <input type="text" id="width" name="width" value="10">
        <input type="text" id="height" name="height" value="10">
        <input type="button" value="Générer la grille :)" onclick="javascript: genererGrille();">
        <div id="bientotMaGrille">

        </div>

    </div>
</div>
</body>
<script type="text/javascript" src="js/custom/gameOfLife.js"></script>
</html>
