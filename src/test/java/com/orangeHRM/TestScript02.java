package com.orangeHRM;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript02 {
	@Test(priority = 1)
	public void createAcc() {
		Reporter.log("create account",true);
	}
	@Test(priority = 3)
	public void deleteAcc() {
		Reporter.log("delete account",true);
	}
	@Test(priority = 5)
	public void updateAcc() {
		Reporter.log("update account",true);
	}
	@Test(priority = 4)
	public void readAcc() {
		Reporter.log("read account",true);
	}
	@Test(priority = 2)
	public void editAcc() {
		Reporter.log("edit account",true);
	}

}
