package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {

	
	@Test
	
	public void registerAcct() throws InterruptedException {
	
		HomePage hp = new HomePage(driver);
		hp.myacct();
		hp.clickregbtn();
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.setFirstName(randomestring());
		rp.setLastName(randomestring());
		rp.setEmail(randomestring()+"@gmail.com");
		rp.settelephn(randomenumbers());
		
	    String pwd = randomealphanumeric();
		rp.setpasswd(pwd);
		rp.setcnfmpwd(pwd);
		rp.clickAgreebtn();
		rp.clickContinubtn();
		Thread.sleep(3000);
	String msg =rp.getconfirmationmsg();		
	
	Assert.assertEquals(msg, "Your Account Has Been Created!");
	}
	



}
