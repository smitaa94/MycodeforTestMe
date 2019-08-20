package testngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNg {
	
@BeforeSuite	
public void bSuite() {
	System.out.println("inside bSuite");
}

@AfterSuite	
public void aSuite() {
	System.out.println("inside aSuite");
}

	
@BeforeTest
public void bTest() {
	System.out.println("bTest");
}

@AfterTest
public void aTest() {
	System.out.println("aTest");
}
	
  @Test(priority=1)
  public void openApp() {
	  System.out.println("Inside openApp");
  }
  
  @BeforeMethod
  public void bMethod() {
	  System.out.println("calls before each test method");
  }
  
  @AfterMethod
  public void aMethod() {
	  System.out.println("calls after each test method");
  }
  @Test(priority=2)
  public void login() {
	  System.out.println("Inside login");
  }
  
  @Test(priority=3)
  public void logout() {
	  System.out.println("Inside logout");
  }
  
  
  
}
