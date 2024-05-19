package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		boolean enabled = driver.findElement(By.id("name")).isEnabled();
		
		if(enabled) {
			System.out.println("Pass: the text field is enabled");
		}
		
		else
			System.out.println("Fail: the text field is not enabled");

	}
	

}
