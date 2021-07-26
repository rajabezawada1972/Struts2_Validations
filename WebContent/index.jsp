<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<s:head/>
</head>
<body>
<h4><u>Struts2 Validation Example</u></h4>



<s:actionerror/>
<br>
<br>
<br>
<br>
<s:form action="login">

	<s:textfield name="uname" label="Enter Username" /><br> 
	<s:textfield name="pass" label="Enter Password" /><br>       
    <s:submit value="Login" align="center" /> 
</s:form>
</body>
</html>