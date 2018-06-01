package checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckBoxSelect {
	WebDriver driver;
	
	@Test
	public void ischeckboxisMultiple()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement selectCheckBox = driver.findElement(By.id("select-demo"));
		Select select = new Select(selectCheckBox);
		boolean status = select.isMultiple();
		if(status==true)
		{
			System.out.println("Check box is Multiple");
			select.selectByVisibleText("Monday");
			
			
		}
		else
		{
			System.out.println("Check box is Not Multiple");
			select.selectByVisibleText("Friday");
			
		}
		
		
		WebElement selectCheckBox1 = driver.findElement(By.id("multi-select"));
		Select select1 = new Select(selectCheckBox1);
		boolean status1 = select1.isMultiple();
		if(status1==true)
		{
			System.out.println("Check box is Multiple");
			select1.selectByVisibleText("Ohio");
			driver.findElement(By.id("printMe")).click();
			
			
		}
		else
		{
			System.out.println("Check box is Not Multiple");
			select1.selectByVisibleText("Texas");
			driver.findElement(By.id("printMe")).click();
			
		}
		
		
	}

}
