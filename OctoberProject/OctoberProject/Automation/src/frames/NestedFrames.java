package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
		
		driver.switchTo().frame("nestedFrameName");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("newWindow");
		
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("akash@gmail.com");
		
	}

}
