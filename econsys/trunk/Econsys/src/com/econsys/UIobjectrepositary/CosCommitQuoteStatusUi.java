package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CosCommitQuoteStatusUi {
	
	@FindBy(xpath="//select[@id='st_customerCommitment']")
	private WebElement CustomerCommitmentReceivedAs;
	
	@FindBy(xpath="//input[@id='fileList_flm_quoteSubmitStatus']")
	private WebElement uploadDoc_StatusofSubmitQuote;
	
	@FindBy(xpath="//select[@id='st_startCommitmentReflect']")
	private WebElement final_quoted_scope;

	@FindBy(xpath="//select[@id='st_startDocReferSameQuote']")
	private WebElement docs_referenced;
	
	@FindBy(xpath="//select[@id='st_startTandCReflectQuote']")
	private WebElement terms_and_conditions;
	
	@FindBy(xpath="//select[@id='str_CC_ProjectStartDate_Accepted']")
	private WebElement project_Start_Date;
	
	@FindBy(xpath="//select[@id='st_start_endDatesAccepted']")
	private WebElement project_End_Date;
	
	@FindBy(xpath="//select[@id='st_startOverallXProjectSellAccepted']")
	private WebElement contract_Value;
	
	@FindBy(xpath="//textarea[@id='st_startclarificationsTextArea']")
	private WebElement reseon_for_No;
	
	@FindBy(xpath="//select[@id='st_clarificationsSelectBox']")
	private WebElement clarifications_assumptions;
	
	
	@FindBy(xpath="//select[@id='st_workAccepted']")
	private WebElement scopeofwork;
	
	@FindBy(xpath="//select[@id='st_scopedocument']")
	private WebElement documentsreferenced;
	
	@FindBy(xpath="//select[@id='st_termsdocument']")
	private WebElement TermsandConditions;
	
	@FindBy(xpath="//select[@id='str_CC_ProjectStartDate_Accepted']")
	private WebElement ProjectStartDateAccepted;
	
	@FindBy(xpath="//select[@id='str_CC_ProjectEndDate_Accepted']")
	private WebElement ProjectEndDateAccepted;
	
	@FindBy(xpath="//select[@id='st_clarificationsSelectBox']")
	private WebElement clarificationsSelectBox;
	
	@FindBy(xpath="//textarea[@id='st_clarificationsTextArea']")
	private WebElement clarificationsTextArea;
	
	@FindBy(xpath="//select[@id='st_documentStatify']")
	private WebElement documentStatify;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit;
		
	@FindBy(css="input[value='Save']")
	private WebElement Save;
	
	@FindBy(id="cancel")
	private WebElement Cancel;
	
	@FindBy(xpath="//textarea[@id='st_Comments']")
	private WebElement comments;

	@FindBy(xpath="//select[@id='explicit_approval_g4']")
	private WebElement exeCP4;
	
	@FindBy(xpath="//select[@id='st_quoteStatus']")
	private WebElement quoteStatus;
	
	@FindBy(xpath="//select[@id='st_customer_commitment_type']")
	private WebElement customerCommitmentType;
		
	public WebElement getCustomerCommitmentType() {
		return customerCommitmentType;
	}

	@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_caRecievedAsFile']")
	private WebElement caRecievedAsFile;
	
	@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_workAccepted']")
	private WebElement workAcceptedFile;
	
	@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_scopedocument']")
	private WebElement scopedocumentFile;
	
	@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_termsdocument']")
	private WebElement termsdocumentFile;
		
	@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_projectStartDate-accepted']")
	private WebElement startdateFile;
	
	@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_projectEndDate-Accepted']")
	private WebElement enddateFile;
			
	public WebElement getStartdateFile() {
		return startdateFile;
	}

	public WebElement getEnddateFile() {
		return enddateFile;
	}

	public WebElement getCaRecievedAsFile() {
		return caRecievedAsFile;
	}

	public WebElement getWorkAcceptedFile() {
		return workAcceptedFile;
	}

	public WebElement getScopedocumentFile() {
		return scopedocumentFile;
	}

	public WebElement getTermsdocumentFile() {
		return termsdocumentFile;
	}

	public WebElement getQuoteStatus() {
		return quoteStatus;
	}

	public WebElement getExeCP4() {
		return exeCP4;
	}

	public WebElement getCustomerCommitmentReceivedAs() {
		return CustomerCommitmentReceivedAs;
	}

	public WebElement getScopeofwork() {
		return scopeofwork;
	}

	public WebElement getDocumentsreferenced() {
		return documentsreferenced;
	}

	public WebElement getTermsandConditions() {
		return TermsandConditions;
	}

	public WebElement getProjectStartDateAccepted() {
		return ProjectStartDateAccepted;
	}

	public WebElement getProjectEndDateAccepted() {
		return ProjectEndDateAccepted;
	}

	public WebElement getClarificationsSelectBox() {
		return clarificationsSelectBox;
	}

	public WebElement getClarificationsTextArea() {
		return clarificationsTextArea;
	}

	public WebElement getDocumentStatify() {
		return documentStatify;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSave() {
		return Save;
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public WebElement getComments() {
		return comments;
	}
	public WebElement getFinal_quoted_scope() {
		return final_quoted_scope;
	}

	public WebElement getDocs_referenced() {
		return docs_referenced;
	}

	public WebElement getTerms_and_conditions() {
		return terms_and_conditions;
	}

	public WebElement getProject_Start_Date() {
		return project_Start_Date;
	}

	public WebElement getProject_End_Date() {
		return project_End_Date;
	}

	public WebElement getContract_Value() {
		return contract_Value;
	}

	public WebElement getReseon_for_No() {
		return reseon_for_No;
	}

	public WebElement getClarifications_assumptions() {
		return clarifications_assumptions;
	}
	
	public WebElement getUploadDoc_StatusofSubmitQuote(){
		return uploadDoc_StatusofSubmitQuote;
	}
}
