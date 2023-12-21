<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="pink">
<c:if test="${result==1}">
User registration successful......
<a href="Home.html">Home page</a>
</c:if>
<c:if test="${result==0}">

User registration failed......
<jsp:include page="User-Register-form.html"></jsp:include>
</c:if>
</body>
</html>