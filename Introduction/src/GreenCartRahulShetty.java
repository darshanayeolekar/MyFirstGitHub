 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCartRahulShetty {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		

		System.setProperty("webdriver.chrome.driver",GlobVar.chromeDriverPath);
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String[] veggiesGoToCart = { "Beetroot", "Beans", "Brinjal" };
		List<String> veggiesGoToCartList = Arrays.asList(veggiesGoToCart);
		int c = 0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);

		List<WebElement> allVeggies = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < allVeggies.size(); i++) {
			String[] allVeggiesSplitted = allVeggies.get(i).getText().split("-");
			String allVegiesTrimmed = allVeggiesSplitted[0].trim();

			if (veggiesGoToCartList.contains(allVegiesTrimmed)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				c++;

				if (c == veggiesGoToCartList.size())
					break;
			}

		}
		Thread.sleep(3000);
		driver.close();
	}
}
