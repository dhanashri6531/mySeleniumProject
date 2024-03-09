package com.parameterization;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class I_TestResult extends Assert{
	@Test
	public void testCaseFail() {
		fail();
	}
	@Test
	public void testCasePass() {
		assertTrue(true);
	}
	@AfterMethod
	public void getStatus(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			Reporter.log("success = method status :"+result.getStatus()+"Method Name :"+result.getName(),true);

		}if(result.getStatus()==ITestResult.FAILURE) {
			Reporter.log("failure : method status :"+result.getStatus()+"Method Name :"+result.getName(),true);
		}
		
	}
	

}
