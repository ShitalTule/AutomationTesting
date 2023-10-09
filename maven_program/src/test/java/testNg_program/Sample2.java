package testNg_program;

import org.testng.annotations.Test;

public class Sample2 {

	@Test(priority=1,enabled=true)
	public void loginIntoVtiger() {
		System.out.println("User login successfully...");
	}
	@Test(priority=2,enabled=true)
	public void leadCreation() {
		System.out.println("Lead created successfully...");
		calling();
	}	
	public void calling() {
		System.out.println("hello");
	}
}

