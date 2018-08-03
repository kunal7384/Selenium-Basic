package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.login;

public class LoginTest {

	
	public WebDriver driver;
	@Test
	
	public void run()
	
	
	{
		
		driver = new ChromeDriver();
		driver.get("http://www.eyerne.com/");
		login l = new login(driver);
		l.verify_login("mis@narola.email", "password");
		
		
		
	}

}
