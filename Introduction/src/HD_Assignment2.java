import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
Open facebook.com
And fill up sign up form
 */


public class HD_Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", GlobVar.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
				driver.findElement(By.id("u_0_m")).sendKeys("Alva"); //First Name
				driver.findElement(By.id("u_0_o")).sendKeys("Cooper");//Surname
				driver.findElement(By.id("u_0_r")).sendKeys("18765687"); //Mobile Number or Email
				driver.findElement(By.id("u_0_w")).sendKeys("ACooper*"); //Password
				new Select(driver.findElement(By.id("day"))).selectByValue("26"); //BDay
				new Select(driver.findElement(By.id("month"))).selectByIndex(12); //Bmonth
				new Select(driver.findElement(By.id("year"))).selectByValue("1978");//Byear
				driver.findElement(By.id("u_0_6")).click();   //Gender
				Thread.sleep(1000);
				driver.findElement(By.id("u_0_7")).click();   //Gender
				Thread.sleep(1000);
				driver.findElement(By.id("u_0_8")).click();     //Gender
				new Select(driver.findElement(By.xpath("//select[@name='preferred_pronoun']"))).selectByIndex(3);//GenderSubCustom
				driver.findElement(By.id("u_0_11")).sendKeys("Bisexual");//GenderSubCustom
				driver.findElement(By.id("u_0_13")).click();   
				driver.close();
	
			
	}
}
