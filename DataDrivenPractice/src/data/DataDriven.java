package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
/*	WebDriver driver;
	
	@Test(dataProvider="testing")
	
	public void test(String uname , String upass)
	
	{
	 driver = new ChromeDriver();
	 driver.get("http://practice-pad.com/");
	 driver.findElement(By.id("username_or_email")).sendKeys(uname);
	 driver.findElement(By.id("login_password")).sendKeys(upass);
	 driver.findElement(By.name("commit")).click();

	}
	
	@DataProvider(name="testing")
	public Object[][] testing()
	{
		
	Object[][] data =  new Object[4][2];	
	
	data[0][0] ="bhavesh";
	data[0][1] = "password";
	data[1][0] = "don";
	data[1][1] = "don123";
	data[2][0] ="kunal";
	data[2][1] = "password";
	data[3][0] = "jignesh";
	data[3][1] = "password";
	
	return data;
		
		
	}*/
	
	
	WebDriver driver;
	
	@Test(dataProvider="aaaa")
	public void test(String uname , String upass)
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice-pad.com");
		driver.findElement(By.id("username_or_email")).sendKeys(uname);
		driver.findElement(By.id("login_password")).sendKeys(upass);
		driver.findElement(By.name("commit")).click();
		
		
		
		
	}
	
	
	
	@DataProvider(name="aaaa")
	public Object[][] testing()
	{
		
		
	Object[][] data = new Object[3][2]	;
	data[0][0] = "don";
	data[0][1] = "don123";
	data[1][0] = "bhavesh";
	data[1][1] = "password";
	data[2][0] = "kunal";
	data[2][1] ="password";
	return data;	
	}
	
	
	
	

	
	
	
	
	
	

}
