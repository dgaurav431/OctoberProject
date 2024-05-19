package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignmentIssue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/button?sublist=0");
		
		Thread.sleep(2000);
		
		 Point firstYesLoc = driver.findElement(By.id("btn")).getLocation();
		 Point secondYesLoc = driver.findElement(By.id("btn2")).getLocation();
		 
		 int firstYesXCoordinate = firstYesLoc.getX();
		 int secondYesXCoordinate = secondYesLoc.getX();
		 
		 if(firstYesXCoordinate == secondYesXCoordinate) {
			 System.out.println("Pass: the buttons are alligned");
		 }
		 
		 else
			 System.out.println("Fail: the buttons are not alligned");


	}

}
