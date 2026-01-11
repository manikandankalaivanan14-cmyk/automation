package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
	
	
	public RegistrationPage(WebDriver driver) {
		
		super(driver);
	}
	

@FindBy(xpath="//input[@id='input-firstname']")
WebElement firstName;
@FindBy(xpath="//input[@id='input-lastname']") 
WebElement lastName;
@FindBy(xpath="//input[@id='input-email']")
WebElement eMail;
@FindBy(xpath="//input[@id='input-telephone']") 
WebElement telephone;
@FindBy(xpath="//input[@id='input-password']") 
WebElement password;
@FindBy(xpath="//input[@id='input-confirm']") 
WebElement passwordConfirm;
@FindBy(xpath="//input[@name='agree']")  
WebElement agree;

@FindBy(xpath="//input[@value='Continue']")
WebElement cntnue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") 
WebElement yourAccountHasBeenCreated;

public void setFirstName(String name) {
	firstName.sendKeys(name);
}
	
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
		
		public void setEmail(String email) {
			eMail.sendKeys(email);
		}
			

			public void settelephn(String telphn) {
				telephone.sendKeys(telphn);
			}				
				public void setpasswd(String pwd) {
					password.sendKeys(pwd);
		
				}
				
				public void setcnfmpwd(String cnfmpwd) {
					passwordConfirm.sendKeys(cnfmpwd);
				}
				
			
				
				public void clickAgreebtn() {
					
					agree.click();
				}
					
				public void clickContinubtn() {
					cntnue.click();
				}
				
				
				public String getconfirmationmsg() {
					try
					{
		            	return	(yourAccountHasBeenCreated.getText());
					}catch(Exception e) {
						return e.getMessage();
					}
					
					
					
				}
				
	
	
}


