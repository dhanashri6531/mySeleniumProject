package browserExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class ChromeBrowser {
	WebDriver driver = null;
	public void chromebrowser() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("admin123");
	}
	
	}
