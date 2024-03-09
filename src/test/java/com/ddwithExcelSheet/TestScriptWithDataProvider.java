package com.ddwithExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestScriptWithDataProvider {
	@Test
@DataProvider
	public void dataProvider_01() throws EncryptedDocumentException, IOException {
	
	  String path="../MAVEN_PROJECT/newSheet.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		
		Sheet sh = wb.getSheet("sheet1");
		String firstname = sh.getRow(0).getCell(1).toString();
		String lastname = sh.getRow(0).getCell(2).toString();
		String email = sh.getRow(0).getCell(3).toString();
		
		String firstname2 = sh.getRow(1).getCell(1).toString();
		String lastName2 = sh.getRow(1).getCell(2).toString();
		String email2 = sh.getRow(1).getCell(3).toString();
	}
	@Test(dataProvider ="dataProvider_01" )
	public void demo(String name,String name1,String mail) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-male")).sendKeys(name1);
	}
}
