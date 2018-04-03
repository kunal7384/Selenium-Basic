package testt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/selenium/");
 WebElement ele = driver.findElement(By.xpath("//*[@name='bdaytime']"));
  ele.sendKeys("09022018");
  ele.sendKeys(Keys.TAB);
  ele.sendKeys("0420Am");

}
}