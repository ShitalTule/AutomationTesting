package testNg_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Vtiger extends SeleniumUtil {
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		typeInput(driver.findElement(By.id("username")), "Admin");
		typeInput(driver.findElement(By.id("password")), "admin");
		clickOnElement(driver.findElement(By.tagName("button")));

		  
		  clickOnElement(driver.findElement(By.cssSelector("#appnavigator>div")));
		  clickOnElement(driver.findElement(By.xpath("//span[text()=' MARKETING']")));
		  clickOnElement(driver.findElement(By.xpath("//span[text()=' Leads']")));
		  driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")), "Joshi");
		clickOnElement(driver.findElement(By.cssSelector(".saveButton")));

		WebElement leads = driver.findElement(By.cssSelector(".text-uppercase"));
		leads.click();
		clickOnElement(driver.findElement(By.cssSelector(".overflow-y>tr>td>div>span>.listViewEntriesCheckBox")));

		/*clickOnElement(driver.findElement(By.cssSelector("#listview-actions>div>div>div>button>.fa.fa-pencil"))); //
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")), "Sai");
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_mobile")), "8844665577");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Save']")));*/

		clickOnElement(driver
				.findElement(By.cssSelector("#listview-actions>div>div>div>#Leads_listView_massAction_LBL_DELETE")));
		clickOnElement(driver.findElement(By.xpath("//button[text()='Yes']")));
		driver.navigate().refresh();

	}
}
