package com.parallelExecutionTestNG;
//import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseScript {
	WebDriver driver;
	@Parameters("BrowserName")
	@BeforeClass
	public void openBrowser(String BrowserName) {
		if(BrowserName.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}else if(BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new EdgeDriver();
		}

	}
	
	@BeforeMethod
	
	public void openApplication(){
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@AfterTest
	public void testMethodExecution(ITestResult result) {
		String methodName = result.getName();
		if(result.getStatus()==1) {
			Reporter.log(methodName+"Execution is pass",true);
		}else {
			Reporter.log(methodName+"Execution is fail",true);
		}
	}
@Test
	public void handleException() {
		try {
            ////
		}catch(Exception e){
			System.out.println("an unexpected exception ocuur"+e.getMessage());
			
		}
	}
	@AfterClass
	public void closebrowser() {
		
		driver.close();
	}

}
