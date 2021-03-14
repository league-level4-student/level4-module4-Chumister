package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void assignPatient(Patient patient) throws DoctorFullException{
		boolean IS_ADDED = false;
		if (patients.size()<3) {
			patients.add(patient);
		} else {
			throw new DoctorFullException();
		}
		
		for (int i = 0; i < patients.size(); i++) {
			if(patients == null && !IS_ADDED) {
				patients.add(patient);
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