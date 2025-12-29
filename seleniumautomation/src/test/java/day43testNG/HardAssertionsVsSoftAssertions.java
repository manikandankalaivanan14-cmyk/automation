package day43testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionsVsSoftAssertions {
	
//	@Test
////	void test_hardassertions() {
////		
////		System.out.println("this is testng");
////		System.out.println("this is testng");
////		
////		Assert.assertEquals("java", "java");
////		System.out.println("this is testng");
////		System.out.println("this is testng");
////	}
////	
	@Test
	void test_softassertions() {
		
		System.out.println("this is testng");
		System.out.println("this is testng");
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("java", "jaa");
		
		System.out.println("this is testng");
		System.out.println("this is testng");
		
		sa.assertAll();
		
	}

}
