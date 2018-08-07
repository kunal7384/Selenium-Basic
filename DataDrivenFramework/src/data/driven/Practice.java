package data.driven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Practice {
	WebDriver driver;
	@Test(dataProvider="qwerty")

public void login(String uname , String pass)
{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.eyerne.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@id='password_login']")).sendKeys(pass);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	   WebElement ele = driver.findElement(By.xpath("//*[text()='Built in last two years']"));
	 String title=ele.getText();
	 System.out.println(title);
	Assert.assertEquals(title, "Built in last two years" ,"Please Enter valid Email or Password");
	driver.quit();		
	
}
	
	
	
	
	@DataProvider(name="qwerty")
	
	public Object[][] testExcel() throws BiffException, IOException
	{
		File file = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");
		Workbook wb = Workbook.getWorkbook(file);
		jxl.Sheet st = wb.getSheet(2);
		int row = st.getRows();
		int col = st.getColumns();
		System.out.println(row);
		System.out.println(col);
		
		Object[][] data = new Object[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				Cell c = st.getCell(j, i);
				
				data[i][j]=c.getContents();
				   System.out.println(data[i][j]);
				
				
			}
			
			
		}
		return data;
		
		
	}
}