<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Types Of Doctors JSP</title>
</head>
<body>
	<!-- <h3> Doctors in SanJose</h3> -->
	<%
  ArrayList<String> doctype = (ArrayList<String>) request.getAttribute("typeofdoctorslist");
  if(doctype == null || doctype.size() ==0 ){%>
	doc type list is empty
	<% }else{ %>
	<%  for(int i=0;i<doctype.size();i++){
	  String doctor = doctype.get(i);
 %>

	<h2>
		<a href="cardiodoctorlist.html"> <%= doctor %>
		</a><br>
	</h2>



	<%} %>
	<%} %>

</body>
</html>