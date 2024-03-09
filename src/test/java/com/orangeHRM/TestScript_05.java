package com.orangeHRM;

import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestScript_05 {
	@Test
	public void test_01() {
		String str1 = "dhanashri";
		String str2 = "DHANAshri";
		org.testng.Assert.assertNotEquals(str1, str2);
	}
	@Test
	public void test_02() {
		String str3 = "--dhanno";
		String str4 = null ;
		Assert.assertNull(str3);
		assertNotNull(str4);
	}
	@Test
	public void test_03() {
		int a = 20;
		int b = 30;
		Assert.assertTrue(false);
		
	}

}
