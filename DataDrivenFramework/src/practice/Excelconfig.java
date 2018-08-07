package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excelconfig {
	HSSFWorkbook wb;
	File file;
	FileInputStream fis;
	HSSFSheet st;
	HSSFCell cell;
	
	
	
	public Excelconfig(String excelpath) 
	
	{
	try {
		file = new File(excelpath);
		fis = new FileInputStream(file);
		wb = new HSSFWorkbook(fis)	;
	} catch (Exception e) {
		e.printStackTrace();

	}
		
		
	}
    public String getdata(int sheetno,int row , int col)
    
    {
    
    	st = wb.getSheetAt(0);
    	
        String data = st.getRow(row).getCell(col).getStringCellValue();
    	
		return data;
    	
    	
    	
    }
}
