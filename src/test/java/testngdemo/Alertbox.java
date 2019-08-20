package testngdemo;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertbox {
	WebDriver driver;
  @Test
  public void f() {
	//path of  the chrome browser
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	  //init browser
	   driver = new ChromeDriver();
	  //opening of the URL
	  driver.get("http://demowebshop.tricentis.com/");
	
	  //to get the title of the page
	  System.out.println("1"+driver.getTitle());
	//to maximize the window
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	  //popup window
	  Alert a=driver.switchTo().alert();
	  
	  a.accept();
	  //a.wait();

	  driver.findElement(By .name("q")).sendKeys("Com");
	 
  }
}
