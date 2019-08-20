import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpath {
	WebDriver driver;
	@Test
	public void sTest()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
driver.get("http://google.co.in");
//to get title of page
System.out.println(driver.getTitle());
//to maximiuze window
driver.manage().window().maximize();
//to close browser
//driver.close();
//to open url
//driver.navigate().to("http://amazon.com");
String road=driver.findElement(By.xpath("//*[@id=\"fbar\"]/div/div/div/span")).getText();
System.out.println(road);
}
	}



