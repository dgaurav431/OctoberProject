package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUsingCoordinates {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(source, 100, 100).perform();
		
	}

}
