package com.ddwithPrpertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) throws IOException {
		
		  FileInputStream file = new FileInputStream("../MAVEN_PROJECT/sample.propertie");
		  Properties p = new Properties();
		  p.load(file);
		  String URL = p.getProperty("url");
		  
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));                                                                        
	    String username = p.getProperty("un");
	    driver.findElement(By.name("username")).sendKeys(username);
		String password = p.getProperty("pass");
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath(".//button[text()=' Login ']")).click();
		 
		
	}
	
	

}
