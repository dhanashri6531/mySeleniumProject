package com.parallelExecutionTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginScript extends BaseScript {
	@Test
	public void fbLogin() {
		driver.findElement(By.id("email")).sendKeys("Admin@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("Admin123");
		driver.findElement(By.name("login")).submit();
	}

}
