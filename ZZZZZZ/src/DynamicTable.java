import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTable {
	
	
	public static WebDriver driver;
	
	
	@Test
	
	public void handleTable()
	{
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html?FirstName=&LastName=&EmailID=&MobNo=&Company=");
		WebElement webTable= driver.findElement(By.tagName("tbody"));
		List<WebElement> row =webTable.findElements(By.xpath("tr"));
		int row_Count= row.size();
		System.out.println(row_Count);
		for(int i=0;i<row_Count;i++)
		{
		List<WebElement> col =  row.get(i).findElements(By.tagName("td"));
		int col_size= col.size();
		System.out.println("Coloun Size"+ col_size);
		
			
			
			
		}
	}

}
