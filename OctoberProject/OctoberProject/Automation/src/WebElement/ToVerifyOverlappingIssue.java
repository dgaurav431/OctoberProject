package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingIssue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		Thread.sleep(2000);
		Rectangle yesButton = driver.findElement(By.id("btn")).getRect();
		Rectangle noButton = driver.findElement(By.id("btn1")).getRect();
		
		int yesButtonStartX = yesButton.getX();
		int yesButtonWidth = yesButton.getWidth();
		
		int noButtonStartX = noButton.getX();
		
		int yesButtonEndX = yesButtonStartX + yesButtonWidth;
		
		if(noButtonStartX>=yesButtonEndX) {
			System.out.println("Pass: the buttons are not overlapping");
		}
		
		else
			System.out.println("Fail: the buttons are overlapping");


	}

}
