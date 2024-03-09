package com.parameterization;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
	@Parameters({"username","password"})
	@Test
	public void signUp(String username,String password) {
		Reporter.log(password,true);
		Reporter.log(username,true);
		
	}

}
