package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppointkeystaffandCommerSuitUi {

	@FindBy(xpath="//select[@id='st_engineeringLead']")
	private WebElement leadEL;

	@FindBy(xpath="//select[@id='st_commercialLead']")
	private WebElement leadCL;
	
	@FindBy(xpath="//select[@id='st_projectLead']")
	private WebElement leadPL;
	
	@FindBy(xpath="//select[@id='draftCommercialSuitProduced']")
	private WebElement draftCommercialSuitProduced;
	
	@FindBy(xpath="//input[@id='fileList_flm_draftCommercialSuitProduced']")
	private WebElement cummercialSuit_doc;
	
	public WebElement getCummercialSuit_doc() {
		return cummercialSuit_doc;
	}

	@FindBy(xpath="//select[@id='scheduleMeetingWithSales']")
	private WebElement meetingwithsales;
	
	@FindBy(xpath="//select[@id='explicit_approval_operation']")
	private WebElement exeOperationAcceptanceCP5;
	
	@FindBy(xpath="//input[@id='jobId']")
	private WebElement jobid;
	
	public WebElement getJobid() {
		return jobid;
	}

	public WebElement getExeOperationAcceptanceCP5() {
		return exeOperationAcceptanceCP5;
	}

	public WebElement getMeetingwithsales() {
		return meetingwithsales;
	}

	public WebElement getDraftCommercialSuitProduced() {
		return draftCommercialSuitProduced;
	}

	public WebElement getLeadEL() {
		return leadEL;
	}

	public WebElement getLeadCL() {
		return leadCL;
	}

	public WebElement getLeadPL() {
		return leadPL;
	}
}
