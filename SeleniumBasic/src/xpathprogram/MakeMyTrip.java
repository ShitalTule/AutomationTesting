package xpathprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {

	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		

		
		return driver;
}
	public static void main(String[] args) {
		WebDriver driver=setUp("Chrome","https://www.makemytrip.com/holidays-india/");
		WebElement vitnam=driver.findElement(By.xpath("//div[p[text()='Vietnam']]/p[2]"));
		System.out.println("name of  trip:"+vitnam.getText());
	}
	}
