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
	public void assignPatientsToDoctors() throws DoctorFullException {

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < docters.size(); i++) {
				if (patients.size() > (i + (3 * j))) {
					docters.get(i).assignPatient(patients.get(i + (3 * j)));
				}
			}
		}
		if (patients.size()>docters.size()*3) {
			throw new DoctorFullException();
		}
	}
	
}