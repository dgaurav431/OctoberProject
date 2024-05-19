package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		Navigation nav = driver.navigate();
		Thread.sleep(2000);
		nav.to("https://www.facebook.com/");
		Thread.sleep(2000);
		nav.to("https://www.instagram.com/");
		Thread.sleep(2000);
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();

		
	}

}
