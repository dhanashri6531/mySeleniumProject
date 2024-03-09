package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithUsingPageFactory {
	WebDriver driver;
	public WithUsingPageFactory( WebDriver d) {
		driver = d;
		
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="username")
		WebElement username;
		
		@FindBy(name="pwd")
		WebElement pwd;
		
		@FindBy(xpath=".//div[text()='Login ']")
		WebElement loginbutton;
		
		public void enterusername(String user) {
			username.sendKeys(user);
		}
		public void enterpassword(String pass) {
			pwd.sendKeys(pass);
		}
		public void clickonlogin() {
			loginbutton.click();
		}
		
	}
	
	


