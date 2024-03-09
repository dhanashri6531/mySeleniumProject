package com.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider02 {
	@DataProvider
	public Object[][] data(){
		Object[][] obj = new Object[1][2];
		obj[0][0]="Admin@123.gmail.com";
		obj[0][1]="Admin";
		return obj;
		
		
	}
	@Test(dataProvider = "data")
	public void logIn(String email,String pwd) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
	}

}
