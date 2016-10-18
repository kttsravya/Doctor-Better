<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList" import="Data.Doctor"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cardio Doctor List</title>
</head>
<body>
	<%
  ArrayList<Doctor> cardiodoclist = (ArrayList<Doctor>) request.getAttribute("cardiodoctorlist");
  if(cardiodoclist == null || cardiodoclist.size() ==0 ){%>
	Cardio doc type list is empty
	<% }else{ %>
	<%  for(int i=0;i<cardiodoclist.size();i++){
	  Doctor doctor = cardiodoclist.get(i);
	  String docName = doctor.getDoctorName();
	  String docType = doctor.getDoctorType();
	  double rating = doctor.getDoctorRating();
	  int experience = doctor.getDoctorExperience();
	  String hospital = doctor.getHospitalName();
	  String phoneNumber = doctor.getPhoneNumber();
	  String address = doctor.getAddress();
 %>

	<br>
	<h2>
		<a href="appointment.html"> <%= docName %>
		</a>
	</h2>
	<h3>
		<%= docType %>
	</h3>
	<h4>
		rating: (
		<%= rating %>
		/5)
	</h4>
	<h4>
		<%= experience %>
		years of experience
	</h4>
	<h4>
		<%= hospital %>
	</h4>
	<h4>
		<%= phoneNumber %></h4>
	<h4>
		<%= address %></h4>

	<%} %>
	<%} %>

	<h5>
		<a href="doctors.html"><ul>BACK</ul> </a>
	</h5>

</body>
</html>