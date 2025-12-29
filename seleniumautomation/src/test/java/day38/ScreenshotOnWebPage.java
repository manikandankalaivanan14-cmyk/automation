package day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOnWebPage {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		// 1) Full page Screenshot
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);
		*/
		// 2) Capture the screenshot of specific section
	/*WebElement featuredproducts=driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
	
	File sourcefile=featuredproducts.getScreenshotAs(OutputType.FILE);
	File targetfile= new File(System.getProperty("user.dir")+"\\screenshots\\feature.png");
	sourcefile.renameTo(targetfile);
		*/
		
		//3)Capture the screenshot of WebElement
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	File sourcefile =	logo.getScreenshotAs(OutputType.FILE);
	File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
	sourcefile.renameTo(targetfile);
	driver.quit();
		

	}

}
