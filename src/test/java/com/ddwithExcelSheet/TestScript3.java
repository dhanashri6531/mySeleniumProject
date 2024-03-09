package com.ddwithExcelSheet;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScript3 {
	@Test
	@DataProvider
	public Object[][] login() {
		Object[][] data = null;
		try {
			FileInputStream file = new FileInputStream("../MAVEN_PROJECT/newSheet.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			int rows = wb.getSheet("Sheet1").getLastRowNum();
			int cells = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
			data = new String[rows][cells];
	
			for (int i = 0; i <= rows; i++) {
				
				for (int j = 0; j < cells; j++) {
				
					data[i][j] = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				
				}
			
		}
		}  catch (Exception e) {

		}
		return data;

	}

	@Test(dataProvider = "login")
	public void demoMethod(String[] m) {

		System.out.println(m[0]);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("gender-male")).click();

		driver.findElement(By.id("FirstName")).sendKeys(m[1]);

		driver.findElement(By.id("LastName")).sendKeys(m[2]);

		driver.findElement(By.name("Email")).sendKeys(m[3]);
		
		
	}

}
