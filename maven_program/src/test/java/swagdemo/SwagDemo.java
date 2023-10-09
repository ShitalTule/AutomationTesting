package swagdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class SwagDemo extends SeleniumUtil{
	@BeforeTest
	public void precondition() {
		WebDriver driver=setUp("Chrome","https://www.saucedemo.com/inventory.html");
	}
	
  @Test
  public void LoginCredentials(){
	  typeInput(driver.findElement(By.id("user-name")),"standard_user");
	  typeInput(driver.findElement(By.id("password")),"secret_sauce");
	  clickOnElement(driver.findElement(By.id("login-button")));
  }
  @Test
  public void product() throws InterruptedException {
	  String homeWinId=driver.getWindowHandle();
	  System.out.println("Home win id"+homeWinId);
	  clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));
	  clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
	 WebElement bag=driver.findElement(By.cssSelector("#item_4_title_link>div"));
	 Thread.sleep(1000);
	 String ActualName=(bag.getText());
	 String ExpectedName="Sauce Labs Backpack";
	 System.out.println(ActualName.equals(ExpectedName));
	  Thread.sleep(1000);
	 WebElement Tshirt=driver.findElement(By.cssSelector("#item_1_title_link>div"));
	 String ActualName1=(Tshirt.getText());
	 String ExpectedName1="Sauce Labs Bolt T-Shirt";
	 System.out.println(ActualName1.equals(ExpectedName1));
	 Thread.sleep(1000);
	 clickOnElement( driver.findElement(By.className("shopping_cart_link")));
	 clickOnElement( driver.findElement(By.id("checkout")));
	 Thread.sleep(1000);
	 typeInput(driver.findElement(By.id("first-name")),"Sai");
	 typeInput( driver.findElement(By.id("last-name")),"Joshi");
	 typeInput( driver.findElement(By.id("postal-code")),"0101");
	 clickOnElement(driver.findElement(By.id("continue")));
	 Thread.sleep(1000);
	 clickOnElement( driver.findElement(By.id("finish")));
	 WebElement sucessMsg=driver.findElement(By.id("checkout_complete_container"));
	 Thread.sleep(1000);
	String Actualmsg= sucessMsg.getText();
	System.out.println("Actual msg"+Actualmsg);
	String ExpectedMsg="Thank you for your order!\n"
			+ "Your order has been dispatched, and will arrive just as fast as the pony can get there!\n"
			+ "Back Home";
	System.out.println(Actualmsg.equals(ExpectedMsg));
	clickOnElement(driver.findElement(By.id("back-to-products")));
	driver.switchTo().window(homeWinId);
	String ActualTiltle=driver.getTitle();
	String ExpectedTitle="Swag Labs";
	System.out.println(ActualTiltle.equals(ExpectedTitle));
  }
  @AfterTest
  public void PostCondition() {
	  driver.close();
	  driver.quit();
  }
  
}
