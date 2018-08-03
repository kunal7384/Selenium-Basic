import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	
	WebDriver driver;
	By drop = By.xpath("//select");
	By clickbledrop = By.className("dropbtn");
	By a= By.xpath("  //*[@class='dropdown-content show'] //*[text()='Google']");
	By hoverdrop = By.className("dropbtnHover");
	By b= By.xpath("  //*[@class='dropdown-contentHover'] //*[text()='Facebook']");
	public Drop(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void getDrop()
	{
	WebElement ele =driver.findElement(drop)	;
	Select select = new Select(ele);
	select.selectByIndex(2);
	
		
		
	}
	
	
		public void getD()
		{
		
		WebElement elem =driver.findElement(clickbledrop)	;
		elem.click();
	WebElement sub = 	driver.findElement(a);
	sub.click();
		
			
		}
		
		public void getA()
		{
			WebElement ho = driver.findElement(hoverdrop);
			Actions action= new Actions(driver);
			action.moveToElement(ho).build().perform();
			driver.findElement(b).click();
		}
		
	}


