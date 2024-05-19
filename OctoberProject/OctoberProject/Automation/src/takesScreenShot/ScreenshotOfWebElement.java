package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/shadow?sublist=0");
		
		WebElement element = driver.findElement(By.xpath("//img[@class='h-full']"));
		
		File source = element.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_December_430Batch2023\\Automation\\screenshot\\logo.png");
		
		Files.copy(source, target);
	}

}
