package data.driven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDFC {
	WebDriver driver;
	@Test(dataProvider="testdatadriven")
	
	public void login(String username , String password)
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.eyerne.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password_login']")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	   WebElement ele = driver.findElement(By.xpath("//*[text()='Built in last two years']"));
	 String title=ele.getText();
	 System.out.println(title);
	//Assert.assertEquals(title, "Built in last two years" ,"Please Enter valid Email or Password");
	 System.out.println("===========================================================");
	driver.quit();
		
	}
	
	
	@DataProvider(name="testdatadriven")
	public Object[][] test() throws BiffException, IOException
	{
		
	File file  = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");

		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(2);
		int row=st.getRows();
		System.out.println("Number of Rows=::" +row);
		int col = st.getColumns();
		System.out.println("Number of column=:: "+col);
		Object[][] data =  new Object[row][col];
	/*	for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)	
			{
				Cell c = st.getCell(j, i);
				data[i][j]=c.getContents();
				System.out.println("Test Data " +data[i][j]);
				
			}
			
			
		}*/
		 for(int i=1;i<row;i++)
		 {
			 
			 data[i][0]=st.getCell(0,i).getContents();
			// Fetch first row password
		data[i][1]=st.getCell(1,i).getContents(); 
			 
			 
		 }
		return data;
		
		
	}

}
