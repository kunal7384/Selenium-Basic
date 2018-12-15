package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import jxl.read.biff.BiffException;

public class WriteExcel {
	WebDriver driver;
	@Test
	public void readExcelFile() throws BiffException, IOException
	{
java.io.File file = new java.io.File("C:\\Users\\dkunal\\Desktop\\testdata.xls");


 FileInputStream fis = new FileInputStream(file);
 
             

    HSSFWorkbook wb = new HSSFWorkbook(fis);
    
    HSSFSheet sh = wb.getSheetAt(1);
    sh.getRow(0).createCell(2).setCellValue("passsssss");
    
    sh.getRow(0).createCell(3).setCellValue("passsssss");
    sh.getRow(1).createCell(3).setCellValue("passsssss");
    
	
	FileOutputStream fos = new FileOutputStream(file);
	
	wb.write(fos);
	System.out.println("Doneeeeeee");
	
	
	}
	

}
