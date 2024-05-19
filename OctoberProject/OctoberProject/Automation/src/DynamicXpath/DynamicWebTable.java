package DynamicXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/table/dynamic-table");
		
		String price = driver.findElement(By.xpath("//th[contains(text(), 'Levi')]/..//td[4]")).getText();
		
		System.out.println(price);
	
	}

}
