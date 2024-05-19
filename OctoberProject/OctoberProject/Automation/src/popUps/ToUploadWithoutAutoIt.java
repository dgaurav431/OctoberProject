package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUploadWithoutAutoIt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
        
        driver.findElement(By.id("fileInput")).sendKeys("C:/Users/User/Desktop/demoPrint.pdf");
        
	}

}
