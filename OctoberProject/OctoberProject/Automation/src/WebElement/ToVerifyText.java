package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyText {

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
		
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		nameTextField.sendKeys("Ashish");
		emailTextField.sendKeys("ashish@gamil.com");
		passwordTextField.sendKeys("sonia143");
		registerButton.click();
		
		Thread.sleep(3000);
		
		WebElement loginText = driver.findElement(By.tagName("h1"));
		
		String loginHeader = loginText.getText();
		
		if(loginHeader.equals("Login")) {
			System.out.println("Pass: the User has Registered");
		}
		
		else
			System.out.println("Fail: the User has not Registered");

	}

}
