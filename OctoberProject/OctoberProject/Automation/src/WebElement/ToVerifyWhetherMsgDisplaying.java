package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWhetherMsgDisplaying {

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
		
		
		WebElement msg = driver.findElement(By.xpath("//div[text()='Registered successfully']"));
		
		boolean registeredMsgDisplyed = msg.isDisplayed();
		
		if(registeredMsgDisplyed) {
			System.out.println("Pass: the message is displyed");
		}
		
		else
			System.out.println("Fail: the message is not displyed");

	}

}
