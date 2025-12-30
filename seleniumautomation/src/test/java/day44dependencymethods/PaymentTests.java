package day44dependencymethods;

import org.testng.annotations.Test;

public class PaymentTests {
    
	
	@Test(priority =1,groups = {"regression"})
	void paymentinrupees() {
		System.out.println("this is paymentinrupees");
	}
	
	@Test(priority =2,groups = {"regression"})
	void paymentindollar() {
		System.out.println("this is paymentindollar");
	}
	@Test(priority =3,groups = {"regression"})
	void paymentindinar() {
		System.out.println("this is paymentindinar");
	}
}
