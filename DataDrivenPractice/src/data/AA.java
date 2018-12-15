package data;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AA {
	WebDriver driver;
	
    @Test(dataProvider="aaaa")
	
	public void aa(String uidd , String pass) throws InterruptedException
	{
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		
		
		
		driver.findElement(By.name("uid")).sendKeys(uidd);
		
		driver.findElement(By.name("password")).sendKeys(pass);
		
		driver.findElement(By.name("btnLogin")).click();
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
	
		
			Assert.assertTrue(false);
			Thread.sleep(2000);
		}
		
		else
		{
			
			Assert.assertTrue(true);
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		}
		
	}
	
	public boolean isAlertPresent()
	{
		
		try {
		driver.switchTo().alert();
	
	   return true;
		
		}	catch(NoAlertPresentException e)
		{
			return false;
		
		}
		
	}

	@DataProvider(name="aaaa")
	
	public Object[][] testing() throws BiffException, IOException
	{
		
		File src = new File("C:\\Users\\dkunal\\Desktop\\Test data\\test.xls");
		Workbook wb  = Workbook.getWorkbook(src);
		Sheet sh = wb.getSheet(0);
		int row = sh.getRows();
		int col = sh.getColumns();
		
		Object[][] data = new Object[row][col];
		
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
		Cell c	= sh.getCell(j,i);
		data [i][j] = c.getContents();
				
			}
	
			
		}
		return data;
		
	
	
	
	
	
	}
}


