package xpathprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {


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
		
		WebDriver driver=setUp("Chrome","https://www.amazon.in/gcx/Gifts-for-Everyone/gfhz/?ref_=nav_cs_giftfinder&scrollState=eyJpdGVtSW5kZXgiOjAsInNjcm9sbE9mZnNldCI6Mjk2LjIxMjQ5Mzg5NjQ4NDR9&sectionManagerState=eyJzZWN0aW9uVHlwZUVuZEluZGV4Ijp7ImFtYWJvdCI6MH19");
		 WebElement palystation=driver.findElement(By.xpath("//div[div[span[text()='God of War | PS4 Game (PlayStation 4)']]]"));
		System.out.println("paystation name and prize:"+palystation.getText());
	}
}
