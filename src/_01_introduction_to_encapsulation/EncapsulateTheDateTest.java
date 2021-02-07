package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EncapsulateTheDateTest {
	EncapsulateTheData etd = new EncapsulateTheData();
	
	@Test
	  public void testItemsReceived() {
		etd.setItemsReceived(8);
		assertEquals(etd.getItemsReceived(), 8);
	  }
	 
	@Test
	  public void testDegreesTurned() {
		etd.setDegreesTurned(8);
		assertEquals(etd.getDegreesTurned(), 8);
	  }
	
	@Test
	  public void testNomenclature() {
		etd.setNomenclature("scoob");
		assertEquals(etd.getNomenclature(), "scoob");
	  }
	
	@Test
	  public void testMemberObj() {
		etd.setMemberObj(66);
		assertEquals(etd.getMemberObj(), 66);
	  }
}
