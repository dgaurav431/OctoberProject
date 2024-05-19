package webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAllIds {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.navigate().to("https://www.facebook.com/");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.navigate().to("https://www.instagram.com/");
		
		Set<String> allIds = driver.getWindowHandles();
		
		System.out.println(allIds);
		
		for(String id:allIds) {
			System.out.println(id);
		}

	}

}
