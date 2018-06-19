package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsDemo {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement element = driver.findElement(By.id("select-demo"));
		Select select = new Select(element);
		List<WebElement> list_opt =select.getOptions();
		int list_count = list_opt.size();
		System.out.println("Size of checkBox filed is "+ list_count);
		
	for(WebElement text : list_opt)
	{
		
		String textofelement = text.getText();
		System.out.println(textofelement);
		select.selectByVisibleText("Friday");
		
	}
	}

}
