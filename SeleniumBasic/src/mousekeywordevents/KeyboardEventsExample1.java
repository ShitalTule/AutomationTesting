package mousekeywordevents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utiliy.SeleniumUtility;

public class KeyboardEventsExample1 {
 public static void main(String[] args) {
	WebDriver driver=SeleniumUtility.setUp("Chrome"," https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	
}
}
