<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bookMingle.utils.CookieBox"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");

	if (id.equals(password)) {
		response.addCookie(CookieBox.createCookie("LOGIN", "true", "/",
				-1));
		response.addCookie(CookieBox.createCookie("ID", id, "/", -1));
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign In Successful</title>
</head>
<body>sign in successful
</body>
</html>
<%
	} else {
%>
<script>
	alert("sign in failed");
	history.go(-1);
</script>
<%
	}
%>