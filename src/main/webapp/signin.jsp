<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign In</title>
</head>
<body>
<div id="dialog-form" class="hidden" title="Create New Account">
<p class="validateTips">All form fields are required.</p>
<form id="register-form">
<fieldset><label for="register-username">Username</label> <input
	type="text" id="register-username" name="register-username"
	class="text ui-widget-content ui-corner-all" maxlength="16" /> <label
	for="register-email">Email</label> <input type="text"
	id="register-email" name="register-email" value=""
	class="text ui-widget-content ui-corner-all" maxlength="64" /> <label
	for="register-password">Password</label> <input type="password"
	id="register-password" name="register-password" value=""
	class="text ui-widget-content ui-corner-all" maxlength="128" /> <label
	for="confirm-register-password">Confirm Password</label> <input
	type="password" id="confirm-register-password"
	name="confirm-register-password" value=""
	class="text ui-widget-content ui-corner-all" maxlength="128" /></fieldset>
</form>
</div>
</body>
</html>