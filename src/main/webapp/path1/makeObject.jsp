<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="member" scope="request"
	class="bookMingle.model.UserInfo" />

<%
	member.setMemberId("memberId");
	member.setFirstname("멤버이름");
%>
<jsp:forward page="/useObject.jsp"></jsp:forward>