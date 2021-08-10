package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
<<<<<<< HEAD
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public int getItemsReceived(){
		return itemsReceived;
	}
	public float getDegreesTurned(){
		return degreesTurned;
	}
	public String getNomenclature(){
		return nomenclature;
	}
	public Object getMemberObj(){
		return memberObj;
	}
	public void setItemsReceived(int newItems){
		newItems = 0;
	}
	public void setDegreesTurned(float newDegreesTurned){
		
	}
	public void setNomenclature(String newNomenClature){
		
	}
	public void setMemberObj(String newObject){
		
	}
=======
	int itemsReceived; //must not be negative. All negative arguments get set to 0.
	float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	Object memberObj; //can be any object type except String. Strings get turned into objects.
>>>>>>> 305c6a5fdccd0378f1d77f12446ff2dfcdb005c5
	public static void main(String[] args) {

	}

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if (!(itemsReceived < 0)) {
			this.itemsReceived = itemsReceived;
		} else {
			itemsReceived = 0;
		}
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {
		if (degreesTurned >= 0.0 && degreesTurned <= 360.0) {
			this.degreesTurned = degreesTurned;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if (!(nomenclature.isEmpty())) {
			this.nomenclature = nomenclature;
		} else {
			nomenclature = " ";
		}
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		if (!(memberObj instanceof String)) {
			this.memberObj = memberObj;
		} else {
			memberObj = new Object();
		}
	}
	
}
