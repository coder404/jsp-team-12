<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:url id="testUrlId" namespace="/" action="logout">
</s:url>
<s:a errorText="Sorry your request had an error."
	preInvokeJS="confirm('Are you sure you want to delete this item?')"
	href="%{testUrlId}">
	Logout
</s:a>