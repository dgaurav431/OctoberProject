package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyThePosition {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		Point newPos = new Point(100, 100);
		driver.manage().window().setPosition(newPos);

	}

}
