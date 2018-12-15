package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliTest {
	public WebDriver driver;
	
	@Test
	
	public void sikuli_test() throws FindFailed, InterruptedException
	{
		Screen screen  = new Screen();
	  /*  Pattern image_signin =new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\signin.PNG");
		Pattern image_username = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\userid.PNG");
		Pattern image_password = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\pass.PNG");
	  	Pattern image_login = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\login.PNG");
		Pattern image_logOut = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\create.PNG");
		Pattern image_title = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\title.PNG");
		Pattern file = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\choosefile.PNG");
		Pattern fileopen = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\open.PNG");
		Pattern image_desk = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\desk.PNG");
		
		Pattern image_text = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\text.PNG");
		
		Pattern image_search = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\search.PNG");
		
		Pattern image_notepad = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\notepad.PNG");
		
		
		Pattern image_notepadtext = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\notepadtext.PNG");
		
		Pattern image_notepadfile = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\save.PNG");
		
		
		Pattern image_saveas = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\saveas.PNG");
		
		Pattern image_saved = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\saved.PNG");
		
		Pattern image_desk1 = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\desk1.PNG");
		Pattern image_text1 = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\text1.PNG");
		
		
		
		Pattern image_yes = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\yes.PNG");
		
		Pattern image_close = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\close.PNG");
		
		
		Pattern image_download = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\download.PNG");
		
		Pattern image_download1 = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\download1.PNG");
		
		Pattern image_online = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\online.PNG");
		
		
		
		driver = new ChromeDriver();
		driver.get("http://13.232.104.220/");
		driver.manage().window().maximize();
		screen.wait(image_signin, 20);
		screen.click(image_signin);
		screen.type(image_username,"kd@narola.email");
		screen.type(image_password,"password");
		screen.click(image_login);
		screen.wait(image_logOut, 20);
		screen.click(image_logOut);
		
		
		screen.type(image_title,"test My Post");
		
		screen.wait(file,10);
		screen.click(file);
		screen.wait(image_desk,10);
		screen.click(image_desk);
		screen.wait(image_text,10);
		screen.type(image_text,"b.jpg");
		screen.wait(fileopen,10);
		screen.click(fileopen);
		driver.findElement(By.xpath("//textarea[@id='post_description']")).sendKeys("Here Enter Your Descrpition About Your Post That you want to Upload");
	
		
		
		// Automating Desktop Appliaction 
		
		screen.wait(image_search,10);
		screen.type(image_search,"notepad");
		screen.click(image_notepad);
		
		screen.type(image_notepadtext,"Text for Sikuli Script testing Purpose.Add some text for verification purpose to check it save or not.");
		
		screen.wait(image_notepadfile,10);
		
        screen.click(image_notepadfile);
        
        screen.click(image_saveas);
        
        screen.wait(image_desk1,10);
        screen.click(image_desk1);
        
        screen.type(image_text1,"sikulii");
        
        screen.click(image_saved);
        
     
        screen.click(image_yes);
        screen.click(image_close);
        
        */
        
        
        // For Downloading File Use Practice pad Project Url
        
		
		
		
		
		Screen s = new Screen();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get("http://practice-pad.com");  
      driver.findElement(By.id("username_or_email")).sendKeys("bhavesh");
      driver.findElement(By.id("login_password")).sendKeys("password");
      driver.findElement(By.name("commit")).click();
      Thread.sleep(1500);
      driver.findElement(By.id("search_user")).sendKeys("Kunal Dhote");
      Thread.sleep(1500);
      
      driver.findElement(By.xpath("//*[text()='Select Student']")).click();
   
        driver.findElement(By.xpath("//a[contains(text(),'Video')]")).click();
        
        Pattern video_test = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\video.PNG");
        
     //   Pattern video_pause = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\pause.PNG");
        
        Pattern video_full = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\full.PNG");
        
        Pattern video_d = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\d.PNG");
        
        
        Pattern video_d2 = new Pattern("C:\\Users\\dkunal\\Desktop\\driver\\sikuli\\d2.PNG");
        
        s.click(video_test);
      //  s.click(video_pause);
        
        s.click(video_full);
        
        s.click(video_d);
        
        
        s.click(video_d2);
        
        
        
      //  driver.close();
        
        
		
		
		
		
		
		
		
	}

}
