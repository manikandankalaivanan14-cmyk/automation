package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	
	@Test
	
	public void registerAcct() throws InterruptedException {
		
		logger.info("*****Starting TC001_AccountRegistrationTest*******");
	try
	{
		HomePage hp = new HomePage(driver);
		hp.myacct();
		logger.info("Clicked on MyAccount Link...");
		hp.clickregbtn();
		logger.info("Clicked on Registration Link...");
		RegistrationPage rp = new RegistrationPage(driver);
		
		logger.info("Provide Customer details...");
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
		
		logger.info("Validation expected message...");
	String msg =rp.getconfirmationmsg();
	
	if (msg.equals("Your Account Has Been Created!"))
	{
		Assert.assertTrue(true);
	}
	else {
		
		logger.error("Test Failed");
		logger.debug("Debug the logs");
		Assert.assertTrue(false);
	}
	
	//Assert.assertEquals(msg, "Your Account Has Been Created!");
	}
	catch(Exception e)
	{
		Assert.fail();
	}
	
	logger.info("*****Finished TC001_AccountRegistrationTest*******");
	}
	



}
