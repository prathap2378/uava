package com.econsys.UIobjectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SDapprTandCOPacceptanceui {

	@FindBy(xpath="//input[@id='flm_att_0multifile_hidden_verbalCommitmentProof']")
	private WebElement ProofofVerbalCommitment;
	
	@FindBy(xpath="//select[@id='flm_att_0multifile_hidden_termsandConditions']")
	private WebElement tandctermsandcondition;
	
	@FindBy(xpath="//select[@id='flm_att_0multifile_hidden1_programme']")
	private WebElement tandcprogamme;
	
	@FindBy(xpath="//select[@id='flm_att_0multifile_hidden_programmereview']")
	private WebElement operationprogrammereview;

	public WebElement getProofofVerbalCommitment() {
		return ProofofVerbalCommitment;
	}

	public WebElement getTandctermsandcondition() {
		return tandctermsandcondition;
	}

	public WebElement getTandcprogamme() {
		return tandcprogamme;
	}

	public WebElement getOperationprogrammereview() {
		return operationprogrammereview;
	}
	
}
