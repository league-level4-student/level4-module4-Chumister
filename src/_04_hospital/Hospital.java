package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void addDoctor() {
		doctors.addAll(doctors);
		int[] val = {1,2,3,4,5};
		for (int i = 0; i < val.length; i++) {
			val[i]=val[i]*val[i];
			
		}
		System.out.println(val[3]);
	}
	public void addPatient() {
		patients.addAll(patients);
		
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
}
