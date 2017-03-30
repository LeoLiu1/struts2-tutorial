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

	<h4>struts if tag</h4>
	<hr />
	<s:if test="personBean.over21">
		<p>You are old enough to vote!</p>
	</s:if>
	<s:else>
		<p>You are NOT old enough to vote.</p>
	</s:else>
	<s:if test="personBean.carModels.length > 1">
		<p>you have at least one car</p>
	</s:if>
	<s:else>
		<p>you have no car</p>
	</s:else>

	<h4>struts iterator tag</h4>
	<hr />
	<table style="margin-left: 15px">
		<s:iterator value="personBean.carModels">
			<tr>
				<td><s:property /></td>
			</tr>
		</s:iterator>
	</table>
	<table style="margin-left: 15px">
		<s:iterator value="states">
			<tr>
				<td><s:property value="stateAbbr" /></td>
				<td><s:property value="stateName" />
			</tr>
		</s:iterator>
	</table>
	<hr />
	<p>
		<a href="<s:url action='index' />">Return to home page</a>.
	</p>
	<s:form action="updateregister">

		<s:select key="personBean.residency" list="states" listKey="stateAbbr"
			listValue="stateName" />
		<s:url action="updateregister" var="updateLink">
			<s:param name="personBean.firstName">${personBean.firstName}</s:param>
			<s:param name="personBean.phoneNumber">${personBean.phoneNumber}</s:param>
			<s:param name="personBean.email">${personBean.email}</s:param>
			<s:param name="personBean.age">${personBean.age}</s:param>
			<s:param name="personBean.carModels">${personBean.carModels}</s:param>
			<s:param name="personBean.residency">${personBean.residency}</s:param>
		</s:url>
		<a href="${updateLink}">Update person
			information, not business logical, only technically right</a>
		<s:submit />

	</s:form>
</body>
</html>