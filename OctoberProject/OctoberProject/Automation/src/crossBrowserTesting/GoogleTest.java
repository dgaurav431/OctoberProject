package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static void verifyGoogleTitle(WebDriver driver) {
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		 
		String title = driver.getTitle();
		
		if(title.contains("Google")) {
			System.out.println("Pass: the title is verified");
		}
		
		
		else
			System.out.println("Fail: the title is not verified");
		
		driver.quit();

	}

}
