package stoaredcookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StoaredCookiesInfo {
	WebDriver driver;
	
 @Test
 public void cookies_read() throws IOException
 {
	 driver = new ChromeDriver();
	 driver.get("http://18.218.123.45/");
	 driver.findElement(By.xpath("//*[@name='username_or_email']")).sendKeys("Enter userName");
	 driver.findElement(By.xpath("//*[@name='login_password']")).sendKeys("Enter password");
	 driver.findElement(By.xpath("//*[@name='commit']")).click();
	 File file = new File("cookies.data");
	 file.delete();
	 file.createNewFile();
	 FileWriter writrer= new FileWriter(file);
	 BufferedWriter bw = new BufferedWriter(writrer);
	 for(Cookie ck :driver.manage().getCookies())
	 {
		 
		  bw.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
		  bw.newLine();
	 }
	 bw.close();
	 writrer.close();
	
	 
 }

}
