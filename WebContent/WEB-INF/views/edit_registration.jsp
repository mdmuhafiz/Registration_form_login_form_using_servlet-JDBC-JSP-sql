<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>edit</title>
</head>
<body>
<h3>Edit Registration</h3>
<hr>
<form action="edit" method="post">
<pre>
Email<input type = "email" name = "email" value= <%= request.getAttribute("email") %> readonly>
mobile<input type = "text" name = "mobile" value=<%= request.getAttribute("mobile") %>>
<input type = "Submit" value="update">
</pre>


</form>

</body>
</html>