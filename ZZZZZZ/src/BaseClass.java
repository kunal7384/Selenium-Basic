import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	
	@Test(priority=1)
	public void browserStart()
	{
		driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	 driver.get("http://www.eyerne.com/sign-in");
		
	}

}
