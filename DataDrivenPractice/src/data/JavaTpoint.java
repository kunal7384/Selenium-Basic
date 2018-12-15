package data;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStream; 

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import jxl.Workbook;

public class JavaTpoint {
	
	public static void main(String[] args) throws IOException {
		

		
	FileOutputStream fis = new FileOutputStream("C:\\Users\\dkunal\\Desktop\\JavaTPoint.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet st = wb.createSheet("First");
		
		HSSFSheet st1 = wb.createSheet("Second");
		
		Row row  = st.createRow(2);
		  Row   row1= st1.createRow(3);
		     
		Cell cell = row.createCell(2)   ;  
		 Cell   cell1= row1.createCell(3);
		 
		 cell.setCellValue("javatpointFirst");
		 cell1.setCellValue("javatpointsecond");
		 
    wb.write(fis);
		 System.out.println("Closeddd");
		
		 
	}

}
