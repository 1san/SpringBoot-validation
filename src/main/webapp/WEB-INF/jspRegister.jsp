<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">User Register</h1>
	<hr>
	<br>
	<br>
	<div align="center">
		<form action="addUser" modelAttribute="user" method="post" required>
			<input type=text name="name" placeholder="Enter Name"
				pattern="[a-zA-Z0-9]+" required><br>
			<br> <input type="text" name="mobileNo"
				placeholder="Enter mobile No" pattern="[7-9]{1}[0-9]{9}" required><br>
			<br> <input type="email" name="emailId"
				placeholder="Enter Email Id" required><br>
			<br> <input type="date" name="date"
				placeholder="Enter Date of Birth" required><br>
			<br> <input type="submit" value="Submit">&nbsp&nbsp&nbsp&nbsp&nbsp<input
				type=button value="Back" onCLick="history.back()">
		</form>
	</div>
</body>
</html>