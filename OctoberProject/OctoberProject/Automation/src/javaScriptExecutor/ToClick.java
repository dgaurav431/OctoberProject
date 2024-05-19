package javaScriptExecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/checkbox/disabled?sublist=2");

        WebElement checkbox = driver.findElement(By.id("domain1"));
     
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].disabled=false", checkbox);
        js.executeScript("arguments[0].click()", checkbox);

    }
}
