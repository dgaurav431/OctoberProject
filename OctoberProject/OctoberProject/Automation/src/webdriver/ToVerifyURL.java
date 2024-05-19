package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyURL {

	public static void main(String[] args) {
		String expectedData = "iphone";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.contains(expectedData)) {
			System.out.println("Pass: the content in URL is verified");
		}
		
		else
			System.out.println("Fail: the content in URL is not verified");

	}

}
