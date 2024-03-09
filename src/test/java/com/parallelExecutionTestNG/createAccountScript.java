package com.parallelExecutionTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class createAccountScript extends BaseScript{
	@Test
	public void createAcc() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Admin");
		driver.findElement(By.id("lastname")).sendKeys("Manager");
		
		
	}

}
