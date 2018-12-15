//package data;

//import java.io.File;
//import java.io.IOException;

/*import org.openqa.selenium.By;
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

public class DDE1 {
	//WebDriver driver;
	/*@Test(dataProvider="aaaa")
	
	public void testing(String uname , String upass)
	{
		driver= new ChromeDriver();
		driver.get("http://practice-pad.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username_or_email")).sendKeys(uname);
		driver.findElement(By.id("login_password")).sendKeys(upass);
		driver.findElement(By.name("commit")).click();
		
	}
	
	
	
	@DataProvider(name="aaaa")
	public Object[][] beta() throws BiffException, IOException
	{
	File src = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls")	;
	
	Workbook wb = Workbook.getWorkbook(src);
		
		Sheet sh = wb.getSheet(0);
		int nor = sh.getRows();
		int col = sh.getColumns();
	Object[][]  data = new Object[nor][col]	;
	
	for(int i =0;i<nor;i++)
	{
		
     for(int j=0;j<col;j++)
     {
    	 
    	Cell c = sh.getCell(j, i) ;
    	data[i][j] = c.getContents();
    	
    	System.out.println(data[i][j]);
     }
		
	}
	return data;
	}*/
	
	
/*	@Test(dataProvider="aaaa")
	
	public void test(String uname , String upass)
	{
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice-pad.com/");
		driver.findElement(By.id("username_or_email")).sendKeys(uname);
		driver.findElement(By.id("login_password")).sendKeys(upass);
		driver.findElement(By.name("commit")).click();
		
		
	}
	
	
	@DataProvider(name="aaaa")
	
	public Object testing() throws BiffException, IOException
	{
		
		File src = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");
		Workbook wb  = Workbook.getWorkbook(src);
		Sheet sh = wb.getSheet(1);
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
	}*/
	
	
	
	
	
	
	
	
	
	