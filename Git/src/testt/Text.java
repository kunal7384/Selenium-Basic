package testt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
	public static WebDriver driver;
	
	public static void main(String[] args) {
	  {
		 driver=new ChromeDriver();
		 driver.get("https://www.google.co.in");
		WebElement ele =  driver.findElement(By.xpath("//*[@id='lst-ib']"));
		
		ele.sendKeys("ABCD");
		ele.sendKeys(Keys.ENTER);
	  }
	}
	

}
