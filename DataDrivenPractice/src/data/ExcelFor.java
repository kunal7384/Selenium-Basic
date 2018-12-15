package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFor {
	@Test()
	public void test() throws IOException
	{
		File file = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		
		HSSFSheet st = wb.getSheetAt(0);
		int row = st.getLastRowNum();
		
		System.out.println(row);
		
		for(int i=0;i<=row;i++)
		{
			
		String data = st.getRow(i).getCell(0).getStringCellValue();
			
		System.out.println(data);
		}
		
		
		
		
		
	}

}
