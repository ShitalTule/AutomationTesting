package BrowserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.meesho.com/");
	String sourceCode=driver.getPageSource();
	System.out.println("Sourcecode length :"+sourceCode.length());
	String ActualTitle=driver.getTitle();
	System.out.println("Actual title :"+ActualTitle);
	String ExpectedTitle= "Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
	System.out.println("is meesho page open? "+ActualTitle.equals(ExpectedTitle));
	driver.close();
}
}
