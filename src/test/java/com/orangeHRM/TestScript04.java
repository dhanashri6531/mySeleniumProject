package com.orangeHRM;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript04 {
	@Test
	public void test_01() {
		SoftAssert s= new SoftAssert();
		Reporter.log("Test 01 method execution is started",true);
		String str1 = "Dhanashri";
		String str2 = "DHANASHRI";
		Reporter.log("verification 01 started",true);
		s.assertEquals(str1, str2);
		Reporter.log("verification 02 started",true);
		String str3 = "dhanashri";
		s.assertEquals(str1, str3);
		Reporter.log("Test 01 method execution is end",true);
		s.assertAll();
	}
	@Test
	public void test_02() {
		Reporter.log("test_02",true);
	}

}

