package webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://www.facebook.com/");

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://www.instagram.com/");
		
		Set<String> allIds = driver.getWindowHandles();
		 
		for(String id:allIds) {
			
			driver.switchTo().window(id);
			String currentPageTitle = driver.getTitle();
			
			if(currentPageTitle.contains("Google")) {
				driver.close();
				break;
			}
			
		}
		
		
		
	}

}
