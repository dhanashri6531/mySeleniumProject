package com.testNg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotEquals;

import org.testng.Reporter;


public class LoginApp {
	@Test
	public void loginApp() {
		String name="Dhanashri";
		String name2="DHANASHRI";
		assertNotEquals(name, name2);
		Reporter.log("log in app successfully",true);
		
	}
	@Test
	public void verifyLogin() {
		Reporter.log("account verified successfully ",true);
	}

}
