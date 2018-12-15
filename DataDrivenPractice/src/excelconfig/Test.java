package excelconfig;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		ExcelConfig e = new ExcelConfig("C:\\Users\\dkunal\\Desktop\\testdata.xls");
		
		String username = e.getdata(0, 1, 0);
		String username1 = e.getdata(0, 1, 1);
		
		
		System.out.println(username);
		System.out.println(username1);
		
		
		
	}

}
