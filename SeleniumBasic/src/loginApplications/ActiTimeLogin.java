package loginApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(500,600));
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
	
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String ExpectedHomePageText="actiTIME - Enter Time-Track";
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));//explicit wait
		wait.until(ExpectedConditions.titleIs(ExpectedHomePageText));
         String ActualHomePageText=driver.getTitle();
		
		System.out.println("ActualHomePageText is :"+ActualHomePageText);
		System.out.println("ExpectedHomePageText is :"+ExpectedHomePageText);
		System.out.println("is actiTIME Login?"+ActualHomePageText.equals(ExpectedHomePageText));
		driver.findElement(By.id("container_reports")).click();  //click on report tab
		driver.navigate().back();  //to come back to home page
		driver.navigate().forward();  //again goto reports page
		driver.navigate().refresh();   ////to refresh page
		driver.findElement(By.id("logoutLink")).click();
		String ExpectedTitle="actiTIME - Login";
		wait.until(ExpectedConditions.titleIs(ExpectedTitle));
		String actualTitle=driver.getTitle();      //get current title from application
		System.out.println("Actal Title :"+driver.getTitle());
		System.out.println("Expected Title is :"+ExpectedTitle);
		System.out.println("is actiTIMe page Logout? "+actualTitle.equals(ExpectedTitle));
		driver.navigate().to("https://www.google.com/");
		driver.close();
		
	}
}
