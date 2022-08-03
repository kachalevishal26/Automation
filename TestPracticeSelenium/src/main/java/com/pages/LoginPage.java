package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	//ObjectRepository
	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(id = "welcome")
	WebElement loginSuccess;

	//InitializeObjectsRepository
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions
	public void loginTest(String username, String pwd) {
		userName.sendKeys(username);
		password.sendKeys(pwd);
		loginBtn.click();
	}

	public boolean verifyLogin() {
		return loginSuccess.getText().startsWith("Welcome");
	}
}
