package com.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainAppForPageFactory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/test26/login.do");
		
		WithUsingPageFactory page = new WithUsingPageFactory(driver);
		page.enterusername("Admin");
		page.enterpassword("Manager123");
		Thread.sleep(2000);
		page.clickonlogin();
	}

}
