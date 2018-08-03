import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Drop1 {
	
	WebDriver driver;
	@Test
	
	public void test()
	{
		driver = new ChromeDriver();
		driver.get("file:///E:/html%20code/selenium.html");
		Drop d = new Drop(driver);
		d.getDrop();
		
	d.getD();
		
		d.getA();
		
	}

}
