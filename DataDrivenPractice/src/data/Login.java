package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	
	WebDriver driver;
	
	
	
	@Test(dataProvider="loginTest")
	public void valid_invalid_login(String uname , String upass)
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice-pad.com/");
		driver.findElement(By.id("username_or_email")).sendKeys(uname);
		driver.findElement(By.id("login_password")).sendKeys(upass);
		driver.findElement(By.name("commit")).click();
		
		
		
	}
	
	
	@DataProvider(name="loginTest")
	
	public Object[][] login() throws IOException, BiffException
	{
	File file = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");
	FileInputStream fis = new FileInputStream(file);
	
	Workbook wb = Workbook.getWorkbook(file);
	
	jxl.Sheet sh =  wb.getSheet(0);
	
	int row = sh.getRows();
	int col = sh.getColumns();
	
	Object[][] data = new Object[row][col];
	for(int i =0;i<row;i++)
		
		
		
	{
		
		for(int j =0;j<col;j++)
			
			
		{
			
			Cell c = sh.getCell(j,i);
			data[i][j] = c.getContents();
			
		}
		
	}
	return data;
	
		
		
	}
	

}
