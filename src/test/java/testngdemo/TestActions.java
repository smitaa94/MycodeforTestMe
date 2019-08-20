package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestActions {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  driver.get("http://jqueryui.com/");
	  Actions a=new Actions(driver);
	  driver.findElement(By.linkText("Droppable")).click();
	  driver.switchTo().frame(0);
	  WebElement drop=driver.findElement(By.id("droppable"));
	  WebElement drag=driver.findElement(By.id("draggable"));
	  a.dragAndDrop(drag, drop);
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[8]/a")).click();
	  driver.switchTo().frame(0);
	  //mouse hover
	  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]"))).click().build().perform();
	  
	  
	  
  }
}
