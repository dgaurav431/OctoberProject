package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/progress?sublist=0");
		
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start']"));
		WebElement resetButton = driver.findElement(By.xpath("//button[text()='Reset']"));
		
		startButton.click();
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElement(startButton, "Start"));
		wait.ignoring(Exception.class);
		
		resetButton.click();

	}

}
