package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsercreateUi {

	@FindBy(xpath="//span[contains(text(),'Add User')]")
	private WebElement Adduserlink;
	
	@FindBy(xpath="//input[@id='_125_screenName']")
	private WebElement Screennametextfield;
	
	@FindBy(xpath="//input[@id='_125_emailAddress']")
	private WebElement Emailaddress;
	
	@FindBy(xpath="//input[@id='_125_firstName']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@id='_125_middleName']")
	private WebElement Middlename;
	
	@FindBy(xpath="//input[@id='_125_lastName']")
	private WebElement Lastname;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement Usersavebutton;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement Usercancelbutton;
	
	@FindBy(xpath="//span[contains(text(),'Assign Users')]")
	private WebElement Assignuser;
	
	@FindBy(xpath="//span[contains(text(),'Manage Site')]")
	private WebElement Mangesite;
	
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	private WebElement DeleteOrg;

	public WebElement getAdduserlink() {
		return Adduserlink;
	}

	public WebElement getScreennametextfield() {
		return Screennametextfield;
	}

	public WebElement getEmailaddress() {
		return Emailaddress;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getMiddlename() {
		return Middlename;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getUsersavebutton() {
		return Usersavebutton;
	}

	public WebElement getUsercancelbutton() {
		return Usercancelbutton;
	}

	public WebElement getAssignuser() {
		return Assignuser;
	}

	public WebElement getMangesite() {
		return Mangesite;
	}

	public WebElement getDeleteOrg() {
		return DeleteOrg;
	}
}
