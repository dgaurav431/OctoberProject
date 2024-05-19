package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class
public class GoogleSearchPage {

	public GoogleSearchPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement textbox;

	public WebElement getTextbox() {
		return textbox;
	}

	
	public void serchQuerry(String querry) {
		textbox.clear();
		textbox.sendKeys(querry);
		textbox.sendKeys(Keys.ENTER);
	}
}
