package com.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumWithTestNg {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("email")).sendKeys("Admin@123");
		driver.findElement(By.id("pass")).sendKeys("Admin");
	}

}
