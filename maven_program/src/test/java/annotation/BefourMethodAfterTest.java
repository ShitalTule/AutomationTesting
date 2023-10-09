package annotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class BefourMethodAfterTest extends SeleniumUtil {
	@BeforeTest
	public void priconditions() {
		WebDriver driver=setUp("chrome","https://www.saucedemo.com/");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login done sucessfully...");
	}
	
  @Test(priority=1)
  public void loginCredentials() {
	  typeInput(driver.findElement(By.id("user-name")),"standard_user");
	  typeInput(driver.findElement(By.id("password")),"secret_sauce");
	  clickOnElement(driver.findElement(By.id("login-button")));
  }
  @Test(priority=2)
  public void UIvalitdatuion() {
	  String ExpectedHomePageText="Swag Labs";
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(ExpectedHomePageText));
		String ActualHomePageText=driver.getTitle();
		System.out.println("ExpectedHomePageText is :"+ExpectedHomePageText);
		System.out.println("ActualHomePageText is :"+ActualHomePageText);
		System.out.println("is Saucedemo login? "+ActualHomePageText.equals(ExpectedHomePageText));
		
  }
  @Test(priority=3)
  public void logout() {
	  clickOnElement(driver.findElement(By.id("react-burger-menu-btn")));
		
		clickOnElement(driver.findElement(By.id("logout_sidebar_link")));
  }
  @AfterMethod
  public void logout1() {
	  System.out.println("logout sucessfully...");
  }
  @AfterTest
  public void postCondition() {
	  driver.close();
  }
}
