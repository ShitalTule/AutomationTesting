package testNg_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class ActitimeLoginValidation extends SeleniumUtil {
	@Test
	public void testActitime_validData() {
		WebDriver driver = setUp("chrome", "https://demo.actitime.com/login.do");
		typeInput(driver.findElement(By.id("username")), "admin");
		typeInput(driver.findElement(By.name("pwd")), "manager");
		clickOnElement(driver.findElement(By.id("loginButton")));
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		String actualHomePageTitle = getCurrentPageTitle("actiTIME - Enter Time-Track");

		// System.out.println("is Home page displayed?
		// "+actualHomePageTitle.equals(expectedHomePageTitle));

		// Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
		// Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle,"Either login
		// failed or home page title changed");

		// Assert.assertTrue(actualHomePageTitle.equals(expectedHomePageTitle));
		Assert.assertTrue(actualHomePageTitle.equals(expectedHomePageTitle),
			"Either login failed or home page title changed");
	}
}
