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
	 
	@FindBy(xpath="//div[text()=' Authentication failed. Please try again. ']")
	private WebElement loginFailedMsg;
	
	@FindBy(xpath="//div[@id='forgotPasswordDiv']/div")
	private WebElement forgotPassword;
	
	@FindBy(xpath="//input[@id='_58_emailAddress']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//img[@id='_58_captcha']")
	private WebElement captchaImg;
	
	@FindBy(xpath="//input[@id='_58_captchaText']")
	private WebElement captchaText;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement forgotPassword_next;
	
	@FindBy(xpath="//a[contains(text(),'Cancel')]")
	private WebElement forgotPassword_Cancel;
	
	@FindBy(xpath="//div[contains(text(),'Text verification failed.')]")
	private WebElement text_verification_failed;

	@FindBy(xpath="//div[contains(text(),'This field is required')]")
	private WebElement thisFieldisRequired;

	/**
	 * @return the text_verification_failed
	 */
	public WebElement getText_verification_failed() {
		return text_verification_failed;
	}

	/**
	 * @return the thisFieldisRequired
	 */
	public WebElement getThisFieldisRequired() {
		return thisFieldisRequired;
	}
	
	/**
	 * @return the forgotPassword
	 */
	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	/**
	 * @return the emailAddress
	 */
	public WebElement getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @return the captchaImg
	 */
	public WebElement getCaptchaImg() {
		return captchaImg;
	}
	/**
	 * @return the captchaText
	 */
	public WebElement getCaptchaText() {
		return captchaText;
	}

	/**
	 * @return the forgotPassword_next
	 */
	public WebElement getForgotPassword_next() {
		return forgotPassword_next;
	}

	/**
	 * @return the forgotPassword_Cancel
	 */
	public WebElement getForgotPassword_Cancel() {
		return forgotPassword_Cancel;
	}
	
	public WebElement getLoginFailedMsg() {
		return loginFailedMsg;
	}

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
