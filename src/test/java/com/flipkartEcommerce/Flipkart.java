package com.flipkartEcommerce;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart {
	
	WebDriver driver;
	public Flipkart(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=".//input[@name='q']")
	WebElement search;
	
	@FindBy(linkText="Mobiles")
	WebElement clickonMobile;
	
	@FindBy(xpath=".//div[text()='8 GB and Above']")
	WebElement storage;
	
	@FindBy(xpath ="//body/div[@id='container']/div/div[@class='_36fx1h _6t1WkM _3HqJxg']/div[@class='_1YokD2 _2GoDe3']/div[@class='_1YokD2 _3Mn1Gg']/div[3]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")
	WebElement selectPhone;
//	@FindBy(xpath ="//button[normalize-space()='Add to cart']")
//	WebElement addtocart;
	
	public void clickOnsearch(String name) {
		search.sendKeys(name);	
	}
	public  void pressenterButton() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);	
		
	}
	public void clickOnMobiles() {
		clickonMobile.click();
	}
	public void chooseStorage() {
		storage.click();
	}
	public void clickOnPhone_1() throws InterruptedException {
		
		 
		selectPhone.click();	
	}
	public void handlewindow() {
		String parentpage = driver.getWindowHandle();
		Set<String> allPages = driver.getWindowHandles();
		for(String page : allPages) {
			if(!page.equals(parentpage)) {
				driver.switchTo().window(page);
				break;
			}
	
		}

	}
	
	public void addToCart() {
		WebElement addtocart = driver.findElement(By.className("col col-6-12"));
		
		addtocart.submit();
		
		
		
		}
	 }
	

	
	

