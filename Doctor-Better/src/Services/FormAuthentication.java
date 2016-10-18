package Services;

import javax.servlet.http.HttpServletRequest;

import Data.Patient;

public class FormAuthentication {

	static String name;
	static String phoneNumber;
	static String insuranceDetails;
	static String emailId;
	static String medicalProblem;
	static String emergencyPhoneNumber;
	static String city;
	static String address;
	final static String fieldCannotBeLeftEmpty = "This field cannot be left empty";
	static Patient patient;

	public FormAuthentication(HttpServletRequest request) {
		extractFormData(request);

	}

	public static Patient extractFormData(HttpServletRequest request) {

		boolean formDataValid = true;

		name = request.getParameter("name");
		emailId = (String) request.getParameter("emailId");
		medicalProblem = (String) request.getParameter("problem");
		city = (String) request.getParameter("city");
		phoneNumber = (String) request.getParameter("phonenumber");
		insuranceDetails = (String) request.getParameter("insurance");
		emergencyPhoneNumber = (String) request.getParameter("emergencynumber");
		address = (String) request.getParameter("address");

		String validationMessage1 = validationMessagForName(name);

		if (validationMessage1 != null) {
			request.setAttribute("errorInNameMessage", validationMessage1);

			formDataValid = false;
		}

		String validationMessage2 = validationMessagForPhoneNumber(phoneNumber);

		if (validationMessage2 != null) {
			request.setAttribute("errorInNumberOfCharacters", validationMessage2);
			formDataValid = false;
		}

		String validationMessage3 = validationMessagForName(insuranceDetails);

		if (validationMessage3 != null) {
			request.setAttribute("errorInInsuranceMessage", validationMessage3);

			formDataValid = false;
		}

		String validationMessage4 = validationMessagForName(emailId);

		if (validationMessage3 != null) {
			request.setAttribute("errorInEmailMessage", validationMessage4);

			formDataValid = false;
		}

		if (!formDataValid) {
			// data is bad cant create patient object
			return null;
		}
		// data in the form is good so creating patient object
		patient = new Patient();
		patient.setName(name);
		patient.setAddress(address);
		patient.setCity(city);
		patient.setEmailId(emailId);
		patient.setEmergencyPhoneNumber(emergencyPhoneNumber);
		patient.setInsuranceDetails(insuranceDetails);
		patient.setMedicalProblem(medicalProblem);
		patient.setMobileNumber(phoneNumber);
		return patient;
	}

	private static String validationMessagForPhoneNumber(String phoneNumber2) {
		if (phoneNumber2.length() == 0) {
			return fieldCannotBeLeftEmpty;
		}
		
		return null;
	}

	public static String validationMessagForName(String name2) {
		if (name2.length() == 0) {
			return fieldCannotBeLeftEmpty;
		}
		return null;

	}

}
