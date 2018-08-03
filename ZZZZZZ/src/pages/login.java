package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	public static WebDriver driver;
	@FindBy(xpath="//*[@name='email']")
	WebElement email;
	@FindBy(name="password_login")
    WebElement password;
	@FindBy(xpath="//*[@class='o-btn o-btn--small o-btn--primary o-btn--shadow-green']")
	 WebElement click;


     public login(WebDriver driver)
     {
    	 
    	this.driver= driver;
    	 PageFactory.initElements(driver, this);
    	 
     }
     
     public void set_email(String Email)
     
     {
    	 
    	email.sendKeys(Email); 
    	 
     }
     
public void set_password(String Pass)
     
     {
    	 
    	password.sendKeys(Pass); 
    	 
     }


public void clicked()

{
	 
	click.click(); 
	 
}

public void verify_login(String UserNAme ,String PAssword)
{
	
this.set_email(UserNAme);
this.set_password(PAssword);
this.clicked();

}
} 
