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
<h1>Welcome to Location Register!!</h1>
${msg}
<form action="insertLoc" method="post">
<pre>
Id  : <input type="text" name="locId"/>
Name: <input type="text" name="locName"/>
Type: <input type="radio" name="locType" value="Urban">Urban<input type="radio" name="locType" value="Rural">Rural
<input type="submit" value="Register"/>
</pre>
</form>

</center>
</body>
</html>



