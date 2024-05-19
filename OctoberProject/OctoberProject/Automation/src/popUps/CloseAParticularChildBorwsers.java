package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAParticularChildBorwsers {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/browser/multipleTabs?sublist=3");
        
        //Parent window ID
        String parentWindowId = driver.getWindowHandle();
        
        driver.findElement(By.id("browserButton2")).click();
        
        Set<String> allIds = driver.getWindowHandles();
        
        for(String id:allIds) {
        	driver.switchTo().window(id);
        	String currentWindowTitle = driver.getTitle();
        	
        	if(currentWindowTitle.contains("Sign Up Page")) {
        		driver.close();
        		break;
        	}
        }
        //Come back to parent window
        driver.switchTo().window(parentWindowId);
        String title = driver.getTitle();
        System.out.println(title);
        
	}

}
