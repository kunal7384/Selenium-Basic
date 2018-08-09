package demo.scree.shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MultipleScreenShot {
	public static WebDriver driver;
	@Test
	public static void main ()

	{
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com");
		MultipleScreenShot.capturedScreenShot();
		
		
		driver.get("https://www.google.com");
		MultipleScreenShot.capturedScreenShot();
		
		
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

