package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllSuggestions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("cr7");
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//span[contains(text(), '7')]"));
		
		int noOfSuggestions = allSuggestions.size();
		
		System.out.println("The no of Suggestions are : "+noOfSuggestions);
		
		for(WebElement sug:allSuggestions) {
			System.out.println(sug.getText());
		}
	}

}
