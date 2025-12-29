package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String filepath = System.getProperty("user.dir")+"\\testdata\\Dynamicdata.xlsx";
	     int row=ExcelUtils.getRowCount(filepath, "Sheet1");
	     
	     for(int i=1;i<=row;i++) {
	    	 //Read data from excel
	    	String principle= ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
	    	String roi= ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
	    	String period1=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
	    	String period2= ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
	    	String fre= ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
	    	String mvalue= ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
	    	 
	    	// Pass above  data into application
	    	 driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
	    	 driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
	    	 driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
	         Select perdrp= new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
	         perdrp.selectByVisibleText(period2);
	         Select fredrp= new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
	         fredrp.selectByVisibleText(fre);
	        WebElement click= driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", click);
	         
	         //Validation
	     String actmvalue  = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
	     
	     if(Double.parseDouble(actmvalue)==Double.parseDouble(mvalue)) {
	    	 System.out.println("Test case passed");
	    	 ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "Passed");
	    	 ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
	     }
	     else {
	    	 System.out.println("Test case failed");
	    	 ExcelUtils.setCellData(filepath, "Sheet1", i, 7, "failed");
	    	 ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
	     }
	     Thread.sleep(3000);
	   WebElement clr=  driver.findElement(By.xpath("//img[@class='PL5']"));
	     JavascriptExecutor jx = (JavascriptExecutor) driver;
	        jx.executeScript("arguments[0].click();", clr);
	     }
	   
	     
	   
	   driver.quit();
	}

}
