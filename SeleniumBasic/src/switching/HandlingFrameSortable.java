package switching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utiliy.SeleniumUtility;

public class HandlingFrameSortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleniumUtility.setUp("Chrome", "https://jqueryui.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		List<WebElement> item=driver.findElements(By.xpath("//html/body/ul/li"));
		/*System.out.println(" item size:"+item.size());
		for(int i=0;i<item.size();i++)
		{
			System.out.println(item.get(i).getText());
			
		}*/
		//WebElement source=item.get(6);
		WebElement destination=item.get(0);
		Thread.sleep(2000);
		//action.dragAndDrop(source, destination).build().perform();
		
		
		for(int i=item.size()-1;i>=1;i--) {
			WebElement source=item.get(i);
			action.dragAndDrop(source, destination).build().perform();
		}
		
		
	}
}
