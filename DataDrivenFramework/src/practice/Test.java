package practice;

public class Test {

	
	public static void main(String[] args) {
		Excelconfig test = new Excelconfig("C:\\Users\\dkunal\\Desktop\\testdata.xls");
		
		String username = test.getdata(0, 1, 0);
		String password = test.getdata(0, 1, 1);
		System.out.println(username);
		System.out.println(password);
		
	}
		
	
}
