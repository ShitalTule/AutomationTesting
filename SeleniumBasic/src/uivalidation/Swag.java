package uivalidation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.saucedemo.com/");
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	WebElement UserinputField=driver.findElement(By.id("user-name"));
	System.out.println("username field is visible?"+UserinputField.isDisplayed());
	System.out.println("username field is enable or functional?"+UserinputField.isEnabled());
	System.out.println("username field defualt text:"+UserinputField.getAttribute("placeholder"));
	System.out.println("username field border color:"+UserinputField.getCssValue("border-bottom"));
	System.out.println("username text fond size :"+UserinputField.getCssValue("font-size"));
	System.out.println("username text fond family :"+UserinputField.getCssValue("font-family"));
	System.out.println("username text color :"+UserinputField.getCssValue("color"));
	System.out.println("******************************************");
	
	
	WebElement passwordField=driver.findElement(By.id("password"));
	System.out.println("password field is visible?"+passwordField.isDisplayed());
	System.out.println("password  field is enable or functional?"+passwordField.isEnabled());
	System.out.println("password field defualt txt :"+passwordField.getAttribute("placeholder"));
	System.out.println("password field border color:"+passwordField.getCssValue("border-bottom"));
	System.out.println("password field text fond size:"+passwordField.getCssValue("font-size"));
	System.out.println("password field text fond family:"+passwordField.getCssValue("font-family"));
	System.out.println("password field text color:"+passwordField.getCssValue("color"));
	System.out.println("***************************************************");
	

	WebElement Loginbutton=driver.findElement(By.id("login-button"));
	System.out.println("login button is visible?"+Loginbutton.isDisplayed());
	System.out.println("login button is enable?"+Loginbutton.isEnabled());
	System.out.println("login button is :"+Loginbutton.getAttribute("value"));
	System.out.println("background color login button:"+Loginbutton.getCssValue("background-color"));
	System.out.println("login text color:"+Loginbutton.getCssValue("color"));
	System.out.println("login button fond size:"+Loginbutton.getCssValue("font-size"));
	System.out.println("login fond family :"+Loginbutton.getCssValue("font-family"));
	System.out.println("***********************************************");
	
	
	WebElement passinput=driver.findElement(By.id("password"));
	Point ptpass=passinput.getLocation();
	int pass_y=ptpass.getY();
	System.out.println("pass_y:"+pass_y);
	WebElement errormsg2=driver.findElement(By.className("error-message-container"));
	Point pterror2=errormsg2.getLocation();
	int error_y2=pterror2.getY();
	System.out.println("error_y2:"+error_y2);
	System.out.println("error msg is displyed below password field or not?"+(pass_y<error_y2));
	System.out.println("password error msg:"+errormsg2.getText());
	
	System.out.println("error msg text: "+errormsg2.getCssValue("color"));
	System.out.println("error msg background color :"+errormsg2.getCssValue("background-color"));
	System.out.println("error msg text fond size :"+errormsg2.getCssValue("font-size"));
	System.out.println("error msg text fond family :"+errormsg2.getCssValue("font-family"));
	
	
	
	
}
}
