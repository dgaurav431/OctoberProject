package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToRateApplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/mouseHover/rating?sublist=2");
		
		WebElement rating1 = driver.findElement(By.xpath("(//*[name()='svg'])[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(rating1, 80, 0).perform();	
	}

}
