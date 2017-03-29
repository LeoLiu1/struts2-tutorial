<?xml version="1.0" encoding="utf-8" ?>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Registration Successful</title>
</head>
<body>
	<h3>
		<s:text name="thankyou" />
	</h3>

	<p>
		Your registration information:
		<s:property value="personBean" />
	</p>

	<p>
		<a href="<s:url action='index' />">Return to home page</a>.
	</p>

</body>
</html>