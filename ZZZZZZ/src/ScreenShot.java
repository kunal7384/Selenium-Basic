import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShot {
static WebDriver driver;
/*
@Test
public void scrren_Test() throws IOException
{
	driver= new ChromeDriver();
	capturedScreenShot();
	driver.get("http://18.218.190.110");
	capturedScreenShot();
	driver.get("https://www.google.com/");
	
	
	
	
	
}    
	public static void capturedScreenShot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\dkunal\\Desktop\\Report\\"+System.currentTimeMillis()+".jpg"));
		
		
	}*/

      @Test
      
      public static void Screen(WebDriver driver,String screenshotName)
      {
    	  
    	  TakesScreenshot ts = (TakesScreenshot)driver;
  		File src= ts.getScreenshotAs(OutputType.FILE);
  		try {
			Files.copy(src, new File("C:\\Users\\dkunal\\Desktop\\Report\\" + screenshotName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
}

