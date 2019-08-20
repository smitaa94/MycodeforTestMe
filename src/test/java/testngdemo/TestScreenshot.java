package testngdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class TestScreenshot {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  driver.get("http://www.newtours.demoaut.com/");
	  File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  //saving
	  FileUtils.copyFile(file,new File("C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\smi.jpg"));
  }
}
