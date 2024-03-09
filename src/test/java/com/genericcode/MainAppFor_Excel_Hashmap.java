package com.genericcode;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainAppFor_Excel_Hashmap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HashMapCode.test();
		HashMap<String, String> data= HashMapCode.hashmapdata;
		System.out.println(data);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		if(data.get("Gender").equals("Gender_male"))
			driver.findElement(By.id("gender-male")).click();
		else
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.id("FirstName")).sendKeys(data.get("Fname"));
		  driver.findElement(By.id("LastName")).sendKeys(data.get("Lname"));

		driver.findElement(By.name("Email")).sendKeys(data.get("emailID"));
		driver.findElement(By.name("Password")).sendKeys(data.get("Pass"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get("Pass"));
		}
	}


