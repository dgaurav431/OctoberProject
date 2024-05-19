package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
	
	@Test
	public void facebookTest() {
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
	}


