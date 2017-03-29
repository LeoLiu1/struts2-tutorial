<?xml version="1.0" encoding="utf-8" ?>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Basic Struts 2 Application - Security Error</title>
</head>
<body>
	<h4>Security Error occurred.</h4>
	<p>Please contact technical support with the following information:</p>
	<h4>
		Exception Name:
		<s:property value="exception" />
	</h4>
	<h4>
		Exception Details:
		<s:property value="exceptionStack" />
	</h4>
</body>
</html>