<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file = "menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h3>New Registration || All Registration</h3>
<hr>
<form action="reg" method="post">
<pre>
Name<input type = "text" name = "name"/>
City<input type = "text" name = "city"/>
Email<input type = "email" name = "email"/>
Mobile<input type = "text" name = "mobile"/>
<input type = "Submit" value="save">
</pre>
</form>
<div>
<%
if(request.getAttribute("massage")!=null){
	out.println(request.getAttribute("massage"));
}




%>


</div>
</body>
</html>