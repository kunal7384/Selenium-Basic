import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	/*	driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement ele = driver.findElement(By.id("select-demo"));
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(ele);
		boolean status = sel.isMultiple();
		if(status==true)
		{
			System.out.println("SElect is MUltiple");
			sel.selectByValue("Monday");
			
		}
		else
		{
			
			System.out.println("SElect is Not  MUltiple");
			sel.selectByValue("Friday");
			
		}
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("multi-select"));
		
		org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(element);
		boolean sta = select.isMultiple();
		if(sta==true)
		{
			System.out.println("Multiple");
			select.selectByVisibleText("Ohio");
			driver.findElement(By.id("printMe")).click();
			
		}
		else
		{
			System.out.println("NotMultip");
			select.selectByVisibleText("Texas");
			driver.findElement(By.id("printMe")).click();
			
		}*/
		
		driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement ele = driver.findElement(By.id("select-demo"));
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(ele);
		List<WebElement> link = sel.getOptions();
		 int x = link.size();
		  System.out.println(x);
	/*	for(WebElement tmp : link)
		{
			String s  =tmp.getText();
			System.out.println(s);
			sel.selectByVisibleText("Monday");
			
		}*/
		
		for(int i =0;i<link.size();i++)
		{   
			 
			String s =link.get(i).getText();
			System.out.println(s);
			sel.selectByVisibleText("Monday");
			
		}
		 System.out.println("\n");
		WebElement element = driver.findElement(By.id("multi-select"));
		org.openqa.selenium.support.ui.Select sele = new org.openqa.selenium.support.ui.Select(element);
		List<WebElement> li = sele.getOptions();
		 int y = li.size();
		  System.out.println(y);
		for(WebElement test: li)
		{
			 
		String t=	test.getText();
	
		System.out.println(t);
		sele.selectByVisibleText("Ohio");
			
		}
		
		}
	
}
