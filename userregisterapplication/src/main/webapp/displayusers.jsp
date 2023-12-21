<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Users</title>
</head>
<body bgcolor="aqua">
<h1 >List of users</h1>
<table border="1"> 
<thead>
<th>Username</th>
<th>Password</th>
<th>Email</th>
<th>mobileno</th>
</thead>
<tbody >
<c:forEach items="${users}" var="user">
<tr>
<td>${user.username}</td>
<td>${user.password}</td>
<td>${user.email}</td>
<td>${user.mobileno}</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="Home.html">Home page</a>
</body>
</html>