package day42testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
//	1.Open apps
//	2.Test logo presence
//	3.Login
//	4.Close
	WebDriver driver;
	@Test(priority=1)
	void openapp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("App opened successfully");
	}
	
	@Test(priority=3)
	void logo() {
	boolean logo=	driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
	System.out.println("Logo present "+ logo);
	System.out.println("Logo displayed successfully");
	}
	@Test(priority=2)
	void login() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println("Login sucessfully..");
	}
	
	@Test(priority=4)
	void close() {
		driver.quit();
		System.out.println("Application closed");
	}

}
