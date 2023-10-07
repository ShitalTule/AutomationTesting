package multipleElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automationtesting {

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
	public static void main(String[] args) {
		WebDriver driver=setUp("Chrome","https://demo.automationtesting.in/Register.html");
		List<WebElement> Labels=driver.findElements(By.cssSelector("#header>nav>div>.navbar-collapse.collapse.navbar-right>ul>li"));
		System.out.println("lables name and count :"+Labels.size());
		for(int i=0;i<Labels.size();i++) {
			System.out.println(Labels.get(i).getText());
		}
		
	}
}
