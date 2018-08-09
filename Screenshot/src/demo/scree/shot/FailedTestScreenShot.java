package demo.scree.shot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class FailedTestScreenShot {
	
	public static WebDriver driver;
	@Test
	
	public void run()
	{
 driver = new ChromeDriver();
 driver.get("http://www.mycloset.eisontriplethread.com");
		driver.findElement(By.xpath("//*[@href='/my-account/profile']")).click();
		
	}
	@AfterMethod
	public void captured(ITestResult result)
	{
	if(ITestResult.FAILURE==result.getStatus())	
	{
		try {
		TakesScreenshot ts = 	(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\dkunal\\Desktop\\Report\\"+System.currentTimeMillis()+".png"));
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	}

}
