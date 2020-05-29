import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Netflix {
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties p=new Properties();
		FileInputStream chro = new FileInputStream("C:\\chrome installation for selenium\\chromePath.properties");
		p.load(chro);
		System.setProperty("webdriver.chrome.driver",p.getProperty("chromepath"));//here we used properties file to fetch chromedriver path
		chro.close();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Darshana\\Desktop\\NtflxID.properties");
		p.load(fis);
		driver.findElement(By.xpath("//a[@class='authLinks redButton']")).click();
		
		String uid=p.getProperty("Ntflx_uid");	
		String pwd=p.getProperty("Ntflx_psw");	
		fis.close();
		driver.findElement(By.id("id_userLoginId")).sendKeys(uid);
		driver.findElement(By.id("id_password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='appMountPoint']/div/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a/div/div")).click();
		
		driver.findElement(By.xpath("//div[@class='searchBox']")).click();
		driver.findElement(By.xpath("//input[@name='searchInput']")).sendKeys("tHE 100",Keys.ENTER) ;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='row-0']//div[@class='slider-item slider-item-0']//div[@class='title-card-container']"));
		//driver.findElement(By.xpath("//button[@class='button-primary medium hasLabel ltr-zcbuhc']")).click();
		
		
		
		
		//List<WebElement> we =driver.findElements(By.xpath("//*[@id='row-0']/div/div/div/div/div/child::*"));
		
		
		//List<WebElement> we = driver.findElements(By.xpath("//div[@id='row-0']//div[@class='sliderContent row-with-x-columns']"));
		//System.out.println(we.size());
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a[2]")).click();
		
	//	int x = driver.findElement(By.xpath("//div[@class='galleryLockups']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//img[1]")).getLocation().getX();
	//	int y = driver.findElement(By.xpath("//div[@class='galleryLockups']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//img[1]")).getLocation().getY();
		
	//	System.out.println(x+" "+y);
		//int y = driver.findElement(By.xpath("//div[@id='title-card-0-0']//img[@class='boxart-image boxart-image-in-padded-container']")).getLocation().getY();
		//div[@class='galleryLockups']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//img[1]    ++++++
		//div[@id='row-0']//div[@class='sliderContent row-with-x-columns']
		
		
		
		//new Actions(driver).moveByOffset(x, y).click();
		//driver.quit();
		
		//*[@id="title-card-0-0"]/div[1]/a/div[1]/img
		
		
		
		

		}
	
}
