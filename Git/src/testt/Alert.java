package testt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
		
		
		
	 driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver");
	 String title=driver.getTitle();
	 System.out.println(title); 
	 
	 driver.findElement(By.xpath("//*[@onclick='pushAlert()']")).click();
	 
	 org.openqa.selenium.Alert alert = driver.switchTo().alert();
	 
	 String alertTitle=alert.getText();
	 System.out.println("Here Alert Title is "+  "  ==" + alertTitle);
	 alert.accept();
	 Thread.sleep(1000);
	WebElement ele= driver.findElement(By.xpath("//*[text()='Confirm Pop up']"));
	 ((JavascriptExecutor) driver).executeScript("arguments[0].click()", ele);
	 org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
	 String alertTitleis=alert1.getText();
	 System.out.println("Here Alert Title is "+  "  ==" + alertTitleis);
	 alert1 .accept();
	 Thread.sleep(2000);
	WebElement element= driver.findElement(By.xpath("//*[text()='Prompt Pop up']"));
	 Thread.sleep(2500);
	//element.click();
	Runtime.getRuntime().exec("C:\\Users\\dkunal\\Desktop\\a.exe");
	 Thread.sleep(2500);
	 String Text=element.getText();
	 System.out.println("Here Alert Title is "+  "  ===" + Text);
	
	System.out.println("dfdf");
	
/*	 ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	 org.openqa.selenium.Alert promptAlert = driver.switchTo().alert();
	 String Text=promptAlert.getText();
	 
	
	 Thread.sleep(2000);
	 System.out.println("Here Alert Title is "+  "  ===" + Text);
	 promptAlert.sendKeys("YEs I Like");
	 promptAlert .sendKeys("Accepting the alert");
	 promptAlert.accept();*/
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	}

}
