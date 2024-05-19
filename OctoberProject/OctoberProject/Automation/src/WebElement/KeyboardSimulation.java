package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(3000);
		
		//Using Id Locator
		WebElement nameTextField = driver.findElement(By.id("name"));
		
		//Using name Locator
		WebElement emailTextField = driver.findElement(By.name("email"));
		
		//Using cssSelector Locator
		WebElement passwordTextField = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
		
		nameTextField.sendKeys("Sandeep");
		emailTextField.sendKeys("sandeep@gmail.com");
		
		Thread.sleep(2000);
		
		emailTextField.sendKeys(Keys.CONTROL, "a");
		
		Thread.sleep(2000);
		
		emailTextField.sendKeys(Keys.CONTROL, "c");
		
		Thread.sleep(2000);
		
		passwordTextField.sendKeys(Keys.CONTROL, "v");
		
		Thread.sleep(2000);
		
		passwordTextField.sendKeys(Keys.ENTER);

		
	}

}
