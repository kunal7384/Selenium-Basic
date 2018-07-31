package writeexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcelFile {
	 
	
	
	public static void main(String[] args) throws IOException {
		
	File file = new File("C:\\Users\\dkunal\\Desktop\\testdata.xls");
	FileInputStream fis = new FileInputStream(file);
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	HSSFSheet st = wb.getSheetAt(0);
	
        st.getRow(0).createCell(2).setCellValue("pass");
        st.getRow(1).createCell(2).setCellValue("fail");
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		System.out.println("Done");
		
		
		
		
	}

}
