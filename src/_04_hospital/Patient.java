package _04_hospital;

public class Patient {
	boolean care = false;
	public boolean feelCare() {
		return care;
	}
	public void checkPulse() {
		care = true; 
	}
}
