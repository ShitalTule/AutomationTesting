package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME {
	public static void main(String[] args) {
		ChromeDriver  driver =new ChromeDriver();           //open browser
		driver.get("https://demo.actitime.com/");    //enter application url
		String sourceCode=driver.getPageSource();//get page source
		System.out.println("Source code lenght: "+sourceCode.length());
		String actualTitle=driver.getTitle();      //get current title from application
		System.out.println("Actal Title :"+driver.getTitle());
		String ExpectedTitle="actiTIME - Login";
		System.out.println("is actiTIMe page open? "+actualTitle.equals(ExpectedTitle));
		driver.close();    //close browser
		
	}
}
