package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	boolean surgDone = false;
	boolean makesHouseCall = false;
	
	Doctor() {

	}
	
	public boolean performsSurgery() {
		return surgDone;
	}
	
	public boolean makesHouseCalls() {
		return makesHouseCall;
	}
	
	public void assignPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
}