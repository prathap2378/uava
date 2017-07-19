package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageui {
	
	
	@FindBy(css="input[id='_58_emailInput'][name='_58_login']")
	//@FindBy(css="input[id='_58_login'][name='_58_login']")
	private WebElement LoginName;
	
	@FindBy(xpath="//input[@id='_58_passwordInput']")
	//@FindBy(xpath="//input[@id='_58_password']")
	private WebElement Pasword;
	
	//@FindBy(xpath="//button[contains(text(),Login)]")
	//@FindBy(xpath="//button[contains(text(),Sign In)]")
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginButton;
	 
	public WebElement getLoginName() {
		return LoginName;
	}

	public WebElement getPasword() {
		return Pasword;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getRememberCheckBox() {
		return RememberCheckBox;
	}

	public WebElement getForgotPasswordText() {
		return ForgotPasswordText;
	}

	@FindBy(xpath="//input[@name='_58_rememberMeCheckbox']")
	private WebElement RememberCheckBox;
	
	@FindBy(xpath="//span[contains(text(),'Forgot your password?')]")
	private WebElement ForgotPasswordText;
	
	/*//New theme singn out link
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")*/
	//Old theme sign out link
	@FindBy(xpath="//a[@id='customSignOut']")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}
	
}
