package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheDimensionOfWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Dimension dim = driver.manage().window().getSize();
		
		int width = dim.getWidth();
		int height = dim.getHeight();
		
		System.out.println(width);
		System.out.println(height);


	}

}
