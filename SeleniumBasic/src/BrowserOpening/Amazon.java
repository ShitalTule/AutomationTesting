package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	ChromeDriver  driver =new ChromeDriver(); //open browser
	 driver.get("https://www.amazon.in/");//enter application url
	 String sourceCode=driver.getPageSource();//get page source
		System.out.println("Source code lenght: "+sourceCode.length());
		String actualTitle=driver.getTitle();      //get current title from application
		System.out.println("Actal Title :"+driver.getTitle());// get Actual title 
		String ExpectedTitle="Amazon.in";
		System.out.println("is OrangeHRM page open? "+actualTitle.equals(ExpectedTitle));
		driver.close();    //close browser
}
}

