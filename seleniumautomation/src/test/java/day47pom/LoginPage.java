package day47pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Constructor
	WebDriver driver;
	
	LoginPage(WebDriver driver){
		
		
		this.driver= driver;
	}
	
	//Locator
	
	By txt_username_loc = By.xpath("//input[@placeholder='username']");
	By txt_pwd_loc = By.xpath("//input[@placeholder='password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	//Action Methods
	
	public void setusername(String username) {
		
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setpassword(String pwd) {
		driver.findElement(txt_pwd_loc).sendKeys(pwd);
	}
		public void clickLogin() {
			
		
		driver.findElement(btn_login_loc).click();
	}





}
