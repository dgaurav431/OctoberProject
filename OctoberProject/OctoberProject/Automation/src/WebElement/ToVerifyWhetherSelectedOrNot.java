package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyWhetherSelectedOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/radio?sublist=0");
		
		WebElement radioButton = driver.findElement(By.id("attended"));
		
		radioButton.click();
		
		if(radioButton.isSelected()) {
			
			System.out.println("Pass: the radio button is selected");
				
		}
		
		else
			System.out.println("Fail: the radio button is not selected");

		
		
	}

}
