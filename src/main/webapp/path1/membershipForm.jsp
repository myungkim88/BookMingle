<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>Sign Up</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/path1/processJoining.jsp"
		method="post">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td>ID</td>
				<td colspan="3"><input type="text" name="memberId" size="10"></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name=firstname size="10"></td>
				<td>Last Name</td>
				<td><input type="text" name="lastname" size="10"></td>
			</tr>
			<tr>
				<td>email</td>
				<td colspan="3"><input type="text" name="email" size="30"></td>
			</tr>
			<tr>
				<td colspan="4" align="center"><input type="submit"
					value="submit"></td>
			</tr>
		</table>


	</form>


</body>
</html>