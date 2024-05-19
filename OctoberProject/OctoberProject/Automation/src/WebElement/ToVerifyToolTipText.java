package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyToolTipText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		
		String toolTipText = driver.findElement(By.id("name")).getAttribute("title");
		
		System.out.println(toolTipText);
//		
//		if(toolTipText.contains("Enter your name")) {
//			System.out.println("Pass: the tool tip text is verified");
//		}
//		
//		else
//			System.out.println("Fail: the tool tip text is not verified");

	}

}
