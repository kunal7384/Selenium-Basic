package Synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	@Test
	public void run()
	{
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Utility.webElementisPresent(driver, "//*[@name='q']", 10).sendKeys("Art of Testing");
  
	Utility.webElementisPresent(driver, "//*[@name='btnK']", 20).click();	
	}

}
