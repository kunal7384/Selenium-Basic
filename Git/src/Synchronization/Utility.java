package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Utility {
	WebDriver driver;
	@Test
	public static WebElement webElementisPresent(WebDriver driver,String Xpath ,int time)
	{
	WebElement ele = null;
	for(int i =0;i<time;i++)
	{
		try {
			
	ele = driver.findElement(By.xpath(Xpath));
	break;
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		try {
			Thread.sleep(1000);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Check Element In DOM");
		}
	}
	return ele;
	}
		
	}


