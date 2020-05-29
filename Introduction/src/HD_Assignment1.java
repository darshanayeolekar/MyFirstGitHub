/*
 	1. Go to google.
	2. Search for amazon
	3. from dropdown click on amazon india
	4. show the result
	5. Close browser window
*/

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HD_Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", GlobVar.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		
		WebElement GoToSearch = driver.findElement(By.name("q"));
		GoToSearch.sendKeys("amazon"); 
		//GoToSearch.sendKeys(Keys.ENTER);					

		Thread.sleep(3000);

		List<WebElement> DynList = driver.findElements(By.xpath("//ul[@class='erkvQe']/child::*"));
		System.out.println("Search length: " + DynList.size());

		for (WebElement e : DynList) {
			String s = e.getText().toLowerCase();
			if (s.contains("INDIA".toLowerCase())) {
				e.click();
				driver.findElement(
						By.xpath("//h3[contains(text(),'Online Shopping site in India: Shop Online for Mob')]")).click();

			}
		}

		driver.quit();
	}

}
