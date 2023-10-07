package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	String sourcecode=driver.getPageSource();
	System.out.println("source code length :"+sourcecode.length());
	String ActualTitle=driver.getTitle();
	System.out.println("ActualTitle :"+ActualTitle);
	String ExpectedTitle="Instagram";
	System.out.println("is Instagram page open?"+ActualTitle.equals(ExpectedTitle));
	driver.close();
}
}
