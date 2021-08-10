package _04_hospital;

public class Patient {
	public boolean care = false;
	public boolean feelCare() {
		return care;
	}
	public void checkPulse() {
		care = true; 
	}
}
