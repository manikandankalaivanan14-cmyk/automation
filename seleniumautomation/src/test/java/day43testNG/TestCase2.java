package day43testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	//1. Login ---> Before Class
	//2.Search --> Test Method
	//3.Adv Search ---> Test Method
	//4.Logout-->After Class
	
	@BeforeClass
	void login() {
		
		System.out.println("logged in successfully");
	}
	@AfterClass
	void logout() {
		
		System.out.println("logout...");	
	}

	@Test
	void search() {
		
		System.out.println("Search..");
	}
	@Test
	void advsearch() {
		System.out.println("Adv search...");
	}
	
}
