package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Operationacceptancehandover {

	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833402']")
	private WebElement Specification;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833403']")
	private WebElement DrawingsSchedules;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833404']")
	private WebElement TQsRFIs;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833405']")
	private WebElement InstallEnquiryrequestquotinformation;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833406']")
	private WebElement informationSubContractorQuotation;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833407']")
	private WebElement PanelSubContractorQuotation;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833408']")
	private WebElement MCCSchedules;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833409']")
	private WebElement OtherSCPackageQuotations;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833410']")
	private WebElement Other3rdPartyQuotations;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833411']")
	private WebElement EquipmentSchedules;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833412']")
	private WebElement PointsSchedules;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833413']")
	private WebElement ValveSchedules;
	
	@FindBy(xpath="//select[@id='acceptanceStatus_1411848833414']")
	private WebElement IdentifedRisksandOpportunitiesINCLVALUEENGINEERING;

	public WebElement getSpecification() {
		return Specification;
	}

	public WebElement getDrawingsSchedules() {
		return DrawingsSchedules;
	}

	public WebElement getTQsRFIs() {
		return TQsRFIs;
	}

	public WebElement getInstallEnquiryrequestquotinformation() {
		return InstallEnquiryrequestquotinformation;
	}

	public WebElement getInformationSubContractorQuotation() {
		return informationSubContractorQuotation;
	}

	public WebElement getPanelSubContractorQuotation() {
		return PanelSubContractorQuotation;
	}

	public WebElement getMCCSchedules() {
		return MCCSchedules;
	}

	public WebElement getOtherSCPackageQuotations() {
		return OtherSCPackageQuotations;
	}

	public WebElement getOther3rdPartyQuotations() {
		return Other3rdPartyQuotations;
	}

	public WebElement getEquipmentSchedules() {
		return EquipmentSchedules;
	}

	public WebElement getPointsSchedules() {
		return PointsSchedules;
	}

	public WebElement getValveSchedules() {
		return ValveSchedules;
	}

	public WebElement getIdentifedRisksandOpportunitiesINCLVALUEENGINEERING() {
		return IdentifedRisksandOpportunitiesINCLVALUEENGINEERING;
	}
}
