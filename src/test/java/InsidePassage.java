import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InsidePassage {
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
List<WebElement> trows=x.findElements(By.tagName("tr"));
//advanced for loop
for(WebElement row:trows)
{
	List<WebElement> tcols=row.findElements(By.tagName("td"));
	for(int c=0;c<=tcols.size()-1;c++)
	{
		String tdata=tcols.get(c).getText();
		if(tdata.equals("Seattle"))
		{
			System.out.println(tcols.get(0).getText());
		}
	}
}

	}
	}


