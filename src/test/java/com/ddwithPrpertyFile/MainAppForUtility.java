package com.ddwithPrpertyFile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class MainAppForUtility {
	public void login() throws Exception {
		WebDriver driver = new ChromeDriver();
		UtilityMethod un = new UtilityMethod();
		driver.get(un.getDataFromExcelSheet("Sheet1", 0, 0));
		
		driver.get(un.getDataFromePropertyFile("url"));
	}

}

