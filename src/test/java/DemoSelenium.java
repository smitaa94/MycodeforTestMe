import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoSelenium {
	WebDriver driver;
	@Test
	public void sTest()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
driver.get("http://www.google.co.in");
				
		
	}
	@Test
	public void sTest1()
	{
		System.setProperty("Webdriver.gecko.driver", "\"C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\geckodriver.exe\\");
		driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
	}
	
	

}
