import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
https://miniemr-gdhqa.sdglobaltech.com/#/

Login: 10391039

Put Wait 

Go to Dashboard
*/

public class CliniCare_Wait_Example {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", GlobVar.chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implicit
		// wait(Applies Globally)
		driver.get("https://miniemr-gdhqa.sdglobaltech.com/");

		List<String> passwd = Arrays.asList("1", "0", "3", "9", "1", "0", "3", "9");

		List<WebElement> indiNos = driver.findElements(By.cssSelector("button.btnLogin.mat-button"));

		for (String code : passwd) {

			for (WebElement element : indiNos) {

				if (element.getText().contains(code))
					element.click();

			}

		}

//		driver.findElement(By.cssSelector("input.mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored.ng-untouched.ng-pristine.ng-valid")).sendKeys("10391039");
		driver.findElement(By.cssSelector(
				"input.mat-input-element.mat-form-field-autofill-control.cdk-text-field-autofill-monitored.ng-untouched.ng-pristine.ng-valid"))
				.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img.navbar-brand-logo")));
		driver.findElement(
				By.cssSelector("mat-icon.profile-down-arrow.mat-icon.notranslate.material-icons.mat-icon-no-color"))
				.click();
		driver.findElements(By.cssSelector("div.mat-form-field-flex")).get(2).click();
		driver.findElements(By.cssSelector("mat-option.mat-option.ng-star-inserted")).get(4).click();

		/*
		 * Fluent wait allows to put conditional return Due to its customized method
		 * functionality
		 */

		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(4))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement fluentWt = wait1.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				// here we can put condition if needed(mentioned on line 68) ,which is not
				// possible using WebDriver wait -can refer lecture 82 for condition example
				return driver.findElement(
						By.cssSelector("mat-header-row.tableHeader.mat-header-row.mat-table-sticky.ng-star-inserted"));
			}
		});

		System.out.println(
				driver.findElements(By.cssSelector("mat-row.element-row.tableRow.mat-row.ng-star-inserted")).size());
		
		driver.close();


	}

}
