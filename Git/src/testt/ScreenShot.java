package testt;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;



public class ScreenShot {
	public static WebDriver driver;
	@Test
	public static void main ()

	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.guru99.com");
		 ScreenShot .capturedScreenShot();
		
		
		driver.get("https://www.google.com");
		 ScreenShot .capturedScreenShot();
		
		
	}
	

	
	public static void capturedScreenShot()
	{
		
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("C:\\Users\\dkunal\\Desktop\\Report\\"+System.currentTimeMillis()+".png"));
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			}
	}




