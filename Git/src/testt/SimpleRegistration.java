package testt;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleRegistration {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		driver= new ChromeDriver();
		
		driver.get("http://demoqa.com/registration/");
		WebElement firstName= driver.findElement(By.xpath("//*[@name='first_name']"));
		firstName.sendKeys("Kunal");
		firstName.sendKeys(Keys.TAB);
		
		WebElement lastName= driver.findElement(By.xpath("//*[@name='last_name']"));
		lastName.sendKeys("Dhote");
		lastName.sendKeys(Keys.TAB);
		
		
		
		WebElement status= driver.findElement(By.xpath("//*[@name='radio_4[]']"));
		status.click();
		status.sendKeys(Keys.TAB);
		
		
		WebElement hobby= driver.findElement(By.xpath("//*[@name='checkbox_5[]']"));
		hobby.click();
		status.sendKeys(Keys.TAB); 
		
	
		
		
	WebElement element = driver.findElement(By.xpath("//*[@name='dropdown_7']"));
		  
		Select select = new Select(element);
		
		select.selectByVisibleText("India");
		
		
		//*[@id='mm_date_8']
		
		
		WebElement dob =driver.findElement(By.xpath("//*[@id='mm_date_8']"));
		
		Select DOM = new Select(dob);
		DOM.selectByVisibleText("2");
		
WebElement dob1 =driver.findElement(By.xpath("//*[@id='dd_date_8']"));
		
		Select DOD = new Select(dob1);
		DOD.selectByVisibleText("8");
		
WebElement dob2 =driver.findElement(By.xpath("//*[@id='yy_date_8']"));
		
		Select DOY = new Select(dob2);
		DOY.selectByVisibleText("1990");
		
		
		
		WebElement phone =driver.findElement(By.xpath("//*[@id='phone_9']"));
		phone.sendKeys("1234567890");
		phone.sendKeys(Keys.TAB);
		
		
		
		
		WebElement userName =driver.findElement(By.xpath("//*[@id='username']"));
		userName.sendKeys("kunaldhote");
		userName.sendKeys(Keys.TAB);
		
		WebElement Email =driver.findElement(By.xpath("//*[@id='email_1']"));
		Email.sendKeys("user@gmail.com");
		Email.sendKeys(Keys.TAB);
		
		WebElement file =driver.findElement(By.xpath("//*[@id='profile_pic_10']"));
		file.click();
		Runtime.getRuntime().exec("F:\\software\\AutoIt\\fileupload.exe");

		WebElement des = driver.findElement(By.xpath("//*[@id='description']"));
		des.sendKeys("Hello ");
		des.sendKeys(Keys.TAB);
		
		WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
		pass.sendKeys("abcdefg111");
		pass.sendKeys(Keys.TAB);
		
		WebElement confirm = driver.findElement(By.xpath("//*[@id='confirm_password_password_2']"));
		confirm.sendKeys("abcdefg111");
		confirm.sendKeys(Keys.TAB); 
		
	driver.findElement(By.xpath("//*[@name='pie_submit']"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
