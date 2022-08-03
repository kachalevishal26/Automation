package com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	
	private static final Logger logger = LogManager.getLogger(LoginPage.class);
	
	// Page Factory or Object Repository
	@FindBy(id = "txtUsername")
	WebElement uName;

	@FindBy(id = "txtPassword")
	WebElement uPwd;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	WebElement forgotPwdLink;

	@FindBy(id = "welcome")
	WebElement welcomeMsg;

	// Initialize Page Factory or Object Repository
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean forgotPwdLinkVisible() {
		return forgotPwdLink.isDisplayed();
	}

	public void loginTest(String userName, String passWord) {
		uName.sendKeys(userName);
		uPwd.sendKeys(passWord);
		loginBtn.click();
		logger.info("login is performed");
	}

	public boolean verifyLogin() {
		WebElement msg = driver.findElement(By.id("welcome"));
		System.out.println(msg.getText().startsWith("Welcome"));
		
		logger.info("verify the login");
		return msg.getText().startsWith("Welcome");
	}
}
