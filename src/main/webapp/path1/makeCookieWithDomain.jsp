<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Cookie cookie1 = new Cookie("id", "madvirus");
	cookie1.setDomain(".somehost.com");
	response.addCookie(cookie1);
	
	Cookie cookie2 = new Cookie("only", "onlycookie");
	response.addCookie(cookie2);
	
	Cookie cookie3 = new Cookie("invalid", "invalidcookie");
	cookie3.setDomain("jvacan.tistory.com");
	response.addCookie(cookie3);
	
%>
<html>
<head>
<title>쿠키생성</title>
</head>
<body>
	다음과 같이 쿠키를 생성했습니다.<br>
	<%= cookie1.getName() %>=<%= cookie1.getValue() %>
	[<%= cookie1.getDomain() %>]
	<br>
	<%= cookie2.getName() %>=<%= cookie2.getValue() %>
	[<%= cookie2.getDomain() %>]
	<br>
	<%= cookie3.getName() %>=<%= cookie3.getValue() %>
	[<%= cookie3.getDomain() %>]
</body>
</html>