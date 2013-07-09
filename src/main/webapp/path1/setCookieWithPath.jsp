<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Cookie cookie1 = new Cookie("path1", URLEncoder.encode(
			"경로:/bookmingling/path1", "UTF-8"));
	cookie1.setPath("/bookmingling/path1");
	response.addCookie(cookie1);

	Cookie cookie2 = new Cookie("path2", URLEncoder.encode("경로:",
			"UTF-8"));
	response.addCookie(cookie2);

	Cookie cookie3 = new Cookie("path3", URLEncoder.encode("경로:/",
			"UTF-8"));
	cookie3.setPath(".");

	Cookie cookie4 = new Cookie("path4", URLEncoder.encode(
			"경로:/bookmingling/path2", "UTF-8"));
	cookie4.setPath("/bookmingling/path2");
	response.addCookie(cookie4);
%>
<html>
<head>
<title>쿠키생성</title>
</head>
<body>
	다음과 같이 쿠키를 생성했습니다.
	<br>
	<%=cookie1.getName()%>=<%=cookie1.getValue()%>
	[<%=cookie1.getPath()%>]
	<br>
	<%=cookie2.getName()%>=<%=cookie2.getValue()%>
	[<%=cookie2.getPath()%>]
	<br>
	<%=cookie3.getName()%>=<%=cookie3.getValue()%>
	[<%=cookie3.getPath()%>]
	<br>
	<%=cookie4.getName()%>=<%=cookie4.getValue()%>
	[<%=cookie4.getPath()%>]
	<br>
</body>
</html>