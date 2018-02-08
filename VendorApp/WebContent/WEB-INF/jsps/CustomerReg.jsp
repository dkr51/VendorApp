<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%@include file="Master.jsp" %>
<center>
<h1>Welcome to Customer Register!!</h1>
<form action="insertCust" method="post">
<pre>
Id  : <input type="text" name="CustId"/>
Name: <input type="text" name="CustName"/>
Type: <input type="radio" name="CustType" value="Urban">Urban<input type="radio" name="CustType" value="Rural">Rural
<input type="submit" value="Register"/>
</pre>
</form>
${msg}
</center>
</body>
</html>



