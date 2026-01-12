package testBase;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

public	WebDriver driver;
public Logger logger;
@BeforeClass
@Parameters({"os","browser"})
public void setup(String os ,String br) {
	
	switch(br.toLowerCase())
	{
	case "chrome" : driver = new ChromeDriver(); break;
	case "edge" : driver = new EdgeDriver(); break;
	case "firefox" : driver = new FirefoxDriver(); break;

	default : System.out.println("Invalid browser"); return;
	}
	
	
		
	  logger= LogManager.getLogger(this.getClass());
		
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
