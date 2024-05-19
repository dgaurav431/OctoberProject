package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutsideFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/User/Desktop/frame.html");
		
		WebElement frameRef = driver.findElement(By.xpath("//iframe[@src='https://www.selenium.dev/']"));
		
		driver.switchTo().frame(frameRef);
		
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.tagName("input")).click();
	}

}
