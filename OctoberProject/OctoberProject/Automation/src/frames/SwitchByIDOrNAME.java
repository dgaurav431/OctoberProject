package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchByIDOrNAME {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/User/Desktop/frame.html");
		
		driver.switchTo().frame("somethingElse");
		
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();

	}

}
