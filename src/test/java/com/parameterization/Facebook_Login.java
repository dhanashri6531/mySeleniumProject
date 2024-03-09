package com.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listnerclass.class)
public class Facebook_Login {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("email")).sendKeys("Admin@123.gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Admin");
		driver.findElement(By.name("login")).submit();
		
		Assert.assertEquals(driver.getTitle(),"Facebook-login or signup");	
	}
	@Test
	public void testFail() {
		Reporter.log("failed test case :",true);
		Assert.assertTrue(false);
	}
	@Test
	public void testskipped() {
		Reporter.log("skipped test case :",true);
		throw new SkipException("skip execution....");
	}

}
