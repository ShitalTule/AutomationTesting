package utiliy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtility {

	public static WebDriver setUp(String BrowserName,String url) {
		WebDriver driver=null;
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
}
	}
