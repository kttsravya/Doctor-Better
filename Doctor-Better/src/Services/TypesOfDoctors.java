package Services;

import java.util.ArrayList;

public class TypesOfDoctors {
	static ArrayList<String> typesOfDoctorsList = new ArrayList<String>();

	public static ArrayList<String> getTypesOfDoctorsList() {
		if (typesOfDoctorsList.size() == 0 || typesOfDoctorsList == null) {
			init();
		}
		return typesOfDoctorsList;
	}

	private static void init() {
		typesOfDoctorsList.add("Cardioligist");
		typesOfDoctorsList.add("Dentist");
		typesOfDoctorsList.add("Dermatologist");
		typesOfDoctorsList.add("ENTSpecalist");

	}

	public static void setTypesOfDoctorsList(ArrayList<String> tempTypesOfDoctorsList) {
		typesOfDoctorsList = tempTypesOfDoctorsList;
	}

	public static void addDoctorTypeToList(String doctorType) {
		typesOfDoctorsList.add(doctorType);
	}

	public static void removeDoctorTypeFromList(String doctorType) {
		typesOfDoctorsList.remove(doctorType);
	}

}
