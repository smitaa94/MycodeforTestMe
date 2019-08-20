package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoTestcase {
	
	@AfterClass
	public void aClass() {
		  System.out.println("inside aClass");
	  }
	
  @BeforeClass
  public void bClass() {
	  System.out.println("inside bClass");
  }
  @Test
  public void etransfer() {
	  System.out.println("inside etransfer");
  }
}
