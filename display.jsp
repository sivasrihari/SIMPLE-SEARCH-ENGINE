<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying the related webs</title>
</head>
<body bgcolor="cyan">
	<br />
	  <h2 style="color:blue;text-align:center">SIMPLE SEARCH ENGINE</h2>
	<br />
	<br />
	<form method="get" action='./search'>
		<table align='center'>
			<tr>
				<th>Enter the keyword of the description::</th>
				<td><input type="text" name="key" placeholder="Search..." required/></td>
			</tr>
			<tr>
				<th>Enter the user name::</th>
				<td><input type="text" name="user" placeholder="name" required/></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Search"/></td>
			</tr>
		</table>
	</form>
</body>
</html>