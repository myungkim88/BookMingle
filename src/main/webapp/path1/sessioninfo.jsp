<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	Date time = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign In</title>
</head>
<body>
	SessionID: <%= session.getId() %><br>
	<% time.setTime(session.getCreationTime()); %>
	Session Generated Time: <%= formatter.format(time) %><br>
	<%
		time.setTime(session.getLastAccessedTime());
	%>
	Latest access time: <%= formatter.format(time) %>
	
</body>
</html>