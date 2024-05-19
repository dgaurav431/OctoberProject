package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchAnEmptyChromeBrowser {

	public static void main(String[] args) {
		//launch empty chrome browser
		WebDriver driver = new ChromeDriver();
		//Navigate to main URL
		driver.get("https://www.facebook.com/");
		
		
		
	}

}
