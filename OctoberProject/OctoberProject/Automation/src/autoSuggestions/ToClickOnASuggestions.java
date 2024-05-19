package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnASuggestions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("cr7");
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(), '7')]"));
		
		for(WebElement sug:allSuggestions) {
			
			if(sug.getText().contains("net")) {
				sug.click();
				break;
			}
		}
	}

}
