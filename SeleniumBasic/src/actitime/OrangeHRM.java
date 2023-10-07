package actitime;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utiliy.SeleniumUtility;

public class OrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtility.setUp("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Sai");
		driver.findElement(By.name("lastName")).sendKeys("Kale");
		
	/*	WebElement id=driver.findElement(By.cssSelector(".oxd-form-row>.oxd-grid-2.orangehrm-full-width-grid>div>div>div>.oxd-input.oxd-input--active"));
		id.clear();
		id.sendKeys("1111");*/
	Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-form-actions>.orangehrm-left-space")).click();
		 
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		driver.findElement(By.cssSelector(".oxd-form-row>div>div>div>div>div>.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active>input")).sendKeys("sai kale");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-form-actions>.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")).click();
		
		/*driver.findElement(By.cssSelector(".oxd-table-cell-actions>button>.oxd-icon.bi-pencil-fill")).click();
		Thread.sleep(2000);
	List<WebElement> bloodType=	driver.findElements(By.cssSelector(".orangehrm-custom-fields>div>form>div>div>div>div>div>div>div>.oxd-select-text--after>i"));
	bloodType.get(1).click();*/
	
		driver.findElement(By.cssSelector(".oxd-table-cell-actions>button>.oxd-icon.bi-trash")).click();
		driver.findElement(By.cssSelector(".orangehrm-modal-footer>.oxd-button--label-danger>.bi-trash")).click();
		
	}
}
