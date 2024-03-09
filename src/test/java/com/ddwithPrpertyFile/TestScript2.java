package com.ddwithPrpertyFile;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TestScript2 {

	public void login() throws IOException {
		FileInputStream file = new FileInputStream("../MAVEN_PROJECT/src/test/java/com/ddwithPrpertyFile/file3.property");
		Properties p = new Properties();
		p.load(file);
		
		WebDriver driver = new ChromeDriver();
		String URL="https://www.facebook.com/login.php/";
		String username = "Admin";
		String password = "Admin@123";
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	
}
