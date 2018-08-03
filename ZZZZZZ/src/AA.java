import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://18.218.190.110/admins/sign_in");
		driver.findElement(By.xpath("//*[@name='user[email]']")).sendKeys("shm@narola.email");
		driver.findElement(By.xpath("//*[@name='user[password]']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@name='commit']")).click();
		driver.findElement(By.xpath("//*[@href='/admin/services']")).click();
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@id='example2']//td[1]"));
		int x= ele.size();
		System.out.println(x);
		for(int i =0;i<ele.size();i++)
		{
		String element = ele.get(i).getText();
		System.out.println(element);
		
		}

	 driver.findElement(By.xpath("//*[@href='/admin/companies']")).click();
	 
		List<WebElement> link = driver.findElements(By.xpath("//*[@id='example3']//td[5]"));
		System.out.println(link.size());
		  for(int i1 =0;i1<link.size();i1++)
		  {
		Thread.sleep(3000);	  
		String l = link.get(i1).getAttribute("href");
		System.out.println(l);
		  }
				
				
			}
			
}

