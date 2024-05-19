package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		
		WebElement circle = driver.findElement(By.id("circle"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(circle).perform();
		
		Thread.sleep(3000);
		
		action.release(circle).perform();
		
	}

}
