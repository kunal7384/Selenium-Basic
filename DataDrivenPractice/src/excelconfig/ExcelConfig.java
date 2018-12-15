package excelconfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelConfig {
	
	File file;
	FileInputStream fis;
	HSSFWorkbook wb;
	HSSFSheet st;
	FileOutputStream fos;
	
	public ExcelConfig(String excelpath) throws IOException
	{
		
	file = new File(excelpath);
	fis = new FileInputStream(file);
	wb = new HSSFWorkbook(fis);
		
		
	}
	
	
	public String getdata(int cellno , int row , int col)
	{
		st = wb.getSheetAt(0);
		
		String data =  st.getRow(row).getCell(col).getStringCellValue();
		return data;
		
		
		
		
	}

}
