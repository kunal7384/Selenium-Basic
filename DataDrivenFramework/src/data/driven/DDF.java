package data.driven;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.helpers.QuietWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF {
	
	WebDriver driver;
	@Test(dataProvider="testdata")
	public void login(String username ,String pass)
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.eyerne.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password_login']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	   WebElement ele = driver.findElement(By.xpath("//*[text()='Built in last two years']"));
	 String title=ele.getText();
	 System.out.println(title);
	Assert.assertEquals(title, "Built in last two years" ,"Please Enter valid Email or Password");
	driver.quit();
	}
	@DataProvider(name="testdata")
	public Object[][] test()
	{
		
	Object[][] data	 = new Object[3][2];
	data[0][0]	="mis@narola.email";
	data[0][1]	="password";
	data[1][0]	="kd@narola.email";
	data[1][1]	="password";
	data[2][0]	="mis2@narola.email";
	data[2][1]	="password";
		return data;
	}

}
