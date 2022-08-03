package com.store.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage
{
	private WebDriver driver;
	
	//1. By Locators:
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInBtn = By.id("SubmitLogin");
	private By forgotPass = By.linkText("Forgot your password?");
	
	//2. Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//3. Page Actions
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkExist()
	{
		return driver.findElement(forgotPass).isDisplayed();
	}
	
	public void enterUserName(String userName)
	{
		driver.findElement(emailId).sendKeys(userName);
	}
	
	public void enterPwd(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(signInBtn).click();
	}
}
