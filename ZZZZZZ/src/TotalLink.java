import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TotalLink {
	
	public static WebDriver driver;
	@Test
	
	public void run()
	{
		/*driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		List<WebElement>link = driver.findElements(By.tagName("a"));
		int linkc = link.size();
		System.out.println(link.size());
		String[] links = new String[linkc];
		for(int i=0;i<link.size();i++)
		{
			
			String ele = link.get(i).getAttribute("href");
			
			System.out.println(ele);
			String url = link.get(i).getText();
		//	System.out.println(url);
		}
			for (int i = 0; i < linkc; i++) {
				driver.navigate().to(links[i]);
				System.out.println(driver.getTitle());*/
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>link = driver.findElements(By.tagName("a"));
		int linknavigate = link.size();
		String links[] = new String [linknavigate];
		for(int i=0;i<linknavigate;i++) {
			links[i] =link.get(i).getAttribute("href");
		}
			
		for(int i=0;i<linknavigate;i++) {
			
			driver.navigate().to(links[i]);
			System.out.println(link.get(i).getText());
			
		}
		
	}

	}
