import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Navigate to Gmail (https://www.gmail.com)
Login to your Gmail with correct credentials.
Verify that by default “Primary” section is selected.
If not click on the Primary tab.
Get the count of the total number of emails in the Primary tab.
Get the name of the sender and subject of Nth Email of your inbox.
Write a method to get the name of the sender and subject of email of your inbox.
*/

public class HD_Assignment3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", GlobVar.chromeDriverPath);
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys("darshanayeolekar29");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		
	//	driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys("Darshana$29");
		
	//	driver.findElement(By.cssSelector("input.ZFr60d.CeoRYc")).click();
		
		
		
		
		
		
		
	

	}

}
