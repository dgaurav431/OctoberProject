package DynamicXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphonePrice {

	public static void main(String[] args) {
		
		String price = "65,999";
		String product = "APPLE iPhone 14 Plus (Midnight, 128 GB)";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	
		WebElement iphonePrice = driver.findElement(By.xpath("//div[text()='"+product+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹"+price+"']"));
	
		System.out.println(iphonePrice.getText());
	}

}
