package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagName {

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
		
		String nameTagName = nameTextField.getTagName();
		String emailTagName = emailTextField.getTagName();
		String passwordTagName = passwordTextField.getTagName();
		String buttonTagName = registerButton.getTagName();
		
		if(nameTagName.equals("input") && emailTagName.equals("input") && passwordTagName.equals("input") && buttonTagName.equals("button")) {
			
			nameTextField.sendKeys("Nishant");
			emailTextField.sendKeys("nishant@gmail.com");
			passwordTextField.sendKeys("Nikita143");
			registerButton.click();
			System.out.println("The user has registered");
		}
		
		else
			System.out.println("The user has not registered");

		

	}

}
