package POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet st = wb.getSheetAt(2);
		int row = st.getLastRowNum();
		
		
		System.out.println(row);
		
		for(int i=0;i<=row;i++)
		{
			
			
		String data = st.getRow(i).getCell(0).getStringCellValue()	;
		System.out.println(data);
			
		}
		
	}

}
