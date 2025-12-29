package day43testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	

	@Test
	void Assert() {
	
	//	Assert.assertEquals("xyz", "xyz");
	//	Assert.assertEquals(123, 321);
	//	Assert.assertEquals("xyz", 321);
		//Assert.assertEquals("123", 321);
		
	//	Assert.assertNotEquals(123, 123);
	//	Assert.assertNotEquals(123, 129);
		
	//	Assert.assertTrue(true);
	//	Assert.assertTrue(false);
		
	//	Assert.assertTrue(1==2);
	//	Assert.assertTrue(1==1);
		
	//	Assert.assertFalse(1==2);
		//Assert.assertFalse(1==1);
		
		Assert.fail();
		
	
	
	
	}
	
}
