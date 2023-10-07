package actitime;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utiliy.SeleniumUtility;

public class ActitimeTaskCreation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("Chrome", "https://demo.actitime.com/login.do");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.className("tasks")).click();

		WebElement task = driver.findElement(By.className("ellipsis"));
		task.click();

		driver.findElement(By.className("createNewTasks")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".customerSelector>div>.comboboxButton>.selectedItem")).click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated((By.cssSelector(".customerSelector .searchItemList"))));

		List<WebElement> customerList = driver.findElements(By.cssSelector(".customerSelector .searchItemList>div"));
		if (customerList.size() > 2) {
			customerList.get(customerList.size() - 1).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".projectSelector>div>.comboboxButton>.selectedItem")).click();
			Thread.sleep(2000);
			List<WebElement> projectList = driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
			if (projectList.size() > 3) {
				projectList.get(3).click();
			} else {
				projectList.get(0).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector(".selectProjectRow .newProject ")).sendKeys("iphone pro 15");

			}
		} else {
			customerList.get(0).click();
			Thread.sleep(2000);
			List<WebElement> newInputFields = driver.findElements(By.cssSelector(".newCustomerProjectField"));
			newInputFields.get(0).sendKeys("apple");
			newInputFields.get(1).sendKeys("promax");
		}

		driver.findElement(By.cssSelector("tbody>tr>td>input[placeholder='Enter task name']")).sendKeys("Automation");

		driver.findElement(By.cssSelector(".billingTypeCell >.typeOfWorkButton ")).click();
		driver.findElement(By.cssSelector(
				"div.dropdownContainer.components_typeOfWorkMenu.typeOfWorkEditorMenu.addNewTasks>div>div>div>div>div:nth-of-type(11)"))
				.click();

		driver.findElement(
				By.cssSelector(".buttonsBox>.commitButtonPlaceHolder>.components_button>.components_button_label"))
				.click();

		// driver.findElement(By.xpath("//div[text()='Create Tasks']
	}
}
