package Data;

public class Doctor {
	String doctorName;
	String doctorType;
	double rating;
	int experience;
	String hospitalName;
	String phoneNumber;
	String address;

	public String getDoctorName() {
		return doctorName;
	}

	public String getDoctorType() {
		return doctorType;
	}

	public int getDoctorExperience() {
		return experience;
	}

	public double getDoctorRating() {
		return rating;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setDoctorName(String tempdoctorName) {
		doctorName = tempdoctorName;
	}

	public void setDoctorType(String tempdoctorType) {
		doctorType = tempdoctorType;
	}

	public void setDoctorRating(double tempdoctorRating) {
		rating = tempdoctorRating;
	}

	public void setDoctorExperience(int tempdoctorExoerience) {
		experience = tempdoctorExoerience;
	}

	public void setHospitalName(String temphospitalName) {
		hospitalName = temphospitalName;
	}

	public void setPhoneNumber(String tempPhoneNumber) {
		phoneNumber = tempPhoneNumber;
	}

	public void setAddress(String tempAddress) {
		address = tempAddress;
	}
}
