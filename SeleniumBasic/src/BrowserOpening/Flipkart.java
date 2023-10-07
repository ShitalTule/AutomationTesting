package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//open browser
		driver.get("https://www.flipkart.com/");//enter application url
		String sourceCode = driver.getPageSource();//get page source
		System.out.println("Source code lenght: " + sourceCode.length());
		String actualTitle = driver.getTitle(); // get current title from application
		System.out.println("Actal Title :" + driver.getTitle());
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("is OrangeHRM page open? " + actualTitle.equals(ExpectedTitle));
		driver.close(); // close browser
	}
}
