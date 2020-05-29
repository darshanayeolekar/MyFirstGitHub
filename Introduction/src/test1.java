

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",GlobVar.chromeDriverPath);
	
		

						
		WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized")) ;
		driver.get("https://www.amazon.in/");
				
		WebElement AcLists = driver.findElement(By.id("nav-link-accountList"));
		
		//Actions action = new Actions(driver);
		
		
		new Actions(driver).moveToElement(AcLists).perform();
		
		WebElement YourLst =driver.findElement(By.id("searchDropdownBox"));
		
		Select sublist = new Select(YourLst);
		
		List<WebElement> ListV= sublist.getOptions();
		
		for(int i=0;i<ListV.size();i++)
		{
			System.out.println(ListV.get(i).getText());
					
		}
		
		
		
		WebElement sin = driver.findElement(By.className("nav-action-inner"));
		sin.click();
		
		WebElement unm = driver.findElement(By.id("ap_email"));
		unm.sendKeys("9021240555");
		
		WebElement cntn = driver.findElement(By.id("continue"));
		cntn.click();
			
		
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("Pass@123");
		
		WebElement lgn = driver.findElement(By.id("signInSubmit"));
		lgn.click();
		
		}
}
