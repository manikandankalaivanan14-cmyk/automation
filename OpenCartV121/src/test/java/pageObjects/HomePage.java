package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
    //h3[normalize-space()='Welcome to OpenCart, your account has been created']
	

	public  HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy (xpath = "//i[@class='fa fa-user']")
	WebElement myacct;
	
	
	@FindBy (xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement regbutton;
	
	public void myacct() 
	
	{
		
		myacct.click();
	}
	
	public void clickregbtn() {
		regbutton.click();
	}
	
	
}
