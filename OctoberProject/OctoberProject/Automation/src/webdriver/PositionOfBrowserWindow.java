package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionOfBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		Point pos = driver.manage().window().getPosition();

		int xCoordinate = pos.getX();
		int yCoordinate = pos.getY();
		
		System.out.println(xCoordinate);
		System.out.println(yCoordinate);


	}

}
