import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_Case_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",GlobVar.chromeDriverPath);
		WebDriver cd = new ChromeDriver();
		
		cd.get("http://google.com");
		
		
		System.out.println(cd.getTitle()) ;
		
/*			int a=6,b=3,c ;
			
			System.out.println(a+b);
*/
	}

}
