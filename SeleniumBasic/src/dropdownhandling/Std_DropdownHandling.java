package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Std_DropdownHandling {

	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
		
	}
	
	public static void main(String[] args) {
		WebDriver driver=setUp("Chrome","https://demo.automationtesting.in/Register.html");
		WebElement skill=driver.findElement(By.id("Skills"));     //step1: identify dropdown list
		
		//Step2: create instance of Select class and pass above dropdown object to its constructor
		Select slt=new Select(skill);    
		System.out.println("is multiSelect allow or not?"+slt.isMultiple());
		System.out.println("default selected valueis :"+slt.getFirstSelectedOption().getText());
		List<WebElement> SkillList=slt.getOptions();
		
		System.out.println("skill list count:"+SkillList.size());
		for(int i=0;i<SkillList.size();i++) {
			System.out.println(SkillList.get(i).getText());
			
		}
		slt.selectByIndex(1);
		System.out.println("skill list selected as index 1 using dropdown:"+slt.getFirstSelectedOption().getText());
		
		slt.selectByValue("APIs");
		System.out.println("skill list options of dropdown using value:"+slt.getFirstSelectedOption().getText());
		
		slt.selectByVisibleText("Backup Management");
		System.out.println("skill list options of dropdown using visible text:"+slt.getFirstSelectedOption().getText());
		
		//validate dropdown element sequence 
		//String Expectedoptions=""
		
		WebElement year=driver.findElement(By.id("yearbox"));
		Select slt1=new Select(year);
		System.out.println(" is multiple select allow or not?"+slt1.isMultiple());
		System.out.println("Default selected value :"+slt1.getFirstSelectedOption().getText());
		
	List<WebElement> yearSlection=slt1.getOptions();
	System.out.println("available year count :"+yearSlection.size());
	for(int i=0;i<yearSlection.size();i++) {
		System.out.println(yearSlection.get(i).getText());
	}
	slt1.selectByIndex(5);
	System.out.println("Dropdown options year selection index as 5: "+slt1.getFirstSelectedOption().getText());
	
	WebElement month=driver.findElement(By.cssSelector("select[placeholder='Month']"));
	Select s1=new Select(month);
	System.out.println("is multiple select avalable or not ?"+s1.isMultiple());
	System.out.println("Default selected vaule:"+s1.getFirstSelectedOption().getText());
	List<WebElement> monthselection= s1.getOptions();
	System.out.println(" month count :"+monthselection.size());
	for(int i=0;i<monthselection.size();i++) {
		System.out.println(monthselection.get(i).getText());
		
	}
	s1.selectByIndex(3);
	System.out.println("Dropdown options of month selection using index 3:"+s1.getFirstSelectedOption().getText());
	
	
	WebElement day=driver.findElement(By.id("daybox"));
	Select s2=new Select(day);
	System.out.println("is multiple seletion allow or not ?"+s2.isMultiple());
	System.out.println("Default selected value :"+s2.getFirstSelectedOption().getText());
	
	List<WebElement> daySelection=s2.getOptions();
	System.out.println("count of day selection :"+daySelection.size());
	for(int i=0;i<=daySelection.size();i++) {
		System.out.println(daySelection.get(i).getText());
	}
	s2.selectByVisibleText("5");
	System.out.println("dropdown value of  day based on index 3:"+s2.getFirstSelectedOption().getText());
	
	
	
	
	}
	
	
}
