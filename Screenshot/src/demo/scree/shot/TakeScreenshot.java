package demo.scree.shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import com.google.common.io.Files; 

public class TakeScreenshot {
	static WebDriver driver;
	@Test
	public static void capturedScreenShot()
	
	
	{
		driver = new ChromeDriver();
		driver.get("http://18.218.123.45");
		/*File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		Files.copy(src, new File("C:\\Users\\dkunal\\Desktop\\error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
}}
}*/
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("C:\\Users\\dkunal\\Desktop\\Report\\error.png"));
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			}
}