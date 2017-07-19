package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommercialReviewInvolve {
	
	//******review********
	@FindBy(xpath="//select[@id='st_termsAndCondition']")
	private WebElement rTermsandConditions;
	
	@FindBy(xpath="//select[@id='st_performanceBond']")
	private WebElement rPerformanceBond;
	
	@FindBy(xpath="//select[@id='st_parentCompany']")
	private WebElement rParentCompanyGuarantee;
	
	
	//****involve********
	@FindBy(xpath="//select[@id='st_termsG1G2CheckBox']")
	private WebElement iTermsandConditions;
	
	
	@FindBy(xpath="//select[@id='st_termsCheckBox']")
	private WebElement iTermsandConditionscp2cp3;

	@FindBy(xpath="//select[@id='st_performanceBondCheckBox']")
	private WebElement iPerformanceBondcp2cp3;
	
	public WebElement getiPerformanceBondcp2cp3() {
		return iPerformanceBondcp2cp3;
	}

	public WebElement getiTermsandConditionscp2cp3() {
		return iTermsandConditionscp2cp3;
	}

	@FindBy(xpath="//select[@id='st_performanceG1G2BondCheckBox']")
	private WebElement iPerformanceBond;
		
	@FindBy(xpath="//select[@id='st_parentCompanyG1G2CheckBox']")
	private WebElement iParentCompanyGuarantee;
	
	@FindBy(xpath="//select[@id='st_parentCompanyCheckBox']")
	private WebElement iParentCompanyGuaranteecp2cp3;

	public WebElement getiParentCompanyGuaranteecp2cp3() {
		return iParentCompanyGuaranteecp2cp3;
	}

	public WebElement getrTermsandConditions() {
		return rTermsandConditions;
	}

	public WebElement getrPerformanceBond() {
		return rPerformanceBond;
	}

	public WebElement getrParentCompanyGuarantee() {
		return rParentCompanyGuarantee;
	}

	public WebElement getiTermsandConditions() {
		return iTermsandConditions;
	}

	public WebElement getiPerformanceBond() {
		return iPerformanceBond;
	}

	public WebElement getiParentCompanyGuarantee() {
		return iParentCompanyGuarantee;
	}
	
}
