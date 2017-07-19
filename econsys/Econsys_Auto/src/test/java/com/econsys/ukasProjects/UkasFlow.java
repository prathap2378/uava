package com.econsys.ukasProjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.Projects.*;
import com.econsys.UIobjectrepositary.*;

public class UkasFlow {
	ActionButtonsUi ab = PageFactory.initElements(Driver.driver(), ActionButtonsUi.class);
	PDPui pdp_ui=PageFactory.initElements(Driver.driver(),PDPui.class);
	ProjectMethodsUKAS pmUKAS = new ProjectMethodsUKAS();
	Monorail mo = new Monorail();
	EconsysVariables ev = new EconsysVariables();
	TasksCP4toCP5 cp4cp5 =  new TasksCP4toCP5();
	Login login = new Login();
	TasksCP5toCP9 cp5cp9 = new TasksCP5toCP9();
	CommonUtils cu = new CommonUtils();
  @Test
  public void ukasFlow1() throws IOException, InterruptedException {
	  login.url();
	  pmUKAS.rtqForm();
	  ab.getSubmitbutton().click();
	  //status of submitted quote
	  mo.statusQuotesubmit(ev.estimatedSize, ev.location);
	  	//cp4 board approval
			if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
				mo.boardcp4();
			}
	 
	  //Appoint Key staff
	  cp4cp5.apointkeystaf();
	  
	  //Commercial Suite Acceptance
	  cp4cp5.commerSuitUKAS();
	  
	  //Sales to Operation
	  cp4cp5.salestoOperation();
	  ab.getSubmitbutton().click();
	  login.logout();
	  
	  //Operation acceptance
	  cp4cp5.operationAcceptance();
	  Driver.driver().findElement(By.xpath("//input[@id='approve']")).click();
	  login.logout();
	  	//cp5 board approval
	    	if(ev.exe5_SalestoOper.equals("Yes")||(ev.exeCP5_OperationAccep.equals("Yes")||(ev.draftproduced.equals("No")))){
	    		mo.board();
	    	}
	    	
	  //Project Delivery Plan(PDP)
	  pmUKAS.pdpProjectsUKAS();
	  ab.getSubmitbutton().click();
	  login.logout();
	  	if(ev.execp6.equals("Yes")){
				mo.boardcp6();
		}
	  
	  //Delivery Review
	  pmUKAS.deliveryreview();
	  cp5cp9.obtainpracticalcomplition();
	  
	  cu.selectByVisibleText(pdp_ui.getOpc_cp8(), ev.execp8);
	  ab.getSubmitbutton().click();
	  login.logout();
	  	if(ev.certificateobtained.equals("No")||ev.retationapplied.equals("No")||ev.onmSubmitted.equals("No")||ev.snagListIdentified.equals("No")||ev.internalCompletionDocument.equals("No")||ev.execp8.equals("Yes")){
			mo.boardcp6();
		}
	  cp5cp9.postpracticalcomplition();
	  cu.selectByVisibleText(pdp_ui.getPpc_cp9(), ev.execp9);
	  ab.getSubmitbutton().click();
	  login.logout();
	  	if(ev.finalAccountAgreement.equals("No")||ev.finalRetentionPaid.equals("No")||ev.projectDocumentArchived.equals("No")||ev.projectDebrief.equals("No")||ev.subContractAccountSettled.equals("No")||ev.closureofProject.equals("No")||ev.bondsGuarantees_Resolved.equals("No")||ev.execp9.equals("Yes")){
			mo.boardcp6();
		}
  }
}
