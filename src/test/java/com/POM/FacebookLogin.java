package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLogin {
	private WebElement emailfield;
	private WebElement  passwordfield;
	private WebElement  forgotfield;
	private WebElement  loginbutton;
	private WebElement  createnewAccount;
	
	public  FacebookLogin(WebDriver driver) {
		emailfield = driver.findElement(By.id("email"));
		passwordfield= driver.findElement(By.name("pass")); 
		forgotfield = driver.findElement(By.linkText("Forgotten password?"));
		loginbutton = driver.findElement(By.name("login"));
		createnewAccount = driver.findElement(By.linkText("Create new account"));
		
	}
	public void setLogin(String user,String pwd) {
		emailfield.sendKeys(user);
		passwordfield.sendKeys(pwd);
	}
	public void clickonLoginButton() {
		loginbutton.click();
	}
	public void clickOnForgotpassword() {
		forgotfield.click();
	}
	public void clickoncreateAccount() {
		createnewAccount.click();
	}

}
