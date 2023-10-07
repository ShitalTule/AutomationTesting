package windowhandling;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utiliy.SeleniumUtility;

public class Erail {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtility.setUp("Chrome", "https://erail.in/");
		
		String homeWinId=driver.getWindowHandle();
		System.out.println("home window id:"+homeWinId);
		
		driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();
		Set<String> allWinId=driver.getWindowHandles();
		System.out.println("all window id :"+allWinId);
		allWinId.remove(homeWinId);
		System.out.println("after removing home window id,all window id :"+allWinId);
		/*Iterator<String> itr=allWinId.iterator();
		String childWinId=itr.next();*/
		
		String childWinId=allWinId.iterator().next();
		System.out.println("child window id :"+childWinId);
		System.out.println("Befour switching to child window , current window title :"+driver.getTitle());
		
		//now we have child window id to switch
		driver.switchTo().window(childWinId);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs("IRCTC Tourism Official Website | Incredible India Travel & Tour Package"));
		System.out.println("After switching to child window, current window title: "+driver.getTitle());
		
		driver.findElement(By.cssSelector(".left-fliter>div:nth-child(2)>ul>li:nth-child(2)")).click();

	WebElement a1=	driver.findElement(By.xpath("//div[div[div[h5[text()='MATA VAISHNO DEVI DARSHAN WITH SHIVKHORI OR PATNITOP']]]]/div[3]/div"));
	System.out.println("MATA VAISHNO DEVI DARSHAN WITH SHIVKHORI OR PATNITOP :"+a1.getText());
	
	WebElement a2=driver.findElement(By.xpath("//div[div[div[h5[text()='RANN UTSAV WEEKEND PACKAGE WITH TRAIN TICKETS']]]]/div[3]/div"));
	System.out.println("RANN UTSAV WEEKEND PACKAGE WITH TRAIN TICKETS:"+a2.getText());
	
	WebElement a3=driver.findElement(By.xpath("//div[div[div[h5[text()='RANN UTSAV PACKAGE WITH TRAIN TICKETS - WHITE RANN RESORTS']]]]/div[3]/div"));
	System.out.println("RANN UTSAV PACKAGE WITH TRAIN TICKETS - WHITE RANN RESORTS:"+a3.getText());
	
	WebElement a4=driver.findElement(By.xpath("//div[div[div[h5[text()='SERENE PACHMARHI']]]]/div[3]/div"));
	System.out.println("SERENE PACHMARHI:"+a4.getText());
	
	WebElement a5=driver.findElement(By.xpath("//div[div[div[h5[text()='MAHAKALESHWAR OMKARESHWAR MAHESHWAR WITH INDORE']]]]/div[3]/div"));
	System.out.println("MAHAKALESHWAR OMKARESHWAR MAHESHWAR WITH INDORE:"+a5.getText());
	
	/*WebElement a6=driver.findElement(By.xpath("//div[div[div[h5[text()='ODISHA – LAND OF SPIRITUALITY DIVINITY AND GOLDEN BEACH']]]]/div[3]/div"));
	System.out.println("ODISHA – LAND OF SPIRITUALITY DIVINITY AND GOLDEN BEACH:"+a6.getText());
	
	WebElement a7=driver.findElement(By.xpath("//div[div[div[h5[text()='AMAZING GOA EX RAJKOT']]]]/div[3]/div"));
	System.out.println("AMAZING GOA EX RAJKOT:"+a7.getText());*/
	
	driver.switchTo().window(homeWinId);
	
	System.out.println("After coming back to home window title is: "+driver.getTitle());

	WebElement  FromStation=driver.findElement(By.id("txtStationFrom"));
	FromStation.sendKeys("Pune Jn");
	WebElement  ToStation=driver.findElement(By.id("txtStationTo"));
	ToStation.sendKeys("Bangalore Cant");
	
	
	
	}
}
