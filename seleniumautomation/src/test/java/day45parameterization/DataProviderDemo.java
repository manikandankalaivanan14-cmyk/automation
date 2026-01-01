package day45parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeClass
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "dp")
	void testLogin(String email,String pwd) {
		
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	boolean myacct=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	Assert.assertEquals(myacct,true);
	
	if(myacct == true) {
		
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		Assert.assertTrue(true);
	}
	else {
		Assert.fail();
	}
	}
	
	@AfterClass
	void teardown() {
		driver.quit();
		
	}
	
	@DataProvider(name ="dp", indices = {0,1,2})
	
	Object [] [] loginData() {
		
		Object data [][] = {
				{"abc@gmail.com","test123"},
				{"prem@gmail.com","testf23"},
				{"premjan1994.pk@gmail.com","xUScf#67kyv9@"},
				{"manik@gmail.com","testdc123"},
				{"abcsas@gmail.com","testss123"},
				
		};
	return data;
		
	}

	
	

}
