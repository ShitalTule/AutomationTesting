
package loginApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	WebElement userNameInputField=driver.findElement(By.name("username"));
	userNameInputField.sendKeys("Admin");
	
	WebElement passwordInputField=	driver.findElement(By.name("password"));
	passwordInputField.sendKeys("admin123");
	driver.findElement(By.tagName("button")).click();
	String ExpectedHomePageText="OrangeHRM";
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.titleIs(ExpectedHomePageText));
	String ActualHomePageText=driver.getTitle();
	System.out.println("ExpectedHomePageText is :"+ExpectedHomePageText);
	System.out.println("ActualHomePageText is :"+ActualHomePageText);
	System.out.println("is OrangeHRM Login?"+ActualHomePageText.equals(ExpectedHomePageText));
	driver.findElement(By.className("oxd-userdropdown-icon")).click();
	driver.findElement(By.linkText("Logout")).click();
	
	String actualTitle = driver.getTitle(); // get current title from application
	System.out.println("Actal Title :" + driver.getTitle());
	String ExpectedTitle = "OrangeHRM";
	System.out.println("is OrangeHRM page logout? " + actualTitle.equals(ExpectedTitle));
	driver.close();
}
}
