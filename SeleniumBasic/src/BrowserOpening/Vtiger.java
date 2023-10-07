package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // open browser
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");// enter application url
		String sourceCode = driver.getPageSource();//get page source
		System.out.println("Source code lenght: " + sourceCode.length());
		String actualTitle = driver.getTitle(); // get current title from application
		System.out.println("Actal Title :" + driver.getTitle());
		String ExpectedTitle = "vtiger";
		System.out.println("is vtiger page open? " + actualTitle.equals(ExpectedTitle));
		driver.close(); // close browser
	}
}
