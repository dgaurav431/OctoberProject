package crossBrowserTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		GoogleTest.verifyGoogleTitle(new ChromeDriver());
		System.out.println("Google Title is tested in Chrome");
		
		GoogleTest.verifyGoogleTitle(new FirefoxDriver());
		System.out.println("Google Title is tested in Firefox");
		
		GoogleTest.verifyGoogleTitle(new EdgeDriver());
		System.out.println("Google Title is tested in Edge");



	}

}
