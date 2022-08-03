package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;
import com.utils.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@DataProvider
	public Object[][] excelData() {
		Object data[][] = TestUtil.getData("login");
		return data;
	}

	@Test(dataProvider = "excelData")
	public void loginTest(String uName, String pwd) {
		loginPage.loginTest(uName,pwd);
//		boolean flag = loginPage.verifyLogin();
//		assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
