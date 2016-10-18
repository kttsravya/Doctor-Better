package Services;

import Data.Doctor;

import java.util.ArrayList;

public class CardioDoctorList {
	static ArrayList<Doctor> cardioDoctorList = new ArrayList<Doctor>();

	public static ArrayList<Doctor> getCardioDoctorList() {
		if (cardioDoctorList == null || cardioDoctorList.size() == 0) {
			init();
		}
		return cardioDoctorList;
	}

	public static void setCardioDoctorList(ArrayList<Doctor> docList) {
		cardioDoctorList = docList;
	}

	public static void addCardioDoctor(Doctor d3) {
		cardioDoctorList.add(d3);
	}

	public static void removeCardioDoctor(Doctor d3) {
		cardioDoctorList.remove(d3);
	}

	private static void init() {
		Doctor d1 = new Doctor();
		d1.setDoctorName("Dr. Akik K. Parikh");
		d1.setDoctorType("Cardiovascular disease");
		d1.setDoctorRating(4.5);
		d1.setDoctorExperience(16);
		d1.setHospitalName("DCHS Medical foundation");
		d1.setPhoneNumber("(408)278-3000");
		d1.setAddress("625 Lincoln Ave,\nSan Jose,\n,CA\n95126");
		cardioDoctorList.add(d1);

		Doctor d2 = new Doctor();
		d2.setDoctorName("Dr. Benjamin Wu");
		d2.setDoctorType("Cardiovascular disease");
		d2.setDoctorRating(4.3);
		d2.setDoctorExperience(15);
		d2.setHospitalName("DCHS Medical foundation");
		d2.setPhoneNumber("(408)278-3000");
		d2.setAddress("625 Lincoln Ave,\nSan Jose,\n,CA\n95126");
		cardioDoctorList.add(d2);
	}
}
