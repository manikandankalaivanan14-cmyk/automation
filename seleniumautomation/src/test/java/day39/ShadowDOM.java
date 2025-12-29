package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		//driver.get("https://dev.automationtesting.in/shadow-dom");
		
		
		//This Element is inside single shadow DOM.
//		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//		Thread.sleep(1000);
//		String shadowelement=shadow.findElement(By.cssSelector("#shadow-element")).getText();
//		System.out.println(shadowelement);
//		
		//This Element is inside 2 nested shadow DOM.
		
		/*SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		String nestedshadowele=shadow1.findElement(By.cssSelector("#nested-shadow-element")).getText();
		System.out.println(nestedshadowele);*/
		
		//This Element is inside 3 nested shadow DOM.
		
//		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
//		Thread.sleep(1000);
//		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
//		Thread.sleep(1000);
//		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
//		Thread.sleep(1000);
//		String multinestedelement=shadow2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
//		System.out.println(multinestedelement);
		driver.get("https://books-pwakit.appspot.com/");
		//This Element is inside single shadow DOM.
	
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("WELCOME");

	}

}
