package testngdemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.internal.DynamicGraph.Status;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsTest {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
  @BeforeTest
  public void startReport() {
	  htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-reports/"+new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date())+".html");
	  extent=new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  extent.setSystemInfo("Host Name", "seleaug19gft");
	  
	  extent.setSystemInfo("Environment", "Automation Testing Stream");
	  extent.setSystemInfo("User Name", "Celeina Gomez");
	  htmlReporter.config().setDocumentTitle("Demo Reports");
	  htmlReporter.config().setReportName("Demo1");
	  htmlReporter.config().setTheme(Theme.STANDARD);
  }
  @Test
  public void passTest() {
	  logger=extent.createTest("passTest");
	  Assert.assertTrue(true);
	  logger.log(Status.PASS,MarkupHelper.createLabel("Testcase passed is passTest",ExtentColor.GREEN));
	  
	  
  }
  @Test

  public void failTest()
  {
	  logger=extent.createTest("failTest");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
	 //driver=new ChromeDriver();
	  Assert.assertTrue(true);
	  //logger.log(Status.FAIL,MarkupHelper.createLabel("Testcase passed is failTest",ExtentColor.GREEN));
  }
  @Test

  public void skipTest()
  {
	  logger=extent.createTest("skipTest");
	  throw new SkipException("Skipping-this is not ready");
	  
  }
  @AfterMethod
  public void getResult(ITestResult result)throws IOException
  {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"- Test case Failed",ExtentColor.RED));
		  TakesScreenshot sht=(TakesScreenshot)driver;
		  File src=sht.getScreenshotAs(OutputType.FILE);
		  String path=System.getProperty("user.dir"+"/extent-reports/snapshots/"+result.getName()+".png");
		  System.out.println(path);
		  FileUtils.copyFile(src,new File(path));
		  logger.addScreenCaptureFromPath(path,result.getName());
		  logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"- Test case Failed",ExtentColor.RED));
		  
	  }
	  else if(result.getStatus()==ITestResult.SKIP)
	  {
		  logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"- Test case Skip",ExtentColor.ORANGE));
		  
		  
	  }
  }
  @AfterTest
  public void endReport()
  {
	  extent.flush();
  }
  
}
