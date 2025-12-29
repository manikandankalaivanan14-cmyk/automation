package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
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
