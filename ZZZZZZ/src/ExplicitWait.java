import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {

	
	public static WebDriver driver;
	
	
	@Test
	 public void explicit_wait_demo()
	 {
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//*[text()='Click me to start timer']")).click();
		
		
	
		
		WebDriverWait wa = new WebDriverWait(driver, 20);
		WebElement element = wa
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		System.out.println(element.getText());
	 }
}
