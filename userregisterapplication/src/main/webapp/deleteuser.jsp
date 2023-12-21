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
<c:if test="${result==1}">
  <h1>Data deleted successfully ......<%=request.getParameter("mobileno")%></h1>
  <a href="Home.html">Home page</a>
</c:if>
<c:if test="${result==0}">
  <h1>Data Not available with given mobile......<%=request.getParameter("mobileno")%></h1>
  <jsp:include page="deleteuser.html"></jsp:include>
</c:if>



</body>
</html>