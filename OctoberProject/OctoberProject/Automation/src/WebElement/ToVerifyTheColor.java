package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheColor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button");
		
		Thread.sleep(2000);
		
		WebElement yesButton = driver.findElement(By.id("btn"));
		
		yesButton.click();
		String yesButtonColor = yesButton.getCssValue("background-color");
		
		System.out.println(yesButtonColor);
		
		if(yesButtonColor.contains("252, 186, 116")) {
			System.out.println("Pass: the button color changes");
		}
		
		else
			System.out.println("Fail: the button color does not change");

		
	}

}
