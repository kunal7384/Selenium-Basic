package pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.pages.Guru99BankLogin;

public class VerifyLogin {
	
	public static WebDriver driver;
	 
	@Test
	
	public void verify_Login()
	{
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	Guru99BankLogin test = new Guru99BankLogin(driver);
	test.set_Login("mngr133330", "jUhEdaq");
		
		
		
	}

}
