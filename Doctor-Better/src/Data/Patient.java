package Data;

public class Patient {
	String name;
	String mobileNumber;
	String city;
	String address;
	String emergenyPhoneNumber;
	String insuranceDetails;
	String emailId;
	String doctorName;
	String medicalProblem;

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getEmergencyPhoneNumber() {
		return emergenyPhoneNumber;
	}

	public String getInsuranceDetails() {
		return insuranceDetails;
	}

	public String getemailId() {
		return emailId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public String getMedicalProblem() {
		return medicalProblem;
	}

	public void setName(String name1) {
		name = name1;
	}

	public void setCity(String city1) {
		city = city1;
	}

	public void setMobileNumber(String mobilenumber) {
		mobileNumber = mobilenumber;
	}

	public void setAddress(String address1) {
		address = address1;
	}

	public void setEmergencyPhoneNumber(String num1) {
		emergenyPhoneNumber = num1;
	}

	public void setInsuranceDetails(String details) {
		insuranceDetails = details;
	}

	public void setEmailId(String emailId1) {
		emailId = emailId1;
	}

	public void setDoctorName(String docname) {
		doctorName = docname;
	}

	public void setMedicalProblem(String medicalProblem1) {
		medicalProblem = medicalProblem1;
	}

}
