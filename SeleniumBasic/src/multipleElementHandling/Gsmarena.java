package multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gsmarena {
	public static void main(String[] args) {
		WebDriver driver=setUp("Chrome","https://www.gsmarena.com/");
		
		
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#wrapper>div>#body>.sidebar.col.left>div>ul>li"));
		System.out.println("Divice count :"+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
			System.out.println(deviceList.get(i).getText());
		}
	}
	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
		
}
	}
