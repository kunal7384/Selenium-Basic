import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCap {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");

		String name = cap.getBrowserName();
		System.out.println("Name of The Browser " + name);

		cap.setPlatform(Platform.WIN10);

		cap.getPlatform();
		System.out.println("paltform name is " + cap.getPlatform());

		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int alllinks = allLink.size();
		System.out.println("Total Link Element Present Under Tag A is::::" + alllinks);
		String all[] = new String[alllinks];

		for (int i = 0; i < allLink.size(); i++) {

			WebElement ele = allLink.get(i);
			String url = ele.getAttribute("href");
			all[i] = allLink.get(i).getAttribute("href");

			System.out.println(url);

			verifyLinkActive(url);
		}

		for (int i = 0; i < alllinks; i++) {
			driver.navigate().to(all[i]);

		}

	}

	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}

	}

}
