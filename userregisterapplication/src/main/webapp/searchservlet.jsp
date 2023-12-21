<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<h1>search result......</h1>
 <c:if test="${not empty userinfo}">
    User Name......${userinfo.username}<br>
    User Password......${userinfo.password}<br>
    User Email......${userinfo.email}<br>
    User Mobile no......${userinfo.mobileno}<br>
    <a href="Home.html">Home page</a>
    </c:if>
    <c:if test="${empty userinfo}">
      search result not found.....
     <jsp:include page="Searchservlet.html"></jsp:include>
      </c:if>
</body>
</html>