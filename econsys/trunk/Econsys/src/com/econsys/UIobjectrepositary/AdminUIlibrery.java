package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminUIlibrery {

	@FindBy(linkText="MonorailAdmin")
	private WebElement MonorailAdmintab;
	
	public WebElement getMonorailAdmintab() {
		return MonorailAdmintab;
	}

	@FindBy(xpath="//button[@id='_monorailinternaladmin_WAR_monorailinternaladminportlet_upload']")
	private WebElement uploadbutton;
	
	@FindBy(xpath="//a[contains(text(),'RoleManagement')]")
	private WebElement Rolemanagmenttab;
	
	@FindBy(xpath="//a[contains(text(),'ProcessManagement')]")
	private WebElement ProcessManagementtab;
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	private WebElement CreatRolebutton;
	
	@FindBy(xpath="//select[@id='_monorailinternaladmin_WAR_monorailinternaladminportlet_orgId']")
	private WebElement selectingorgcreatingRole;
	
	@FindBy(xpath="//input[@id='_monorailinternaladmin_WAR_monorailinternaladminportlet_roleName']")
	private WebElement EnterRoletextfield;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	private WebElement SubmitRolebutton;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement CancelRolebutton;
	
		
	@FindBy(id="_monorailinternaladmin_WAR_monorailinternaladminportlet_jpdl_file")
	private WebElement browsebutton;

	@FindBy(xpath="//select[@id='_monorailinternaladmin_WAR_monorailinternaladminportlet_org_id']")
	private WebElement selectorgnisation;
	
	@FindBy(xpath="//button[@id='yui_patched_v3_11_0_1_1435216739029_1190']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//button[@id='yui_patched_v3_11_0_1_1435216739029_1248']")
	private WebElement cancelbutton;

	@FindBy(id="yui_patched_v3_11_0_1_1435228121394_1078")
	private WebElement lastbutton;
	
	@FindBy(id="yui_patched_v3_11_0_1_1435228121394_1154")
	private WebElement nextbutton;
	
	@FindBy(id="yui_patched_v3_11_0_1_1435229077309_1206")
	private WebElement optionbutton;
	
	@FindBy(id="yui_patched_v3_11_0_1_1435229077309_1732")
	private WebElement configurebutton;

	
	public WebElement getUploadbutton() {
		return uploadbutton;
	}

	public WebElement getRolemanagmenttab() {
		return Rolemanagmenttab;
	}

	public WebElement getProcessManagementtab() {
		return ProcessManagementtab;
	}

	public WebElement getCreatRolebutton() {
		return CreatRolebutton;
	}

	public WebElement getSelectingorgcreatingRole() {
		return selectingorgcreatingRole;
	}

	public WebElement getEnterRoletextfield() {
		return EnterRoletextfield;
	}

	public WebElement getSubmitRolebutton() {
		return SubmitRolebutton;
	}

	public WebElement getCancelRolebutton() {
		return CancelRolebutton;
	}

	public WebElement getBrowsebutton() {
		return browsebutton;
	}

	public WebElement getSelectorgnisation() {
		return selectorgnisation;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public WebElement getLastbutton() {
		return lastbutton;
	}

	public WebElement getNextbutton() {
		return nextbutton;
	}

	public WebElement getOptionbutton() {
		return optionbutton;
	}

	public WebElement getConfigurebutton() {
		return configurebutton;
	}
	
	
}
