package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookForgotPassword {
	private WebElement emailfield1;
	private WebElement cancelButton;
	private WebElement searchField;
	
	
	public FacebookForgotPassword(WebDriver driver) {
		emailfield1= driver.findElement(By.id("identify_email"));
		searchField=driver.findElement(By.name("did_submit"));
		cancelButton=driver.findElement(By.linkText("Cancel"));
	}
	public void setEmail(String email) {
		emailfield1.sendKeys(email);
	}
	public void clickOnsearchButton() {
		searchField.click();
	}
	public void clickOnCancelButton() {
		cancelButton.click();
	}

}
