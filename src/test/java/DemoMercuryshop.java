import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoMercuryshop {
	WebDriver driver;
	@Test
	public void sTest()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
//to get title of page
System.out.println(driver.getTitle());
//to maximiuze window
driver.manage().window().maximize();
//to close browser
//driver.close();
//to open url
//driver.navigate().to("http://amazon.com");
driver.findElement(By.linkText("REGISTER")).click();
//to retrieve any value
String str=driver.findElement(By.linkText("REGISTER")).getText();
System.out.println(str);
driver.findElement(By.name("country")).sendKeys("TOGO");
driver.findElement(By.name("email")).sendKeys("johnny");
driver.findElement(By.name("password")).sendKeys("abcd");
driver.findElement(By.name("confirmPassword")).sendKeys("abcd");
driver.findElement(By.name("register")).click();
driver.close();


				
		
	}
	//@Test
	//public void sTest1()
	//{
		//System.setProperty("Webdriver.gecko.driver", "\"C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\geckodriver.exe\\");
		//driver=new FirefoxDriver();
		//driver.get("http://www.google.co.in");
	
	
	

}
