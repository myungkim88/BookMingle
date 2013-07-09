<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>
<%@ page import = "bookMingle.utils.CookieBox" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (int i =0; i<cookies.length; i++) {
			if (cookies[i].getName().equals("name")) {
				Cookie cookie = new  Cookie("name", URLEncoder.encode("JSP프로그래밍", "UTF-8"));
				response.addCookie(cookie);
			}
		}
	}
%>
</body>
</html>