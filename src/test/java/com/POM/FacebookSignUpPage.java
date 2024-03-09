package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpPage {
//	private WebElement emailfield2;
	private WebElement firstname;
	private WebElement lastname;
	private WebElement mobilenumber;
	private WebElement password;
	private WebElement date;
	private WebElement month;
	private WebElement year;
	private WebElement femaleOption;
	private WebElement maleOption;
	private WebElement customOption;
	private WebElement signup;
	
	public FacebookSignUpPage(WebDriver driver) {
		firstname = driver.findElement(By.name("firstname"));
		lastname = driver.findElement(By.name("lastname"));
		mobilenumber = driver.findElement(By.name("reg_email__"));
		password = driver.findElement(By.name("reg_password__"));
		date = driver.findElement(By.id("day"));
		month=driver.findElement(By.id("month"));
		year = driver.findElement(By.id("year"));
		femaleOption = driver.findElement(By.xpath(".//input[@value='1']"));
		maleOption = driver.findElement(By.xpath(".//input[@value='2']"));
		customOption = driver.findElement(By.xpath(".//input[@value='-1']"));
		signup = driver.findElement(By.name("websubmit"));
	}
	public void setName(String F_name,String L_name) {
		firstname.sendKeys(F_name);
		lastname.sendKeys(L_name);
	}
	public void setMobileNumber(String email) {
		mobilenumber.sendKeys(email);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void selectDOB(String day,String monthIndex,String yearIndex) {
		Select s = new Select(date);
		s.selectByVisibleText(day);
		Select s1 = new Select(month);
		s1.selectByVisibleText(monthIndex);
		Select s2 = new Select(year);
		s2.selectByVisibleText(yearIndex);
	}
	public void femaleOption() {
		femaleOption.click();
	}
	public void maleOption() {
		maleOption.click();
	}
	public void customOption() {
		customOption.click();
	}
	public void signupButton() {
		signup.click();
	}

}
