package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String sourcecode=driver.getPageSource();
	System.out.println("source code length :"+sourcecode.length());
	String Actualtitle =driver.getTitle();
	System.out.println("Actual title :"+Actualtitle);
	String ExpectedTitle="Google";
	System.out.println("is google page open? "+Actualtitle.equals(ExpectedTitle));
	driver.close();
}
}
