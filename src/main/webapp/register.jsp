<?xml version="1.0" encoding="utf-8" ?>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Register</title>
<s:head />
</head>
<body>
	<h3>Register for a prize by completing this form.</h3>

	<s:form action="register">
		<s:textfield key="personBean.firstName" />
		<s:textfield key="personBean.lastName" />
		<s:radio key="personBean.gender" list="genders" />
		<s:textfield key="personBean.phoneNumber" />
		<s:textfield key="personBean.email" />
		<s:textfield key="personBean.age" />
		<s:checkbox key="personBean.over21" />
		<s:select key="personBean.sport" list="sports" />
		<s:select key="personBean.residency" list="states" listKey="stateAbbr"
			listValue="stateName" />
		<s:checkboxlist key="personBean.carModels" list="carModelsAvailable" />
		<s:submit key="submit"/>
	</s:form>
</body>
</html>