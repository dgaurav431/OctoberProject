package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTitle {

	public static void main(String[] args) {
		
		String expectedTitle = "Facebook";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: the title is verified");
		}
		
		else
			System.out.println("Fail: the title is not verified");

	}

}
