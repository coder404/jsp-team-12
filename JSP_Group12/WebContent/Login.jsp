<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Log In to the Forum</title>
</head>
<body>
<h2>Sign in if you have an account</h2>
<s:actionerror />
   <s:form action="loginaction" method="post">
      User:<br/><input type="text" name="user" key="label.username"/><br/>
      Password:<br/><input type="password" name="password" key="label.password"/><br/>
      <input type="submit" value="Login"/>		
   </s:form>
   <a
			style="color: black; font-size: 10pt"
			href="<s:url action='signup'/>">Sign Up</a>
</body>
</html>
