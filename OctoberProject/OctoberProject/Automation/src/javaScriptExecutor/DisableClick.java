package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html");
        
        driver.findElement(By.linkText("jdk-11.0.20_linux-aarch64_bin.rpm")).click();
        
        WebElement link = driver.findElement(By.linkText("Download jdk-11.0.20_linux-aarch64_bin.rpm"));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", link);

	}

}
