import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBaseClass extends BaseClass {
	
	

	
	@Test(priority=2)
     public void run() throws InterruptedException
     {
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kd@narola.email");
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//*[@class='o-btn o-btn--primary o-btn--large o-btn--shadow-green']")).click();
	  Thread.sleep(1500);
  driver.findElement(By.xpath("//*[@class='c-user-menu__avatar']")).click();
	//*[@class='c-user-menu__list u-display-none']/li[4]
/*int x= driver.findElement(By.xpath("//*[@class='c-user-menu__list u-display-none']/li[4]")).getLocation().getX();
int y= driver.findElement(By.xpath("//*[@class='c-user-menu__list u-display-none']/li[4]")).getLocation().getY();
System.out.println("loc" +x +y);
List<WebElement> ele = driver.findElements(By.xpath("//*[@class='c-user-menu__list u-display-none']/li[4]"));
System.out.println(ele.size());
for(int i=0;i<ele.size();i++)
{
int p =ele.get(i).getLocation().getX();
System.out.println("Total Size of element is " + ele.size());
System.out.println("yyyy"+p);
System.out.println(ele.get(0));
ele.get(0).click();*/
  Thread.sleep(1000);
  List<WebElement> take = driver.findElements(By.xpath("//*[@class='c-user-menu__icon c-user-menu__icon-logout']"));
  System.out.println("Size of ele" +take.size());
  System.out.println(take);
  int x = driver.findElement(By.xpath("//*[@class='c-user-menu__icon c-user-menu__icon-logout']")).getLocation().getX();
	  
  int Y = driver.findElement(By.xpath("//*[@class='c-user-menu__icon c-user-menu__icon-logout']")).getLocation().getY();
  

System.out.println("Value off " + x);

System.out.println("Value off " + Y);

for(int i =0;i<take.size();i++)
{
	int p =take.get(i).getLocation().getX();
	System.out.println(p);
	if(p!=0)
	{
		take.get(i).click();
		
	}
	
}

}


}
