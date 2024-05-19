package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIDNameAndClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/demoApp.html");
		
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		
		usernameTextfield.sendKeys("kuch bhi");
		
		WebElement passwordTextField = driver.findElement(By.className("password"));
		
		passwordTextField.sendKeys("Kya password");
		
		WebElement checkBox = driver.findElement(By.name("box"));
		
		checkBox.click();
		
		
		
		
	}

}
