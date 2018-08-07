package data.driven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Google {
	WebDriver driver;
	@Test(dataProvider="googleSearch")
	
	public void search(String name)
	{   
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement ele= 	driver.findElement(By.id("lst-ib"));
	ele.sendKeys(name);
	ele.sendKeys(Keys.ENTER);
	
		
		
		
		
	}
	
	@DataProvider(name="googleSearch")
	public Object[] test() throws BiffException, IOException
	{
	File file = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st = wb.getSheet(3);
int row=	st.getRows();
int col = st.getColumns();
System.out.println(row);
System.out.println(col);
	Object[][] data = new Object[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
		Cell c = st.getCell(j,i);
		data[i][j] = c.getContents();
		
		System.out.println(data[i][j]);
		
		}
	}
	return data;
	
		
		
		
	}
	

}
