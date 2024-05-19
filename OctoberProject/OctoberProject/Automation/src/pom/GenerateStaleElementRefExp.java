package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateStaleElementRefExp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");

		// WebElement textBox = driver.findElement(By.name("q"));

		GoogleSearchPage search = new GoogleSearchPage(driver);
//Example:1       
//        search.getTextbox().sendKeys("Hrithik");
//        
//        driver.navigate().refresh();
//        
//        search.getTextbox().sendKeys("Sunny");

		// Example:2
		search.serchQuerry("Lord Bobby");
		search.serchQuerry("Malaika");

	}

}
