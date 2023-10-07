package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class custom_DropdownHandling {

	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		

		
		return driver;
		
	}
	public static void main(String[] args) {
		WebDriver driver=setUp("Chrome","https://demo.actitime.com/login.do");
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		// for task clicking
		driver.findElement(By.className("tasks")).click();
		
		// for clicking on add new
		WebElement task=driver.findElement(By.className("ellipsis"));
		task.click();
	
		// for select new task clicking
		driver.findElement(By.className("createNewTasks")).click();
	//	w1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("tbody>.selectCustomerRow>td>div>div>div>.dropdownButton")));
		
		// for customer dropdown options and clicking
	   driver.findElement(By.cssSelector(".customerSelector>div>.comboboxButton>.selectedItem")).click();
	   
		
	/*List<WebElement> options=  driver.findElements(By.cssSelector(".scrollableDropdownView>div>div>div>.itemRow "));
	System.out.println(" customer options count :"+options.size());
	 w1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("tbody>.selectCustomerRow>td>div>div>div>.dropdownButton")));
	for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
	}
	options.get(3).click();*/
	
	driver.findElement(By.cssSelector(".projectSelector>div>.comboboxButton>.selectedItem")).click();
	/*w1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector>div>div>.dropdownButton")));
	
	List<WebElement> options1=driver.findElements(By.cssSelector(".scrollableDropdownView>div>div>.searchItemList"));
	System.out.println(" project Options1 count :"+options1.size());
	w1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector>div>div>.dropdownButton")));
	for(int i=0;i<options1.size();i++) {
		System.out.println(options1.get(i).getText());
	}
	options1.get(14).click();*/
	
	
	//enter task name
	driver.findElement(By.cssSelector("tbody>tr>td>input[placeholder='Enter task name']")).sendKeys("Automation");
	
	//type of work tesing
	driver.findElement(By.cssSelector(".billingTypeCell>.typeOfWorkButton.editable>div[class='value ellipsis']")).click();
	
	
	//create task
	driver.findElement(By.cssSelector(".commitButtonPlaceHolder>div>.components_button_label")).click();
	
	
	
	
	
		
		
		
	}
}
