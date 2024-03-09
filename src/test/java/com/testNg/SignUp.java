package com.testNg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;


public class SignUp {
	@Test
	public void signupwithEmail() {
		String email="dhanashri123@gmail.com";
		String e1=null;
		assertNull(e1);
		assertTrue(true);
		Reporter.log("signup with email succesfully"+"     "+email,true);
		
	}
		@Test
		public void verifyAcc() {
		
			Reporter.log("verify account",true);
		}

}
