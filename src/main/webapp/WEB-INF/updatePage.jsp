<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">User Update</h1>
	<hr>
	<div align="center">
		<br>
		<br>
		<springForm:form method="POST" modelAttribute="user" action="submitUpdate">
		<table>
			<tr>
				<td>Name:</td>
				<td><springForm:input path="name" value="${users.name}"/></td>
				<td><springForm:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><springForm:input path="mobileNo" value="${users.mobileNo}"/></td>
				<td><springForm:errors path="mobileNo" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><springForm:input path="emailId" value="${users.emailId}"/></td>
				<td><springForm:errors path="emailId" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><springForm:input path="age" value="${users.age}"/></td>
				<td><springForm:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
			    <td><springForm:hidden path="id" value="${users.id}"/></td>
				<td colspan="3"><input type="submit" value="Update User"></td>
			</tr>
		</table>

	</springForm:form>
	</div>
</body>
</html>