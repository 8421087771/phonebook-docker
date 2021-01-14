<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Save Contact</h2>

	<p>
		<font color='green'>${succMsg}</font>
	</p>
	<p>

		<font color='red'>${errMsg}</font>
	</p>
	<form:form action="saveContact" method="POST" modelAttribute="contact">
		<table>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="contactName" /></td>
			</tr>
			<tr>
				<td>Contact Email</td>
				<td><form:input path="contactEmail" /></td>
			</tr>
			<tr>
				<td>Contact Phone</td>
				<td><form:input path="contactPhone"></form:input></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Save" /></td>

			</tr>
		</table>
	</form:form>


</body>
</html>