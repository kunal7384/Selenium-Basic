import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.sendKeys("Kunal");
		String get = search.getAttribute("title");
		System.out.println("================"+get+"====================");
	/*	WebElement e = driver.findElement(By.name("btnK"));
		
	e.sendKeys(Keys.ENTER);
	String g=	e.getAttribute("type");
		System.out.println(g);*/
	
	
	WebElement ele = driver.findElement(By.name("btnI"));
	String s = ele.getAttribute("value");
	ele.click();

	System.out.println("================"+s+"====================");
		driver.close();
	}

}
