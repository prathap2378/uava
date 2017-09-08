package com.econsys.econ4eg;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.econsys.Projects.*; 
import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Genriclibrery.EconsysVariables;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.TestData.*;

public class SmallWork_flow extends Driver{
	private static Logger log = Logger.getLogger(SmallWork_flow.class.getName());
	//Page UI classes
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils commonutils=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RTQForm_Ui nrtq=PageFactory.initElements(Driver.driver(), RTQForm_Ui.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	ProjectMethods_Small_Works proMethodsSW = PageFactory.initElements(Driver.driver(), ProjectMethods_Small_Works.class);
	TandCverification TandCver = PageFactory.initElements(driver(), TandCverification.class);
	//SubmitQuote submit=PageFactory.initElements(Driver.driver(), SubmitQuote.class);
	TasksCP4toCP5 cp4_cp5=PageFactory.initElements(Driver.driver(), TasksCP4toCP5.class);
	TasksCP5toCP9 cp5_cp9=PageFactory.initElements(Driver.driver(), TasksCP5toCP9.class);
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
	
	//login.url_Matrixe();
	login.url();
	boolean flag=false;
	flag=proMethodsSW.smallworkForm();
	log.info("Flag : "+flag);
	
	if(flag){
		Reporter.log("Small Works flow changed to Project, end this test");
	}else{
		//cp2 board approval
		if((ev.ourformat.equals("No"))){
			Econsys4egProjects.clApproval();
		}
		if(ev.exeCP2.equalsIgnoreCase("Yes") || ev.bidsheetauthorised.equals("No")){
			b.boardApproval();
		}
		//Assign Sales Leader
		String userName = wb.getXLData(1, 0,0);
		String sl=wb.getXLData(10, 0, 0);
		
		if(!sl.equals(userName)){
			rtq.ASL();
		}
		//Submit quote
		proMethodsSW.submit_Quoteform();
		//Status of submitted quote
		//customer commitment flow same as PAG
		proMethodsSW.statusQuotesubmit_(ev.customerCommitmentType, ev.quote_StatusCp2Cp3);
		//cp4 board approval
		if(ev.execp4.equals("Yes") || (ev.clarification.equals("No")&&
				(ev.customerCommitmentType.equalsIgnoreCase(ev.customerCommitmentType_SubCon)||
						ev.customerCommitmentType.equalsIgnoreCase(ev.customerCommitmentType_PO)))){
			b.boardApproval();
		}
		
		//New customer commitment flow Matrix and PAG are same
		cp4_cp5.submitResponse();
		//CP4-CP5
		cp4_cp5.apointkeystaf();
		
		//cp45.commerSuit();
		
    	//Sales to operation hand-over
		proMethodsSW.salesToOperation();
    	//select explicit approval and submit
		commonutils.selectByVisibleText(sWp.getExe_cp5_sw(),ev.exe5_SalestoOper);
	    sWp.getSubmitBtn().click();
	    login.logout();
	    
	    //operation acceptance
	    proMethodsSW.operation_acceptance();
	    //explicit approval check
	    commonutils.selectByVisibleText(sWp.getExe_cp5_sw_OperatonAcceptance(),ev.exeCP5_OperationAccep);
	    driver.findElement(By.xpath("//input[@id='approve']")).click();
		login.logout();
		//cp5 board approval
		if(ev.exe5_SalestoOper.equals("Yes")||(ev.exeCP5_OperationAccep.equals("Yes"))){
			b.boardApproval();
		}
 
		//CP5-CP6 PDP used from generic class cp5_cp9
		cp5_cp9.pdp_Matrix();
	    //Explicit approval selections and Actions
	    commonutils.selectByVisibleText(pdp_Ui.getExecp6(),ev.execp6);
	    sWp.getSubmitBtn().click();
	    login.logout();
	    //**********CP6 exe dession **********
	    if(ev.execp6.equals("Yes")){
	    	b.boardApproval();
	    }
	    //CP6-CP7
	    proMethodsSW.deliveryreview();
		//**********OD approval **************
		//CP7-CP8
	    cp5_cp9.obtainpracticalcomplition();
		commonutils.selectByVisibleText(pdp_Ui.getOpc_cp8(), ev.execp8);
		ab.getSubmitbutton().click();
		login.logout();
		//***********CP8 exe dession **********
		if(ev.certificateobtained.equals("No")||ev.retationapplied.equals("No")||ev.onmSubmitted.equals("No")||ev.snagListIdentified.equals("No")||ev.internalCompletionDocument.equals("No")||ev.execp8.equals("Yes")){
			b.boardApproval();
		}

		//CP8-CP9
		cp5_cp9.postpracticalcomplition();
		commonutils.selectByVisibleText(pdp_Ui.getPpc_cp9(), ev.execp9);
		ab.getSubmitbutton().click();
		login.logout();
		//***********CP9 exe dession **********
		if(ev.finalAccountAgreement.equals("No")||ev.finalRetentionPaid.equals("No")||ev.projectDocumentArchived.equals("No")||ev.projectDebrief.equals("No")||ev.subContractAccountSettled.equals("No")||ev.closureofProject.equals("No")||ev.bondsGuarantees_Resolved.equals("No")||ev.execp9.equals("Yes")){
			b.boardApproval();
		}
		}
    }
}