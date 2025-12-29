package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
	    String acttitle=driver.getTitle();
    if(acttitle.equals("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com"))
	    		{
	    	System.out.println("Test Case passed");
	    		}
	    else {
	    	System.out.println("Test Case Failed");
	    }
         driver.close();

	}

}
