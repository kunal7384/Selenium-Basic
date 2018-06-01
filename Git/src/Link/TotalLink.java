package Link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TotalLink {
WebDriver driver;

@Test

public void link_pressent()
{
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
			
	List<WebElement> link = driver.findElements(By.tagName("a"));
	int linkpresent = link.size();
	System.out.println(linkpresent);
	String links[] = new String[linkpresent];
	for(int i=0 ;i<linkpresent;i++)
	{
		
 links[i] = link.get(i).getAttribute("href");
	System.out.println(link.get(i).getAttribute("href"));	
		
	}
	for(int i=0 ;i<linkpresent;i++)
	{
	driver.navigate().to(links[i]);	
		
	}

}
}
