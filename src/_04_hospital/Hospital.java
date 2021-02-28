package _04_hospital;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Hospital {

	ArrayList<Doctor> docters = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doctor) {
		docters.add(doctor);
		int[] vals = {1, 2, 3, 4, 5};
		 for(int i = 0; i < vals.length; i ++){

		          vals[i] = vals[i] * vals[i]; 

		}

		System.out.println(vals[3]); 
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return docters;
	}
}