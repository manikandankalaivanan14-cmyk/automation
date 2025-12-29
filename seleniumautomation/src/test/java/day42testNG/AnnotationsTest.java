package day42testNG;

import org.testng.annotations.Test;

public class AnnotationsTest {
	
	@Test(priority=-1)
	void openapp() {
		System.out.println("open the app");
	}
	@Test(priority=0)
	void logout() {
		System.out.println("logout the app");
	}

	@Test(priority=10)
	void login() {
		System.out.println("login the app");
	}


}
