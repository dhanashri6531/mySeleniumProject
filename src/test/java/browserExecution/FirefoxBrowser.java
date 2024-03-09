package browserExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
@Test
public class FirefoxBrowser {
	WebDriver driver;
	public void firefoxbrowser() {
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Admin@1234");
		driver.findElement(By.id("pass")).sendKeys("admin");
	}

}
