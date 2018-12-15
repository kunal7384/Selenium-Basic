package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver driver;
  @Test(priority=1)
  public void search_content() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	WebElement element=  driver.findElement(By.id("lst-ib"));
	element.sendKeys("Art of Testing");
	element.sendKeys(Keys.ENTER);
	  
  }
  
  @Test(priority=2)
  public void search_click() 
  {
	driver.findElement(By.xpath("//*[text()='artOfTesting']")).click();
	  
  }
  @Test(priority=-1)
  public void search_click1() 
  {
	System.out.println("Hello ");
	  
  } 
  @Test(priority=0)
  public void search_click2() 
  {
	System.out.println("Hello2 ");
	  
  }
  @Test
  public void search_click3() 
  {
	System.out.println("Hello3 ");
	  
  }
 
 
}
