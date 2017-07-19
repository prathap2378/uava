package com.econsys.UIobjectrepositary;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalestoOperationHandover {
	//Specification No Radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement Specification;
	
	//DrawingsSchedules No Radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833403']")
	private WebElement DrawingsSchedules;
	
	//TQRFIs No Radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833404']")
	private WebElement TQRFIs;
	
	//InstallEnquiryrequesttoquoteinformation No radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833405']")
	private WebElement InstallEnquiryrequesttoquoteinformation;
	
	//InstallSubContractorQuotation No radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833406']")
	private WebElement InstallSubContractorQuotation;
	
	//PanelEnquiryrequesttoquoteinformation No Radio Button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement PanelEnquiryrequesttoquoteinformation;
	
	//PanelSubContractorQuotation No Radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement PanelSubContractorQuotation;
	
	//MCCSchedules No radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement MCCSchedules;
	
	//OtherSCPackageQuotations No radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement OtherSCPackageQuotations;
	
	//Other3rdPartyQuotations Radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement Other3rdPartyQuotations;
	
	//Equipmentshedules Radio Button No
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement EquipmentSchedules;
	
	//PointShedules No radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement PointsSchedules;
	
	//ValveSchedules No radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement ValveSchedules ;
	
	//Identifed Risks and Opportunities (INCL. VALUE ENGINEERING)No radio button
	@FindBy(xpath="//input[@id='img_cmt_1411848833402']")
	private WebElement IdentifedRisksandOpportunities;

	//Schedulemeetingwithoperations No radio button
	@FindBy(xpath="//select[@id='isMeetingRequiredBtwnPLSL']")
	private WebElement Schedulemeetingwithoperations;
	
	@FindBy(xpath="//select[@id='explicit_approval_sales']")
	private WebElement RequestforExplicitApprovalatCP5;
	
	//Specification Yes radio button
	@FindBy(xpath="//input[@id='salesToOpItemRadioYes_1411848833402']")
	private WebElement Specification1;
	
	@FindBy(xpath="//textarea[@id='st_Comments']")
	private WebElement Comments;

}
