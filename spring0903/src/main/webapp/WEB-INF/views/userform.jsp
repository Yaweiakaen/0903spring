<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>
<form action="user" method="post">
    User Name:<input  type="text"  name="name" value="${username}"/><br/>
    <input type="submit"/>
</form>
</body>
</html>