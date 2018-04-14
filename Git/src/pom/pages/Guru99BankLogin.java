package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99BankLogin {
/*	public static WebDriver driver;
	By userName=By.xpath("//*[@name='uid']");
	By password = By.xpath("//*[@name='password']");
	By login = By.xpath("//*[@name='btnLogin']");
	
	public  Guru99BankLogin (WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void set_Username(String user)
	{
		driver.findElement(userName).sendKeys(user);
		
	}
	public void set_password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
		
	}
	public void click_event()
	{
		driver.findElement(login).click();
		
	}
	
	public void set_Login(String userid,String passid)
	{
	this.set_Username(userid);
	this.set_password(passid);
	this.click_event();
	
		
		
	} */
	
	// Similar Code trying using page Factory Method 
	
	public static WebDriver driver;

@FindBy(name="uid")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(name="btnLogin")
WebElement login;

public  Guru99BankLogin (WebDriver driver)
{
	this.driver= driver;
	 PageFactory.initElements(driver, this);
	 
}

public void set_Username(String user)
{
username.sendKeys(user);
	
}
public void set_password(String pass)
{
	password.sendKeys(pass);
	
}
public void click_event()
{
login.click();
	
}

public void set_Login(String userid,String passid)
{
this.set_Username(userid);
this.set_password(passid);
this.click_event();


}
}
