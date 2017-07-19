package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PDPui {
@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_planDocument']")
private WebElement plandoc;

@FindBy(xpath="//tr/td[6]/a[@id='delete_1']")
private WebElement delete1;

@FindBy(xpath="//tr/td[6]/a[@id='delete_2']")
private WebElement delete2;

@FindBy(xpath="//tr/td[6]/a[@id='delete_3']")
private WebElement delete3;

@FindBy(xpath="//td[@id='prodOfAppValueForecastGridPager_left']/table/tbody/tr/td/div")
private WebElement Addnewvalueforcast;

@FindBy(xpath="//input[@id='mileStone']")
private WebElement milestone;

@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[5]/a")
private WebElement date;

@FindBy(xpath="//input[@id='contractWorks']")
private WebElement amount;

@FindBy(xpath="//a[@id='sData']")
private WebElement savemilestone;

@FindBy(xpath="//div[@id='gbox_subContractorProcPlanGrid']//a[@id='projectplanedit_1']")
private WebElement edit1;

@FindBy(xpath="//div[@id='gbox_subContractorProcPlanGrid']//a[@id='projectplanedit_2']")
private WebElement edit2;

@FindBy(xpath="//div[@id='gbox_subContractorProcPlanGrid']//a[@id='delete_1']")
private WebElement delete1subContractorProcPlanGrid;

@FindBy(xpath="//div[@id='gbox_subContractorProcPlanGrid']//a[@id='delete_2']")
private WebElement delete2subContractorProcPlanGrid;

@FindBy(xpath="//input[@id='fileList_flm_panelProductionScheduleDocument']")
private WebElement productionscheduledoc ;

@FindBy(xpath="//select[@id='explicit_approval_g6']")
private WebElement execp6;
//input[@value="Submit"]

//Obtain practical complition***********
@FindBy(xpath="//select[@id='st_pcCertificateObtainedCheckBox']")
private WebElement opc_certificateobtained;

@FindBy(xpath="//select[@id='st_retentionApplied']")
private WebElement opc_retationapplied;

@FindBy(xpath="//select[@id='st_onmSubmitted']")
private WebElement opc_onmSubmitted;

@FindBy(xpath="//select[@id='st_snagListIdentified']")
private WebElement opc_snagListIdentified;

@FindBy(xpath="//select[@id='st_internalCompletionDocument']")
private WebElement opc_internalCompletionDocument;

@FindBy(xpath="//input[@id='fileList_flm_pcCertificate']")
private WebElement opcdoc_certificateobtained;

@FindBy(xpath="//input[@id='fileList_flm_retentionApplied']")
private WebElement opcdoc_retentinApplied;

@FindBy(xpath="//input[@id='fileList_flm_onmSubmitted']")
private WebElement opcdoc_onmSubmitted;

@FindBy(xpath="//input[@id='fileList_flm_snagListIdentified']")
private WebElement opcdoc_snagListIdentified;

@FindBy(xpath="//input[@id='fileList_flm_internalCompletionDocument']")
private WebElement opcdoc_internalCompletionDocument;

@FindBy(xpath="//select[@id='explicit_approval_g8']")
private WebElement opc_cp8;


//post practical completion**************
@FindBy(xpath="//select[@id='st_finalAccountAgreement']")
private WebElement ppc_finalAccountAgreement;

@FindBy(xpath="//select[@id='st_finalRetentionPaid']")
private WebElement ppc_finalRetentionPaid;

@FindBy(xpath="//select[@id='st_projectDocumentArchived']")
private WebElement ppc_projectDocumentArchived;

@FindBy(xpath="//select[@id='st_projectDebrief']")
private WebElement ppc_projectDebrief;

@FindBy(xpath="//select[@id='st_subContractAccountSettled']")
private WebElement ppc_subContractAccountSettled;

@FindBy(xpath="//select[@id='st_closureofProject']")
private WebElement ppc_closureofProject;

@FindBy(xpath="//select[@id='st_bondsGuaranteesResolved']")
private WebElement ppc_bondsGuaranteesResolved;

@FindBy(xpath="//input[@id='fileList_flm_finalAccountAgreement']")
private WebElement ppcdoc_finalAccountAgreement;

@FindBy(xpath="//input[@id='fileList_flm_fl_finalRetentionPaid']")
private WebElement ppcdoc_finalRetentionPaid;

@FindBy(xpath="//input[@id='fileList_flm_fl_projectDocumentArchived']")
private WebElement ppcdoc_projectDocumentArchived;

@FindBy(xpath="//input[@id='fileList_flm_fl_subContractAccountSettled']")
private WebElement ppcdoc_subContractAccountSettled;

@FindBy(xpath="//input[@id='fileList_flm_iclosureofProject']")
private WebElement ppcdoc_closureofProject;

@FindBy(xpath="//input[@id='fileList_flm_fl_bondsGuaranteesResolved']")
private WebElement ppcdoc_bondsGuaranteesResolved;

@FindBy(xpath="//select[@id='explicit_approval_g9']")
private WebElement ppc_cp9;

@FindBy(xpath="//input[@id='fileList_flm_progDocument']")
private WebElement project_Programme_document;

public WebElement getOpcdoc_certificateobtained() {
	return opcdoc_certificateobtained;
}

public WebElement getOpcdoc_retentinApplied() {
	return opcdoc_retentinApplied;
}
public WebElement getOpcdoc_onmSubmitted() {
	return opcdoc_onmSubmitted;
}
public WebElement getOpcdoc_snagListIdentified() {
	return opcdoc_snagListIdentified;
}
public WebElement getAddnewvalueforcast() {
	return Addnewvalueforcast;
}
public WebElement getOpcdoc_internalCompletionDocument() {
	return opcdoc_internalCompletionDocument;
}

public WebElement getPpcdoc_finalAccountAgreement() {
	return ppcdoc_finalAccountAgreement;
}

public WebElement getPpcdoc_finalRetentionPaid() {
	return ppcdoc_finalRetentionPaid;
}

public WebElement getPpcdoc_projectDocumentArchived() {
	return ppcdoc_projectDocumentArchived;
}

public WebElement getPpcdoc_subContractAccountSettled() {
	return ppcdoc_subContractAccountSettled;
}

public WebElement getPpcdoc_closureofProject() {
	return ppcdoc_closureofProject;
}

public WebElement getPpcdoc_bondsGuaranteesResolved() {
	return ppcdoc_bondsGuaranteesResolved;
}

public WebElement getOpc_certificateobtained() {
	return opc_certificateobtained;
}

public WebElement getOpc_retationapplied() {
	return opc_retationapplied;
}

public WebElement getOpc_onmSubmitted() {
	return opc_onmSubmitted;
}

public WebElement getOpc_snagListIdentified() {
	return opc_snagListIdentified;
}

public WebElement getOpc_internalCompletionDocument() {
	return opc_internalCompletionDocument;
}

public WebElement getOpc_cp8() {
	return opc_cp8;
}

public WebElement getPpc_finalAccountAgreement() {
	return ppc_finalAccountAgreement;
}

public WebElement getPpc_finalRetentionPaid() {
	return ppc_finalRetentionPaid;
}

public WebElement getPpc_projectDocumentArchived() {
	return ppc_projectDocumentArchived;
}

public WebElement getPpc_projectDebrief() {
	return ppc_projectDebrief;
}

public WebElement getPpc_subContractAccountSettled() {
	return ppc_subContractAccountSettled;
}

public WebElement getPpc_closureofProject() {
	return ppc_closureofProject;
}

public WebElement getPpc_bondsGuaranteesResolved() {
	return ppc_bondsGuaranteesResolved;
}

public WebElement getPpc_cp9() {
	return ppc_cp9;
}


public WebElement getPlandoc() {
	return plandoc;
}

public WebElement getDelete1() {
	return delete1;
}

public WebElement getDelete2() {
	return delete2;
}

public WebElement getDelete3() {
	return delete3;
}

public WebElement getMilestone() {
	return milestone;
}

public WebElement getDate() {
	return date;
}

public WebElement getAmount() {
	return amount;
}

public WebElement getSavemilestone() {
	return savemilestone;
}

public WebElement getEdit1() {
	return edit1;
}

public WebElement getEdit2() {
	return edit2;
}

public WebElement getDelete1subContractorProcPlanGrid() {
	return delete1subContractorProcPlanGrid;
}

public WebElement getDelete2subContractorProcPlanGrid() {
	return delete2subContractorProcPlanGrid;
}

public WebElement getProductionscheduledoc() {
	return productionscheduledoc;
}

public WebElement getExecp6() {
	return execp6;
}

public WebElement getProject_Programme_document(){
	return project_Programme_document;
}

}
