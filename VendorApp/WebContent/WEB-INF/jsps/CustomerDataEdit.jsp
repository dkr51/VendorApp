<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%@include file="Master.jsp" %>
<center>
<h1>Welcome to Location Edit!!</h1>
<form action="updateCustData" method="post">
<pre>
Id  : <input type="text" name="custId" value="${custObj.custId}" readonly="readonly"/>
Name: <input type="text" name="custName" value="${custObj.custName}"/>
Type:<c:choose><c:when test="${custObj.custType eq 'Urban'}"> <input type="radio" name="custType" value="Urban" checked="checked">Urban<input type="radio" name="custType" value="Rural">Rural</c:when><c:otherwise><input type="radio" name="custType" value="Urban">Urban<input type="radio" name="custType" value="Rural" checked="checked">Rural</c:otherwise></c:choose> 
<input type="submit" value="Register"/>
</pre>
</form>
</center>
</body>
</html>



