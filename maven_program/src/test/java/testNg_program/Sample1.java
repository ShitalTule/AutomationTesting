package testNg_program;

import org.testng.annotations.Test;

public class Sample1 {
  @Test(priority=2,enabled=true)
  public void loginToVtiger() {
	  System.out.println("user login sucessfully");
  }
  @Test(priority=1,enabled=true)
  public void leadCreation(){
  System.out.println("lead created sucessfully");
	  
  }
  @Test(priority=3,enabled=false)
  public void editLead() {
	  System.out.println("lead edited sucessfully");
  }
  @Test(priority=4,enabled=true)
  public void leadDeleted() {
	  System.out.println("Lead deleted sucessfully");
  }
  }
