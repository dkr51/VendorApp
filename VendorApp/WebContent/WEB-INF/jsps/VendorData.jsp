<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor</title>
<style>
table, td, th {
    border: 2px solid black;
}

table {
    border-collapse: collapse;
    width: 100%;
  
}

th {
    text-align: center;
}
tr:nth-child(even){background-color: #f2f2f2}
th {
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<body>
<%@include file="Master.jsp" %>
<center>
<h1>Welcome to Vendor Data Page</h1>
<table border="1">
<tr>
 <th>Id</th><th>Name</th><th>Type</th><th>Update</th><th>Delete</th>
</tr>
<c:forEach items="${venListObj}" var="ven">
<tr>
<td><c:out value="${ven.venId}" /></td>
<td><c:out value="${ven.venName}" /></td>
<td><c:out value="${ven.venEmail}"/></td>
			
<td><a href='editVen?venId=<c:out value="${ven.venId}"/>'>Update</a></td>
<td><a href='deleteVen?venId=<c:out value="${ven.venId}"/>'>Delete</a></td>	

</tr>
</c:forEach>
</table>
</center>
</body>
</html>