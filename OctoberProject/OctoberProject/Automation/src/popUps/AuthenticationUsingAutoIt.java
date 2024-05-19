package popUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationUsingAutoIt {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
        
        Runtime.getRuntime().exec("file path of the .exe file");
        
	}

}
