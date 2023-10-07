package loginApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaucedemoLogin {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
   
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	String ExpectedHomePageText="Swag Labs";
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleIs(ExpectedHomePageText));
	String ActualHomePageText=driver.getTitle();
	System.out.println("ExpectedHomePageText is :"+ExpectedHomePageText);
	System.out.println("ActualHomePageText is :"+ActualHomePageText);
	System.out.println("is Saucedemo login? "+ActualHomePageText.equals(ExpectedHomePageText));
	driver.findElement(By.id("react-burger-menu-btn")).click();
	
	driver.findElement(By.id("logout_sidebar_link")).click();
	
//	driver.close();
	
	 String ActualTitle=driver.getTitle();

		String ExpectedTitle="Swag Labs";
		System.out.println("is Swag Labs logout?"+ActualTitle.equals(ExpectedTitle));
		driver.close();
}
}
