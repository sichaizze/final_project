<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Login</title>

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-2.2.0.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/bootstrap.min.css">

    <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <form class="form">
        <div class="input-group mb-2 mr-sm-2 mb-sm-0">
            <div class="input-group-addon">
                <span class="fas fa-user"></span>
            </div>
            <input type="text" class="form-control" placeholder="Username" />
        </div>
        <div class="input-group mb-2 mr-sm-2 mb-sm-0">
            <div class="input-group-addon">
                <span class="fas fa-key"></span>
            </div>
            <input type="password" class="form-control" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary">Se connecter</button>
    </form>
</div>
</body>
</body>
</html>
