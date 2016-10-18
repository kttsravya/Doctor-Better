<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="Data.Patient"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sucess Page</title>
</head>
<body>
	<%Patient p =(Patient)session.getAttribute("patientObject"); %>
	<h4>
		Hi!
		<%=p.getName() %>
		your appointment is conformed in this week
	</h4>
	<h4>we will email you details regarding the day of your visit to
		hospital to</h4>
	<h3>
		<%=p.getemailId() %>
	</h3>
</body>
</html>