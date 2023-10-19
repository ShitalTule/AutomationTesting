package swagLabsTestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SwagDemoWebPages.SwagLabsBackToHome;

import SwagDemoWebPages.SwagLabsCheckOutContinue;
import SwagDemoWebPages.SwagLabsCheckOutPages;
import SwagDemoWebPages.SwagLabsContinuesStep2;
import SwagDemoWebPages.SwagLabsHomePage;
import SwagDemoWebPages.SwagLabsLoginPage;
import utilities.SeleniumUtil;

public class SwagLabsDoOrder extends  SeleniumUtil{
	WebDriver driver;
	SwagLabsLoginPage getSwagLabsLoginPage;
	SwagLabsHomePage getSwagLabsHomePage;
	SwagLabsCheckOutPages getSwagLabsCheckOutPages;
	SwagLabsCheckOutContinue getSwagLabsCheckOutContinue;
	SwagLabsContinuesStep2 getSwagLabsContinuesStep2;
	SwagLabsBackToHome getSwagLabsBackToHome;
	
	@BeforeTest
	public void precondition() {
		driver =setUp("Chrome","https://www.saucedemo.com/inventory.html");
		getSwagLabsLoginPage =new SwagLabsLoginPage(driver);
		
		getSwagLabsHomePage =new SwagLabsHomePage(driver);
		getSwagLabsCheckOutPages=new SwagLabsCheckOutPages(driver);
		getSwagLabsCheckOutContinue=new SwagLabsCheckOutContinue(driver);
		getSwagLabsContinuesStep2=new SwagLabsContinuesStep2(driver);
		getSwagLabsBackToHome=new SwagLabsBackToHome(driver);
		
		
	}
	
	
  @Test
  public void login() {
	  getSwagLabsLoginPage.login("standard_user","secret_sauce");
	  
  }
  
  @Test(priority=1)
  public void clickOnCartbtn() {
	  getSwagLabsHomePage.addCart();
	  getSwagLabsCheckOutPages.checkOut1();
	  getSwagLabsCheckOutContinue.CheckOut1stStep();
	  getSwagLabsContinuesStep2.finishbtn();
  }
  
  @Test(priority=2)
  public void BackToHome() {
	  getSwagLabsBackToHome.backToHomepage();
  }
  @AfterTest
  public void postConditions() {
	  driver.close();
  }
}
