package day44dependencymethods;

import org.testng.annotations.Test;

public class LoginTests {
    
	
	@Test(priority =1,groups = {"sanity"})
	void loginByEmail() {
		System.out.println("this is loginbyemail");
	}
	
	@Test(priority =2,groups = {"sanity"})
	void loginByFacebook() {
		System.out.println("this is loginbyfacebook");
	}
	@Test(priority =3,groups = {"sanity"})
	void loginByTwitter() {
		System.out.println("this is loginbytwitter");
	}
}
