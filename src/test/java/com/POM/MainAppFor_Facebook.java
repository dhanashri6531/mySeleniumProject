package com.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainAppFor_Facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 FacebookLogin page = new  FacebookLogin(driver);
		 page.setLogin("Admin@123","Manager");
		 page.clickonLoginButton();
		 page.clickoncreateAccount();
	}
	public class TestAccount{
		@Test
		public void testLogin() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 FacebookLogin page = new  FacebookLogin(driver);
			 page.clickoncreateAccount();
			 
			 FacebookSignUpPage page1 = new  FacebookSignUpPage(driver);
			 page1.setName("Admin","Manager");
			 page1.setMobileNumber("Admin@gmail.com");
			 page1.setPassword("Admin@123");
			 page1.selectDOB("19", "sept", "2000");
			
		}
	}

}
