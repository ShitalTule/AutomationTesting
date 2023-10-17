package OrangeHRmTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPagesOrangeHRm.AddNewPimPage;
import WebPagesOrangeHRm.DashBoradPage;
import WebPagesOrangeHRm.EmployeeListPage;
import WebPagesOrangeHRm.OrangeHRM_LoginPage;
import WebPagesOrangeHRm.OrangeHRmPersonalDetails;
import WebPagesOrangeHRm.PIM_Home_Page;
import utilities.SeleniumUtil;

public class OrangeHRmLogin  extends SeleniumUtil{
	WebDriver driver;
	
	OrangeHRM_LoginPage getOrangeHRM_LoginPage;
	
	PIM_Home_Page getPIM_Home_Page;
	
	DashBoradPage getDashBoradPage;
	
	AddNewPimPage getAddNewPimPage;
	
	OrangeHRmPersonalDetails getOrangeHRmPersonalDetails;
	
	EmployeeListPage getEmployeeListPage;
	
	@BeforeTest
	public void precondition() {
		driver =setUp("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		getOrangeHRM_LoginPage =new OrangeHRM_LoginPage(driver);
		getPIM_Home_Page=new PIM_Home_Page(driver);
		getDashBoradPage =new DashBoradPage(driver);
		getAddNewPimPage =new AddNewPimPage(driver);
		getOrangeHRmPersonalDetails=new OrangeHRmPersonalDetails(driver);
		getEmployeeListPage =new EmployeeListPage(driver);
	}
  @Test
  public void login() {
	  getOrangeHRM_LoginPage.loginInOrangeHrmApplication("Admin", "admin123");
	  
  }
  @Test
  public void pimCreate() {
	  getDashBoradPage.PimClick();
	  getPIM_Home_Page.addEmployee();
	  getAddNewPimPage.AddNewPimEmployee();
	  
}
  @Test
  public void pimUpdate() throws Throwable {
	  getOrangeHRmPersonalDetails.clickOnEditBtn();
	  
  }
  @Test
  public void pimdelete() throws Throwable {
	  getEmployeeListPage.clickOnDeleteBtn();
  }
  @AfterTest
  public void postcondition() {
	  driver.close();
  }
}