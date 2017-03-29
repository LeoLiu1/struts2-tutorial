<?xml version="1.0" encoding="utf-8" ?>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<h1>Welcome To Struts 2!</h1>
	<p>
		<a href="<s:url action='hello'/>">Hello World</a>
	</p>
	<s:url action="hello" var="helloLink">
		<s:param name="userName">Bruce Phillips</s:param>
	</s:url>

	<p>
		<a href="${helloLink}">Hello Bruce Phillips</a>
	</p>
	<p>Get your own personal hello by filling out and submitting this
		form.</p>

	<s:form action="hello">
		<s:textfield name="userName" label="Your name" />
		<s:submit value="Submit" />
	</s:form>


	<s:url action="registerInput" var="registerInputLink" />
	<p>
		<a href="${registerInputLink}">Please register</a> for our prize
		drawing.
	</p>
	<h3>Registro español</h3>
	<s:url action="registerInput" var="registerInputLinkES">
		<s:param name="request_locale">es</s:param>
	</s:url>
	<p>
		<a href="${registerInputLinkES}">Por favor, regístrese</a> para
		nuestro sorteo
	</p>
	<s:url action="securitybreachexception"
		var="securitybreachexceptionLink" />
	<p>
		<a href="${securitybreachexceptionLink}">Click</a> to throw
		SecurityBreachException overriding global exception-mapping to login
		page
	</p>
	<s:url action="securitybreachexceptionglobal"
		var="securitybreachexceptionglobalLink" />
	<p>
		<a href="${securitybreachexceptionglobalLink}">Click</a> to throw
		SecurityBreachException using global exception-mapping to security
		error page
	</p>
	<s:url action="exceptionglobal" var="exceptionglobalLink" />
	<p>
		<a href="${exceptionglobalLink}">Click</a> to throw Exception using
		global exception-mapping to error page
	</p>
	<p>
		<a href="<s:url action="index" namespace="config-browser" />">Launch
			the configuration browser</a>
	</p>
	<P>
		<s:url action="index" var="debugLink">
			<s:param name="debug">browser</s:param>
		</s:url>
		<a href="${debugLink}">Debugging Interceptor</a>
	</p>
	<hr />
	<s:text name="contact" />
</body>
</html>