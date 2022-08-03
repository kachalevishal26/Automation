package com.test.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.base.TestBase;
import com.test.pages.HomePage;
import com.test.pages.LoginPage;

public class HomePageTest extends TestBase 
{
	HomePage homePage;
	LoginPage loginPage;	
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void addProduct() throws InterruptedException
	{
		loginPage.loginTest();
		homePage.productAdd();
		homePage.shoppingCart();
	}
}
