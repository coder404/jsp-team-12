<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sign Up </title>
</head>
 
<body>
<h2>Create Account</h2>
 
<s:form action="adduser.action" method="post">
    <s:textfield name="username" key="username" size="20" />
    <s:textfield name="useremail" key="email" size="20" />
    <s:password key="password" />
	<s:password key="confirmPassword" />
    <s:submit method="execute" key="submit" align="center" />
</s:form>
</body>
</html>

 