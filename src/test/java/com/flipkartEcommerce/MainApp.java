package com.flipkartEcommerce;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


@Test
public class MainApp {
	
	public void test() throws AWTException, InterruptedException {
	
		RemoteWebDriver driver = new ChromeDriver();
 driver.get("https://www.flipkart.com/");
 
		Flipkart f = new Flipkart(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		 
		f.clickOnsearch("oneplus");
		
	     
		f.pressenterButton();
		Thread.sleep(5000);
	
		Thread.sleep(4000);
	     
		f.clickOnMobiles();
	     
	     
	     driver.executeScript("window.scrollTo(200,400)");
	     Thread.sleep(2000);
	     
	
	
	    			
	     f.chooseStorage();
	     Thread.sleep(2000);
	     
	      f.clickOnPhone_1();
	      f.handlewindow();
	      Thread.sleep(4000);
	      
	       f.addToCart();
	     
	     
	     
	      
	}
	


	}

