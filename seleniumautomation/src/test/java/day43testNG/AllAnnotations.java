package day43testNG;

import org.testng.annotations.*;


//1. Login ---> Before Method
//2.Search --> Test Method
//3.Logout ---> After Method
//4.Login 
//5.Adv Search ---> Test Method
//5.Logout

public class AllAnnotations {
	@BeforeSuite
	void xx() {
		System.out.println("this is before suite");
	}
	@AfterSuite
	void xy() {
		System.out.println("this is after suite");
	}
	@BeforeTest
	void xii() {
		System.out.println("this is before test");
	}
	@AfterTest
	void xiid() {
		System.out.println("this is after test");
	}
	@BeforeClass
	void xiip() {
		System.out.println("this is before class");
	}
	@AfterClass
	void xiiu() {
		System.out.println("this is after class");
	}
	@BeforeMethod
	void login() {
		
		System.out.println("this is before method");
	}
	@Test
	void search() {
		
		System.out.println("this is test1");
	}
	@Test
	void advsearch() {
		System.out.println("this is test2");
	}
	@AfterMethod
	void logout() {
		
		System.out.println("this is after method..");	
	}
	}


