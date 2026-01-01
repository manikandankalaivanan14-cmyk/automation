package day46testnglisteners;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//@Listeners(day46testnglisteners.MyListeners.class)
public class OrangeHRM {

		WebDriver driver ;
		@BeforeClass
		void setup() throws InterruptedException {
			
				
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Thread.sleep(3000);
		}
		@Test(priority = 1)
		void testLogo() {
			
		boolean logo =	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			
			Assert.assertEquals(logo, true);
		}
		@Test(priority = 2)
		void testTitle() {
		
			
			Assert.assertEquals(driver.getTitle(), "Orage Hrm");
		}
		@Test(priority = 3 , dependsOnMethods = {"testTitle"})
		void testURL() {
		
			
			Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
		@AfterClass
		void tearDown() {
			driver.quit();
		}
	}


