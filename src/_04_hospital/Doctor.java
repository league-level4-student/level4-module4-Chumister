package _04_hospital;

public class Doctor {
	
	Patient[] patients = new Patient[3];
	
	public void assignPatient(Patient patient) {
		boolean IS_ADDED = false;
		for (int i = 0; i < patients.length; i++) {
			if(patients[i] == null && !IS_ADDED) {
				patients[i] = patient;
				IS_ADDED = true;
			}
		}
	}
	
	public void doMedicine() {
		for (int i = 0; i < patients.length; i++) {
			if(patients[i] != null) {
				patients[i].checkPulse();
			}
		}
	}
	
	public Patient[] getPatients() {
		return patients;
	}
	
	public int getPatientLen() {
		int total = 0;
		for (int i = 0; i < patients.length; i++) {
			if(patients[i] != null) {
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