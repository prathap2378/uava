package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PAGPageObjects {

	//Lead form id="st_Engineer"
	@FindBy(xpath="//input[@id='st_Engineer']") 
	private	WebElement engg;
	@FindBy(xpath="//*[@id='st_ProjectName']") 
	private	WebElement projectName;
	@FindBy(xpath="//*[@id='st_SiteAddress']") 
	private	WebElement siteAddress;
	@FindBy(xpath="//*[@id='st_Regulator']") 
	private	WebElement regulator;
	@FindBy(xpath="//*[@id='st_TypeofProject']") 
	private	WebElement typeofProject;
	@FindBy(xpath="//*[@id='st_AreaSelect']") 
	private	WebElement selectArea;
	@FindBy(xpath="//*[@id='st_Enquiry']") 
	private	WebElement stEnquery;
	@FindBy(xpath="//*[@id='dt_EnquiryReceivedDate']") 
	private	WebElement enquiryDate;
	@FindBy(xpath="//*[@id='st_RequestedParties']") 
	private	WebElement requestiedParties;
	@FindBy(xpath="//*[@id='st_retentionAdvised']") 
	private	WebElement retentionAdvised;
	@FindBy(xpath="//*[@id='st_RetentionValue']") 
	private	WebElement retentionvalue;
	@FindBy(xpath="//*[@id='st_DiscountRequested']") 
	private	WebElement discountRequested;
	@FindBy(xpath="//*[@id='st_DiscountRequestedValue']") 
	private	WebElement discountValue;
	
	//PAG solution(Qualify Lead)
	@FindBy(xpath="//*[@id='st_PAG_Solution']") 
	private	WebElement stPAG_Solution;
	@FindBy(xpath="//*[@id='st_reasonToProgress']") 
	private	WebElement stCAT;
	@FindBy(xpath="//*[@id='st_soilInvestigationReceived']") 
	private	WebElement soil_IR;
	@FindBy(xpath="//*[@id='st_designResponsibility']") 
	private	WebElement designResp;
	@FindBy(xpath="//*[@id='st_designCalculation']") 
	private	WebElement designCalculation;
	@FindBy(xpath="//*[@id='st_materialProposal']") 
	private	WebElement materialProposal;
	@FindBy(xpath="//*[@id='st_fwd_to_estimating']") 
	private	WebElement fwdtoEstimating;
	@FindBy(xpath="//*[@id='st_drawingReceivd']") 
	private	WebElement deawingRecieved;
	@FindBy(xpath="//*[@id='st_quotingAs']") 
	private	WebElement stQuotingAs;
	
	public WebElement getStPAG_Solution() {
		return stPAG_Solution;
	}
	public WebElement getStCAT() {
		return stCAT;
	}
	public WebElement getSoil_IR() {
		return soil_IR;
	}
	public WebElement getDesignResp() {
		return designResp;
	}
	public WebElement getDesignCalculation() {
		return designCalculation;
	}
	public WebElement getMaterialProposal() {
		return materialProposal;
	}
	public WebElement getFwdtoEstimating() {
		return fwdtoEstimating;
	}
	public WebElement getDeawingRecieved() {
		return deawingRecieved;
	}
	public WebElement getStQuotingAs() {
		return stQuotingAs;
	}
	/**
	 * @return the engg
	 */
	public WebElement getEngg() {
		return engg;
	}
	/**
	 * @return the projectName
	 */
	public WebElement getProjectName() {
		return projectName;
	}
	/**
	 * @return the siteAddress
	 */
	public WebElement getSiteAddress() {
		return siteAddress;
	}
	/**
	 * @return the regulator
	 */
	public WebElement getRegulator() {
		return regulator;
	}
	/**
	 * @return the typeofProject
	 */
	public WebElement getTypeofProject() {
		return typeofProject;
	}
	/**
	 * @return the selectArea
	 */
	public WebElement getSelectArea() {
		return selectArea;
	}
	/**
	 * @return the stEnquery
	 */
	public WebElement getStEnquery() {
		return stEnquery;
	}
	/**
	 * @return the enquiryDate
	 */
	public WebElement getEnquiryDate() {
		return enquiryDate;
	}
	/**
	 * @return the requestiedParties
	 */
	public WebElement getRequestiedParties() {
		return requestiedParties;
	}
	/**
	 * @return the retentionAdvised
	 */
	public WebElement getRetentionAdvised() {
		return retentionAdvised;
	}
	/**
	 * @return the retentionvalue
	 */
	public WebElement getRetentionvalue() {
		return retentionvalue;
	}
	/**
	 * @return the discountRequested
	 */
	public WebElement getDiscountRequested() {
		return discountRequested;
	}
	/**
	 * @return the discountValue
	 */
	public WebElement getDiscountValue() {
		return discountValue;
	}
}
