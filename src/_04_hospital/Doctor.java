package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void assignPatient(Patient patient) {
		boolean IS_ADDED = false;
		for (int i = 0; i < patients.size(); i++) {
			if(patients == null && !IS_ADDED) {
				patients = patient.toString();
				IS_ADDED = true;
			}
		}
	}
	
	public void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).care = true;
		}
	}
	
	public ArrayList<Patient> getPatients() {
		
		return patients;
	}
	
	public int getPatientLen() {
		int total = 0;
		for (int i = 0; i < patients.size(); i++) {
			if(patients != null) {
				total = total + 1;
				
			}
		}
		return total;
	}
	
	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}
}