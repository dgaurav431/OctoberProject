package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyDimension {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Dimension dim=new Dimension(800, 400);
		driver.manage().window().setSize(dim);
	}

}
