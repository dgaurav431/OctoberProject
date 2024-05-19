package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		
		Thread.sleep(2000);
		
		Dimension yesDim = driver.findElement(By.id("btn")).getSize();
		Dimension noDim = driver.findElement(By.id("btn1")).getSize();
		
		int yesWidth = yesDim.getWidth();
		int yesHeight = yesDim.getHeight();

		
		int noWidth = noDim.getWidth();
		int noHeight = noDim.getHeight();
		
		if(yesWidth == noWidth && yesHeight == noHeight) {
			System.out.println("Pass: the dimensions are verified");
		}
		
		else
			System.out.println("Fail: the dimensions are not verified");




	}

}
