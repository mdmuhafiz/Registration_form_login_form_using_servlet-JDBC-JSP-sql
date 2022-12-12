<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
<h2>Login page</h2>
<hr>
<%
if(request.getAttribute("newAccountCreated")!=null){
	out.println(request.getAttribute("newAccountCreated"));
}


%>
<div>
<%
if(request.getAttribute("massage")!=null){
	out.println(request.getAttribute("massage"));
}


%>


</div>
<div>
<form action="verifyLogin" method="post">
<pre>
Email<input type = "email" name = "email"/>
Password<input type = "password" name = "password"/>
<input type = "Submit" value="login">
</form>
</pre>
</div>

<a href ="createAccounnt">Create New Account</a>



</div>

</body>
</html>