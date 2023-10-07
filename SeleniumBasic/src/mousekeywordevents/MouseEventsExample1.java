package mousekeywordevents;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utiliy.SeleniumUtility;

public class MouseEventsExample1 {
public static void main(String[] args) {
	
	WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.automationtesting.in/Register.html");
	Actions action =new Actions(driver);
	WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("pune");
	action.moveToElement(firstName).doubleClick().perform();
	action.keyDown(Keys.CONTROL).sendKeys("c");
	
	
}
}
