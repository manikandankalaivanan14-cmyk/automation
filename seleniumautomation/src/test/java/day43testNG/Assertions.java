package day43testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@Test
	void Assert(){

		String act = "Welcome to the java";
		String expected ="Welcome to the java";
		
		if(act.equals(expected)) {
			System.out.println("Test Case passed");
			
			SoftAssert sa = new SoftAssert();
			sa.assertTrue(true);
			System.out.println("Test Case passed");
			System.out.println("Test Case passed");
		}
		else {
			System.out.println("Test Case failed");
			//Assert.assertTrue(false);
			//Assert.assertEquals(actual, expected);
		}
		
}		
		
}
