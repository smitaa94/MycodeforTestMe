import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class collection {
	WebDriver driver;
	@Test
	public void sTest()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com");
//to get title of page
System.out.println(driver.getTitle());
//to maximiuze window
driver.manage().window().maximize();
//to close browser
//driver.close();
//to open url
//driver.navigate().to("http://amazon.com");
List<WebElement> lnkcoll=driver.findElements(By.tagName("a"));
System.out.println(lnkcoll.size());
for(int i=0;i<lnkcoll.size()-1;i++)
{
	
	String lnkname=lnkcoll.get(i).getText();
	System.out.println(lnkname);
	if(lnkname.equals("Orders"))
	{
		lnkcoll.get(i).click();
		break;
	}
}
	}
}

