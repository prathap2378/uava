package com.econsys.SmallWorks;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POC.Econsys_Auto.superTestNG;

import com.econsys.Projects.*; 
import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Genriclibrery.EconsysVariables;
import com.econsys.TestData.*;

public class smallWork_flow extends Driver{
	private static Logger log = Logger.getLogger(smallWork_flow.class.getName());
	//Page UI classes
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils commonutils=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	ProjectMethods_Small_Works proMethods=PageFactory.initElements(Driver.driver(), ProjectMethods_Small_Works.class);
	//SubmitQuote submit=PageFactory.initElements(Driver.driver(), SubmitQuote.class);
	TasksCP4toCP5 cp45=PageFactory.initElements(Driver.driver(), TasksCP4toCP5.class);
	TasksCP5toCP9 pdop=PageFactory.initElements(Driver.driver(), TasksCP5toCP9.class);
	smallWorkPageElements sWp= PageFactory.initElements(Driver.driver(),smallWorkPageElements.class);
	PDPui pdp_Ui=PageFactory.initElements(Driver.driver(),PDPui.class);
	//Classes
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	static Basic b=new Basic();
	static Login login=new Login();
	EconsysVariables ev = new EconsysVariables();

/*@BeforeClass
public void beforeClass() throws IOException{
	login.url();
}*/
@Test
public void smallWorks_flow()throws Exception{
    	
    	boolean flag=false;
    	login.url();
		
		flag=proMethods.smallworkForm();
		log.info("Flag : "+flag);
		if(flag){
			Reporter.log("Small Works flow changed to Project, end this test");
		}
		else{
			//cp2 board approval
			if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))){
				rtq.board();
		}
		login.loginSL();
		b.projectname();
		proMethods.submit_Quoteform();
		proMethods.statusofSubmitQuote();
			//cp4 board approval
			if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
				rtq.boardcp4();
			}
		cp45.apointkeystaf();
    	cp45.commerSuit();
			
    	//Sales to operation hand-over
    	proMethods.salesToOperation();
    	
		commonutils.selectByVisibleText(sWp.getExe_cp5_sw(),ev.exe5_SalestoOper);
	    sWp.getSubmitBtn().click();
	    login.logout();
			
	    proMethods.operation_acceptance();
	    commonutils.selectByVisibleText(sWp.getExe_cp5_sw_OperatonAcceptance(),ev.exeCP5_OperationAccep);
	    driver.findElement(By.xpath("//input[@id='approve']")).click();
		login.logout();
	        //cp5 board approval
	    	if(ev.exe5_SalestoOper.equals("Yes")||(ev.exeCP5_OperationAccep.equals("Yes")||(ev.draftproduced.equals("No")))){
	    		rtq.board();
	    	}
	    proMethods.pdp();
	    //Explicit approval selections and Actions
	    commonutils.selectByVisibleText(pdp_Ui.getExecp6(),ev.execp6);
	    sWp.getSubmitBtn().click();
	    
	    login.logout();
	    //**********CP6 exe dession **********
			if(ev.execp6.equals("Yes")){
				rtq.boardcp6();
			}
			
		proMethods.deliveryreview();
		//**********OD approval **************
		pdop.obtainpracticalcomplition();
		commonutils.selectByVisibleText(pdp_Ui.getOpc_cp8(), ev.execp8);
		ab.getSubmitbutton().click();
		login.logout();
			//***********CP8 exe dession **********
			if(ev.certificateobtained.equals("No")||ev.retationapplied.equals("No")||ev.onmSubmitted.equals("No")||ev.snagListIdentified.equals("No")||ev.internalCompletionDocument.equals("No")||ev.execp8.equals("Yes")){
				rtq.boardcp6();
			}
		pdop.postpracticalcomplition();
		commonutils.selectByVisibleText(pdp_Ui.getPpc_cp9(), ev.execp9);
		  ab.getSubmitbutton().click();
		  login.logout();
			//***********CP9 exe dession **********
			if(ev.finalAccountAgreement.equals("No")||ev.finalRetentionPaid.equals("No")||ev.projectDocumentArchived.equals("No")||ev.projectDebrief.equals("No")||ev.subContractAccountSettled.equals("No")||ev.closureofProject.equals("No")||ev.bondsGuarantees_Resolved.equals("No")||ev.execp9.equals("Yes")){
				rtq.boardcp6();
			}
		}
    }
	/*@AfterClass
	public void afterClass(){
		Driver.driver().quit();
	}*/
}
