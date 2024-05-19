package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		List<WebElement> allLink = driver.findElements(By.xpath("//a[@class=\"nav-link\"]"));
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		
		for(WebElement link:allLink) {
			link.click();
		}
		
		action.keyUp(Keys.CONTROL).perform();
		
		
	}

}
