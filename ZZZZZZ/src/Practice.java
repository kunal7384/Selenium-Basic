import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Practice {
	Logger logger = Logger.getLogger("Practice.class");
WebDriver  driver;
ExtentHtmlReporter htmlreport;
ExtentReports report; 
ExtentTest test;
	
	@Test
	public void run() throws IOException, InterruptedException
	{
		htmlreport = new ExtentHtmlReporter("exe.html");
		report = new ExtentReports();
	     report.attachReporter(htmlreport);
	     test = report.createTest("Verify the registration Form");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		int count = 11111;
		
	     test.log(Status.INFO, "Opeming Browserwith valid url");
		 driver.get("http://www.globalsqa.com/samplepagetest/");
		 driver.findElement(By.name("file-553")).click();
		 Runtime.getRuntime().exec("C:\\Users\\dkunal\\Desktop\\Report\\demotest.exe");
		 driver.findElement(By.id("g2599-name")).sendKeys(""+count);
		 test.log(Status.INFO, "Enter invalid name");
		 Thread.sleep(2000);
		 driver.findElement(By.id("g2599-name")).clear();
		 test.log(Status.INFO, "clear name field");
		 driver.findElement(By.id("g2599-name")).sendKeys("Kunal");
		 test.log(Status.INFO, "Enter valid name");
		 driver.findElement(By.id("g2599-email")).sendKeys("xyz@gmail.com");
		 test.log(Status.INFO, "Enter valid Email");
		 driver.findElement(By.id("g2599-website")).sendKeys("www.google.com");
		 test.log(Status.INFO, "Enter valid Website");
	     WebElement drop =driver.findElement(By.id("g2599-experienceinyears"));
	     test.log(Status.INFO, "Working with drop down box");
	     org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(drop);
	     List<WebElement> droplist = select.getOptions();
	     int countDrop = droplist.size();
	     test.log(Status.INFO, "calculate the size of Drop Down Box");
	     System.out.println("Total Size of DropDown Box is" + countDrop);
	     test.log(Status.INFO, "claculated");
	     for(WebElement text :droplist)
	     {
	    	String s =text.getText();
	    	System.out.println("Name of the drop Element is "+s);
	    	select.selectByVisibleText("1-3");
	    	
	    	 
	    	 
	     }
	     test.log(Status.INFO, "Selecrt vlaue from Drop Down Box");
	     System.out.println("\n");
		 test.log(Status.INFO, "Enter valid Experiemnce");
		 
		 
		List<WebElement> checkbox= driver.findElements(By.xpath("//*[@class='grunion-checkbox-multiple-label checkbox-multiple']"));
		int x = checkbox.size();
		System.out.println("Size of check box ix"+x);
		for(int i=0;i<checkbox.size();i++)
		{
			
		String listofcheckBox=checkbox.get(i).getText()	;
		System.out.println("List NAme of checkBox is " +listofcheckBox);
		  checkbox.get(i).click();
			
		}
		List<WebElement> readio = driver.findElements(By.xpath("//*[@class='grunion-radio-label radio']"));
		int y = readio.size();
		System.out.println(y);
		for(int c=0; c<readio.size();c++ )
		{
			
		String textt = readio.get(c).getText();
		System.out.println(textt);
	
		}
		driver.findElement(By.xpath("//*[@value='Post Graduate']")).click();
	      driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
		     Alert alert = driver.switchTo().alert();
	          String alertText=	alert.getText();
	           System.out.println(alertText);
             	Thread.sleep(1000);
	             alert.accept();
        	      alert.accept();
	             //  driver.findElement(By.name("g2599-comment")).sendKeys("hello\n"+"hi");
	              //  Thread.sleep(1000);
	             //     driver.findElement(By.xpath("//*[@value='Submit »']")).click();
	                Thread.sleep(2000);
	                 WebElement hover = driver.findElement(By.xpath("  //*[text()='About Us']  [@class='no_border']"));
	                   Actions act = new Actions(driver);
	                   act.moveToElement(hover).build().perform();
	                   List<WebElement> hov = driver.findElements(By.xpath("  //*[text()='About Us']  [@class='no_border']"));
	                   for(WebElement hov2  :hov)
	                   {
	                	   
	                	String s =hov2.getText()  ;
	                	System.out.println(s);
	                   }
	                   WebElement aa= driver.findElement(By.xpath("//*[text()='Reviews']"));
	                  WebDriverWait wait = new WebDriverWait(driver,60);
	                  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Reviews']")));
	                  aa.click();
	              
		 
	/*	 WebElement ele = driver.findElement(By.xpath("//*[text()='Expertise :']"));
		 boolean sta = ele.isSelected();
		 System.out.println(sta);
		boolean a= ele.isDisplayed();
		System.out.println(a);
		WebElement element = driver.findElement(By.name("g2599-expertise[]"));
		 
		 boolean sta1 = element.isSelected();
		 System.out.println(sta1);
		boolean a1= element.isDisplayed();
		System.out.println(a1);
		element.click();
		boolean sel = element.isSelected();
		System.out.println(sel);
		test.log(Status.INFO, "Clicked on Desired Skill ");
		System.out.println("\n");*/
		 report.flush();
		
	}

}
