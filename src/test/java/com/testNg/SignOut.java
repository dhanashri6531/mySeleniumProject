package com.testNg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;


public class SignOut {
	@Test  (priority = 2)
	public void signout() {
		Reporter.log("succesfully signout",true);
	}
	@Test(priority = 1)
	public void displayAcc() {
		String str1=".................";
		assertTrue(true);
		Reporter.log("deleted account displyed or not"+""+str1,true);
	}

}
