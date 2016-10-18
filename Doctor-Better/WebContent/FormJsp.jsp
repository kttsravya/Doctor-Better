<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="Data.Patient"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form JSP</title>
</head>
<body>


	<form method='post' action='submittedformservlet.html'>
		<% String name = (String)request.getAttribute("nameBackingObject"); 
String phone = (String)request.getAttribute("phoneBackingObject");
String insurance = (String)request.getAttribute("insuranceBackingObject");
String email = (String)request.getAttribute("emailBackingObject");
%>
		Name<sup>*</sup>: <input type='text' name='name' <% if(name!=null){ %>
			value='<%=name %>' <%} %> />
		<% 
String message = (String)request.getAttribute("errorInNameMessage");
    if(message!=null){
    %>
		<font size="3" color="red"><%=message %> </font>
		<%  } %>

		<br> emailId<sup>*</sup>:<input type='text' name='emailId' <% if(email!=null){ %> 
		value='<%=email %>' <%} %> />
		<% String message9 = (String)request.getAttribute("errorInEmailMessage");
    if(message9!=null){
    %>
		<font size="3" color="red"><%=message9 %> </font>
		<%  } %>
		<br>
		MedicalProblem: <input type='text' name='problem' /><br> city: <input
			type='text' name='city' /><br> PhoneNumber<sup>*</sup>: <input
			type='text' name='phonenumber' <% if(phone!=null){ %>
			value='<%=phone %>' <%} %> />
		<% 
String message1 = (String)request.getAttribute("errorInPhoneNumberMessage");
    if(message1!=null){
 %>
		<font size="3" color="red"><%=message1 %> </font>
		<%  } %>
		<% 
String message2 = (String)request.getAttribute("errorInNumberOfCharacters");
    if(message2!=null){
 %>
		<font size="3" color="red"><%=message2 %> </font>
		<%  } %>
		<br> InsuranceDetail<sup>*</sup>:<input type='text'
			name='insurance' <% if(insurance!=null){ %> value='<%=insurance %>'
			<%} %> />
		<% 
String message3 = (String)request.getAttribute("errorInInsuranceMessage");
    if(message3!=null){
   %>

		<font size="3" color="red"><%=message3 %> </font>
		<%  }%>
		<br> EmergencyPhoneNumber:<input type='text'
			name='emergencynumber' /><br> address:<input type='text'
			name='address' /><br> <input type='submit' value='Submit' />

	</form>

</body>
</html>