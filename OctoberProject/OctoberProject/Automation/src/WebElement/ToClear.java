package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(2000);
		
		WebElement nameTextField = driver.findElement(By.id("name"));
		
		nameTextField.sendKeys("Akash");
		Thread.sleep(2000);
		nameTextField.clear();
		Thread.sleep(2000);
		nameTextField.sendKeys("Vikas");
	}

}
