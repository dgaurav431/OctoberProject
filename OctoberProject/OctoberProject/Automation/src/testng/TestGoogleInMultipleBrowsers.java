package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestGoogleInMultipleBrowsers {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void test(String localBrowser) {
		
		if(localBrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(localBrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		if(localBrowser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.co.in/");
	}

}
