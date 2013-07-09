<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="memberInfo" class="bookMingle.model.UserInfo" />
<jsp:setProperty name="memberInfo" property="*" />
<jsp:setProperty name="memberInfo" property="password"
	value="<%=memberInfo.getMemberId()%>" />

<html>
<head>
<title>Sign Up</title>
</head>
<body>


	<table width="400" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>ID</td>
			<td><jsp:getProperty name="memberInfo" property="memberId" /></td>
			<td>password</td>
			<td><jsp:getProperty name="memberInfo" property="password" /></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><jsp:getProperty name="memberInfo" property="firstname" /></td>
			<td>Last Name</td>
			<td><jsp:getProperty name="memberInfo" property="lastname" /></td>
		</tr>
		<tr>
			<td>email</td>
			<td><jsp:getProperty name="memberInfo" property="email" /></td>
		</tr>
	</table>



</body>
</html>