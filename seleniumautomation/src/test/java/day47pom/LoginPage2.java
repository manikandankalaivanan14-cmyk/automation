package day47pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	//Constructor
	WebDriver driver;
	
	LoginPage2(WebDriver driver){
		
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locator
	
	@FindBy (xpath ="//input[@placeholder='username']") WebElement txt_username_loc ;
	@FindBy (xpath="//input[@placeholder='password']") WebElement txt_pwd_loc;
	@FindBy (xpath="//input[@placeholder='password']") WebElement btn_login_loc;
	
	//Action Methods
	
	public void setusername(String username) {
		
		txt_username_loc.sendKeys(username);
	}
	
	public void setpassword(String pwd) {
		txt_pwd_loc.sendKeys(pwd);
	}
		public void clickLogin() {
			
		
		btn_login_loc.click();
	}





}
