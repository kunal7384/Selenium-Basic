package data;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDE {
	WebDriver driver;

	Workbook wb;
	Sheet sh;
	int nor;
	
/*	@Test(dataProvider="testing1")
	
	public void testingdata(String uname , String upass)
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://practice-pad.com/");
	driver.findElement(By.id("username_or_email")).sendKeys(uname);
	driver.findElement(By.id("login_password")).sendKeys(upass);
	driver.findElement(By.name("commit")).click();
		
		
	}
	
	
	
	@DataProvider(name="testing1")
	
	public Object[][] datatest() throws BiffException, IOException
	{
		
		wb = Workbook.getWorkbook(new File("C:\\Users\\dkunal\\Desktop\\testdata.xls"));
		sh = wb.getSheet(0);
		nor = sh.getRows();
	Object[][] data = new Object[nor][sh.getColumns()]	;
	
		for(int i =0;i<nor;i++)
		{
			
		data[i][0] = sh.getCell(0,i).getContents();
		data[i][1] = sh.getCell(1,i).getContents();
		
			
		}
	
		return data;
	}*/
	
	@Test(dataProvider="aaaa")
	public void test(String uname , String upass)
	{
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://practice-pad.com/");
	driver.findElement(By.id("username_or_email")).sendKeys(uname);
	driver.findElement(By.id("login_password")).sendKeys(upass);
	driver.findElement(By.name("commit")).click();
		
	}
	
	@DataProvider(name="aaaa")
	
	public Object[][] testing() throws BiffException, IOException
	{
		
	File src = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls")	;
	wb = Workbook.getWorkbook(src);
		
	sh = wb.getSheet(0)	;
	nor = sh.getRows();
	Object[][] data = new Object[nor][sh.getColumns()];
	
	for(int i=0;i<nor;i++)
	{
		
	data[i][0]	=sh.getCell(0,i).getContents();
		data[i][1] = sh.getCell(1,i).getContents();
		
	}
	return data;
	
	
	
		
		
		
	}

}
