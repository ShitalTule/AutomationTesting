package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.youtube.com/");
	String sourcecode=driver.getPageSource();
	System.out.println("source code length :"+sourcecode.length());
	String Actualtitle=driver.getTitle();
	String Expectedtitle="YouTube";
	System.out.println("is youtube open?"+Actualtitle.equals(Expectedtitle));
	driver.close();
}
}
