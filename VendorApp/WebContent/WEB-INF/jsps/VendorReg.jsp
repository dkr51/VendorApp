<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Master.jsp" %>
<center>
<h1>Welcome to Vendor Reg Page!!</h1>
<form action="insertVen" method="post">
<pre>
Id   : <input type="text" name="venId"/>
Name : <input type="text" name="venName"/>
Email: <input type="text" name="venEmail"/>
<input type="submit" value="Insert"/><input type="reset" value="Clear"/>
</pre> 
</form>
${msg}<br/>
</center>
</body>
</html>