package testdataformproperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utiliy.SeleniumUtility;

public class ActitimeLoginAndLogout {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis=new FileInputStream("E:\\Automationsession\\workspace\\SeleniumBasic\\Testdata\\AppData.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String browserName=prop.getProperty("browserName");
	String applictionUrl=prop.getProperty("appUrl");
	String username=prop.getProperty("username");
	String password=prop.getProperty("password");
	//String ExpectedHomePageText=prop.getProperty("ExpectedHomePageText");
	//String ExpectedTitle=prop.getProperty("ExpectedTitle");
	
	

	WebDriver driver=SeleniumUtility.setUp(prop.getProperty("browserName"),prop.getProperty("appUrl"));

	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	String ExpectedHomePageText=prop.getProperty("ExpectedHomePageText");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//explicit wait
	wait.until(ExpectedConditions.titleIs(ExpectedHomePageText));
     String ActualHomePageText=driver.getTitle();
	
	System.out.println("ActualHomePageText is :"+ActualHomePageText);
	System.out.println("ExpectedHomePageText is :"+ExpectedHomePageText);
	System.out.println("is actiTIME Login?"+ActualHomePageText.equals(ExpectedHomePageText));
	driver.findElement(By.id("container_reports")).click();  //click on report tab
	
	driver.findElement(By.id("logoutLink")).click();
	String ExpectedTitle=prop.getProperty("ExpectedTitle");
	wait.until(ExpectedConditions.titleIs(ExpectedTitle));
	String actualTitle=driver.getTitle();      //get current title from application
	System.out.println("Actal Title :"+driver.getTitle());
	System.out.println("Expected Title is :"+ExpectedTitle);
	System.out.println("is actiTIMe page Logout? "+actualTitle.equals(ExpectedTitle));
	driver.navigate().to("https://www.google.com/");
	driver.close();
}
}
