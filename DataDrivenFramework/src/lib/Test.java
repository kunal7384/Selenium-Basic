package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		Excelconfi s = new Excelconfi("C:\\Users\\dkunal\\Desktop\\testdata.xls");
		String value =s.excel(0, 2, 0);
		System.out.println(value);
		String value1 =s.excel(0, 2, 1);
		System.out.println(value1);
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.eyerne.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(value);
		driver.findElement(By.xpath("//*[@id='password_login']")).sendKeys(value1);
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	   WebElement ele = driver.findElement(By.xpath("//*[text()='Built in last two years']"));
	 String title=ele.getText();
	 System.out.println(title);
	}

}
