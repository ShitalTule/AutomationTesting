package xpathprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.DiscreteDomain;

import utiliy.SeleniumUtility;

public class FilpkardNameAndPrize {
	


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
		WebDriver driver=setUp("Chrome","https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNob3AgTm93Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&fm=neo%2Fmerchandising&iid=M_0e4af7c1-3171-4c02-b8ab-7e22c885ef69_5.TY6OUL5ASJ9P&ppt=browse&ppn=browse&ssid=gtrep4frxc0000001691833161754&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut");
		driver.findElement(By.tagName("Login")).click();
		WebElement Samsung=	driver.findElement(By.xpath("//div[div[div[text()='SAMSUNG Galaxy F54 5G (Stardust Silver, 256 GB)']]]"));
	System.out.println("divice name"+Samsung.getText());
	}
}
//div[div[div[text()='SAMSUNG Galaxy F54 5G (Stardust Silver, 256 GB)']]]