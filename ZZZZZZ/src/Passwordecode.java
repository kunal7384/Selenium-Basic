import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Passwordecode {
	WebDriver driver;
	static String decodepassword="aGFwcHltYW4xNjM=";
	public static String getDecodedpassword()
	{
	return new String(Base64.getDecoder().decode(decodepassword.getBytes()));
	}

	@Test
	public void test1()
	{
	System.out.println(getDecodedpassword());
	driver=new ChromeDriver();
	driver.get("http://18.218.123.45");
	driver.findElement(By.xpath("//*[@id='username_or_email']")).sendKeys("sagar1");
	driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys(getDecodedpassword());
	
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	
	
}

 
}