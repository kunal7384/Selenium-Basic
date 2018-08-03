import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;
	@Test
	public void demo_table()
	{
	driver= new ChromeDriver();
	driver.get("file:///C:/Users/dkunal/Desktop/test.html");
	List<WebElement> ele = driver.findElements(By.xpath("//*[@name='BookTable']//th"));
	System.out.println("Header Element");
	for(WebElement header :ele)
	{
		
		String s  = header.getText();
	
		System.out.println(s);
		
	}
	
	List<WebElement> element = driver.findElements(By.xpath("//*[@name='BookTable']//tbody/tr/td[text()='Mukesh']/../td[1]"));
	
	System.out.println("Book sell By Mukesh  is Below");
	for(WebElement book :element) {
	
	
	String d = book.getText();
System.out.println(d);
	}
	}
}