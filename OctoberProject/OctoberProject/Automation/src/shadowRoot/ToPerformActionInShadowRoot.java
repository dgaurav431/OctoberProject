package shadowRoot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionInShadowRoot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/shadow?sublist=0");
		
		driver.findElement(By.xpath("(//div[@class=\"my-3\"])[1]")).getShadowRoot()
		.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("admin");
	}

}
