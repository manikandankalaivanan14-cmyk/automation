package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    int noofbrokenlinks = 0;
	    for(WebElement linkssection :links) {
	    	
	    String alllinks =linkssection.getAttribute("href");
	    
	    if(alllinks==null ||alllinks.isEmpty() ) {
	    	
	    	System.out.println("Links are Empty");
	    	continue;
	    }
	    
	    //Hit url to the server
	    try {
	    URL urllink = new URL(alllinks);
	  HttpURLConnection conn= (HttpURLConnection)urllink.openConnection();
	    
	  conn.connect(); //connect to the server and sent request the server
	  if(conn.getResponseCode()>=400) {
		  
		  System.out.println(alllinks+ " Broken Links");
		  noofbrokenlinks++;
	  }
	  else {
		  System.out.println(alllinks+ " Not a broken Links");
	  }
	    
	    }
	    
	    catch(Exception e)	{}
	    }
	  
	 System.out.println("No of broken links " +noofbrokenlinks);   
	}
	
	
}
