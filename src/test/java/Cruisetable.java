import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cruisetable {
	WebDriver driver;
	@Test
	public void sTest()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
driver.get("http://newtours.demoaut.com/mercurycruise.php?osCsid=cca5c3089a9ebdd0fe2bc2074f4b6afe");
//to get title of page
System.out.println(driver.getTitle());
//to maximiuze window
driver.manage().window().maximize();
//to close browser
//driver.close();
//to open url
//driver.navigate().to("http://amazon.com");


WebElement x=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table"));
List<WebElement> lnkcoll=x.findElements(By.tagName("tr"));
System.out.println(lnkcoll.size());
System.out.println(x);

	
	//String Port=lnkcoll.get(i).getText();
	//System.out.println(Port);
	WebElement city=driver.findElement(By .xpath("//html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table/tbody/tr[5]/td[2]/font"));
	List<WebElement> cityy=city.findElements(By.tagName("Inside Passage"));
	System.out.println(cityy.size());
	for(int i=0;i<cityy.size()-1;i++)
	{
	System.out.println(city);
	String day=cityy.get(i).getText();

if(day.contains("Inside Passage"))
	
	{
		//lnkcoll.get(i).click();
	System.out.println(true);
		break;
	//}
}
	}
	}
}

