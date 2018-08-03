import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Extent {
	Logger logger = Logger.getLogger(Extent.class);
WebDriver driver;
ExtentHtmlReporter extent;
ExtentReports report;
ExtentTest test;
@Test

public void test()
{
	

	
	extent = new  ExtentHtmlReporter("extent.html");
	report = new ExtentReports();
  report.attachReporter(extent);
  
 test =  report.createTest("verify test ");
  test.log(Status.INFO, "Intialiased Browser");
  driver = new ChromeDriver();
  test.log(Status.INFO, "Entering Url");
  driver.get("http://18.218.123.45/");
  test.log(Status.INFO, "Entering userid");
  driver.findElement(By.xpath("//*[@id='username_or_email']")).sendKeys("sagar1");
  test.log(Status.INFO, "Entering passqword");
  driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("password");
  test.log(Status.INFO, "Lohin successfully ");
  driver.findElement(By.xpath("//*[@name='commit']")).click();
  
  test.log(Status.INFO, "Login");
  report.flush();
  
 
  
 
 


}
}
