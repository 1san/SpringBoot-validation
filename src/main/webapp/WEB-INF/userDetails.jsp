<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
	border: 1px solid blue;
	width: 80%;
}
</style>
</head>
<body>
	<h1 align="center">User Details</h1>
	<hr>
	<br>
	<br>
	<table align="center">
		<tr>
		    <th>Id</th>
			<th>Name</th>
			<th>Mobile No</th>
			<th>Email Id</th>
			<th>Age</th>
			<th><a href="register"><button>+add+</button></a></th>
		</tr>
		<c:forEach var="list" items="${user}">
			<tr>
			    <td align="center">${list.id}</td>
				<td align="center">${list.name}</td>
				<td align="center">${list.mobileNo}</td>
				<td align="center">${list.emailId}</td>
				<td align="center">${list.age}</td>
				<td align="center"><a href="delete/${list.id}"+>Delete</a>&nbsp&nbsp&nbsp<a
					href="update/${list.id}"+>update</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<div align="center">
		<input type=button value="Back" onCLick="history.back()">
	</div>
</body>
</html>