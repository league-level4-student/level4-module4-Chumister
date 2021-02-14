package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	Hospital() {
		
	}
	
	public void addDoctor(Doctor doctor) {
		if(doctors.size()<3 && doctors.size()>=0) {
			doctors.add(doctor);
		}
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void addPatient(Patient patient) {
		if(patients.size()<3 && patients.size()>=0) {
			patients.add(patient);
		}
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
}
