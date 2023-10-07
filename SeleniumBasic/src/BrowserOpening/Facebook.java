package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String sourcecode=driver.getPageSource();
	System.out.println("source code length :"+sourcecode.length());
	String ActualTitle=driver.getTitle();
	System.out.println("ActualTitle :"+ActualTitle);
	String ExpectedTitle="Facebook – log in or sign up";
	System.out.println("is facebook page open?"+ActualTitle.equals(ExpectedTitle));
	driver.close();
}
}
