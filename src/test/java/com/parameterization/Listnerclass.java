package com.parameterization;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.Reporter;

public class Listnerclass implements ITestListener{
	
	public void onStart(ITestContext result) {
		Reporter.log("onStart method invoked :",true);
	}

	public void onFinish(ITestContext result) {
		Reporter.log("onfinish method invoked :",true);
	}

	public void onTestSuccess(ITestContext result) {
		Reporter.log("on test success method invoked :"+result.getName(),true);
	}

	public void onTestStart(ITestContext result) {
		Reporter.log("ontest start method invoked :",true);
	}

	public void onTestFailure(ITestContext result) {
		Reporter.log("ontest failure method invoked :"+result.getName(),true);
	}

	public void ontestFailedButSuccessWithPercentage(ITestContext result) {
		Reporter.log("onSatert method invoked :",true);
	}

}
