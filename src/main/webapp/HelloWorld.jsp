<?xml version="1.0" encoding="utf-8" ?>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hello World!</title>
</head>

<body>
	<h1>
		<s:text name="greeting" />
	</h1>
	<h2>
		<s:property value="messageStore.message" />
	</h2>
	<p>
		I've said hello
		<s:property value="helloCount" />
		times!
	</p>
	<p>
		<s:property value="messageStore" />
	</p>
</body>
</html>