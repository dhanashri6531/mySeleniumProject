package browserExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class EdgeBrowser {
	WebDriver driver=null;
	
	public void firefoxbrowser() {
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("email")).sendKeys("Admin@1234");
		driver.findElement(By.id("pass")).sendKeys("admin");
	}

}
