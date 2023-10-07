package loginApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerLogin {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
	WebElement userNameInputField =driver.findElement(By.id("username"));
	userNameInputField.clear();
	userNameInputField.sendKeys("Admin");
	
	WebElement passwordInputField=driver.findElement(By.name("password"));
	passwordInputField.clear();
	passwordInputField.sendKeys("admin");
	 
	WebElement loginButton=driver.findElement(By.tagName("button"));
	loginButton.click();
	String ExpectedHomePageText="Dashboard";
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.titleIs(ExpectedHomePageText));
	String ActualHomePageText=driver.getTitle();
	System.out.println("ExpectedHomePageText is :"+ExpectedHomePageText);
	System.out.println("ActualHomePageText is :"+ActualHomePageText);
	System.out.println("is Vtiger Login?"+ActualHomePageText.equals(ExpectedHomePageText));
	
	
	driver.findElement(By.className("userName")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	String ExpectedHomeText="vtiger";
	wait.until(ExpectedConditions.titleIs(ExpectedHomeText));
	String ActualHomeText=driver.getTitle();
	System.out.println("is Vtiger logout?"+ActualHomeText.equals(ExpectedHomeText));
	driver.close();
	
	
	
	
	
	
	/*String actualTitle = driver.getTitle(); // get current title from application
	System.out.println("Actal Title :" + driver.getTitle());
	String ExpectedTitle = "vtiger";
	System.out.println("is vtiger page open? " + actualTitle.equals(ExpectedTitle));*/
}
}