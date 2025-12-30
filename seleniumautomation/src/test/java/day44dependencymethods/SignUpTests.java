package day44dependencymethods;

import org.testng.annotations.Test;

public class SignUpTests {
    
	
	@Test(priority =1,groups = {"sanity","regression","functional"})
	void signupByEmail() {
		System.out.println("this is signupbyemail");
	}
	
	@Test(priority =2,groups = {"sanity","regression","functional"})
	void signupByFacebook() {
		System.out.println("this is signupbyfacebook");
	}
	@Test(priority =3,groups = {"sanity","regression","functional"})
	void signupByTwitter() {
		System.out.println("this is signupbytwitter");
	}
}
