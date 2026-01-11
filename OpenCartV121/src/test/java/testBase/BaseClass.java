package testBase;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

public	WebDriver driver;

@BeforeClass
public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@AfterClass
public void tearDown() {
	
	driver.quit();
}

public String randomestring() {
	
	
	String generatedtext = RandomStringUtils.randomAlphabetic(5);
	return generatedtext;
}
public String randomenumbers() {
	
	
	String generatednumbers = RandomStringUtils.randomNumeric(10);
	return generatednumbers;
}

public String randomealphanumeric() {
	
	
   String generatedtext = RandomStringUtils.randomAlphabetic(5);
	String generatednumbers = RandomStringUtils.randomNumeric(5);
	return (generatedtext+"@"+generatednumbers);
}


}
