import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ecommrece {
	
	static WebDriver driver;

	
	public static void run(String product ,String cat)
	{
		driver = new ChromeDriver();
		driver.get("http://live.guru99.com/index.php");
		
	WebElement ele = 	driver.findElement(By.id("search"));
		
		ele.sendKeys(product);
		ele.sendKeys(Keys.ENTER);
	
	WebElement e =	driver.findElement(By.xpath("//*[@title='Sort By']"));
		Select select = new Select(e);
		select.selectByVisibleText(cat);
		
	}
	public static void main(String[] args) throws InterruptedException 
		

	{
		Ecommrece.run("Tv", "Name");
		
		System.out.println("Hello" );
		WebElement ele = driver.findElement(By.xpath("//*[@alt='LG LCD']"));
		Thread.sleep(500);
		System.out.println(ele.getText());
		ele.click();
		driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
		
		
	/*	WebElement cupon = driver.findElement(By.id("coupon_code"));
		cupon.sendKeys("ASS");
		driver.findElement(By.xpath("//*[text()='Apply']")).click();
	WebElement error =driver.findElement(By.xpath("//*[@class='error-msg']"))*/
		
		WebElement drop = driver.findElement(By.className("validate-select"));
		Select select = new Select(drop);
		select.selectByVisibleText("India");
		
		WebElement drop1 = driver.findElement(By.id("region"));
		drop1.sendKeys("Maharashtra");
		
		 driver.findElement(By.id("postcode")).sendKeys("411041");
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
