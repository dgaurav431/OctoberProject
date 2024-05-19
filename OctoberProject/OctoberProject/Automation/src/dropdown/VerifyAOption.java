package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyAOption {

	public static void main(String[] args) {
		
		String optionToCheck = "1901";
		boolean flag = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select selectYear = new Select(yearDropdown);
		List<WebElement> allOptionsInYear = selectYear.getOptions();
		
		int noOfOptionsInYear = allOptionsInYear.size();
		
		System.out.println("The No of options is year dropdown are : "+noOfOptionsInYear);
		
		for(WebElement option:allOptionsInYear) {
			
			if(option.getText().equals(optionToCheck)) {
				flag= true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Pass: the option is present");
		}
		
		else
			System.out.println("Fail: the option is not present");

	}

}
