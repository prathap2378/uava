package com.econsys.SmallWorks;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.econsys.Projects.*; 
import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.TestData.*;

public class smallWork_flow {
	private static Logger log = Logger.getLogger(smallWork_flow.class.getName());
	//Page UI classes
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RtqFormUIodj nrtq=PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	projectMethods proMethods=PageFactory.initElements(Driver.driver(), projectMethods.class);
	submitQuote submit=PageFactory.initElements(Driver.driver(), submitQuote.class);
	TasksCP4toCP5 cp45=PageFactory.initElements(Driver.driver(), TasksCP4toCP5.class);
	TasksCP5toCP9 pdop=PageFactory.initElements(Driver.driver(), TasksCP5toCP9.class);
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	static Basic b=new Basic();
	static Login login=new Login();
	String draftproduced=null;
	String exe=null;
	String exeCP5=null;
	String ourformat=null;
	String bidsheetauthorised=null;
	String exeCP2=null;
	/*static TasksCP5toCP9 pdop=new TasksC
			
			P5toCP9();*/
/*	@BeforeClass
public void beforeClass() throws IOException{
	login.url(wb.getXLData(1, 3, 0));
	
}*/
    @Test
    public void testflow(){
    	try {
    		draftproduced=wb.getXLData(2,9, 0);
    		exe=wb.getXLData(24,7, 0);
    		exeCP5=wb.getXLData(8, 9, 0);
    		ourformat=wb.getXLData(2, 5, 0);
    		bidsheetauthorised=wb.getXLData(4, 5, 0);
    		String execp6=wb.getXLData(4, 11, 0);
    		String certificateobtained=wb.getXLData(6,11, 0);
    		String retationapplied=wb.getXLData(8,11, 0);
    		String onmSubmitted=wb.getXLData(10,11, 0);
    		String snagListIdentified=wb.getXLData(12,11, 0);
    		String internalCompletionDocument=wb.getXLData(14,11, 0);
    		String execp8=wb.getXLData(16,11, 0);
    		//CP9 variables
    		String finalAccountAgreement=wb.getXLData(18,11, 0);
    		String finalRetentionPaid=wb.getXLData(20,11, 0);
    		String projectDocumentArchived=wb.getXLData(22,11, 0);
    		String projectDebrief=wb.getXLData(18,11, 0);
    		String subContractAccountSettled=wb.getXLData(1,12, 0);
    		String closureofProject=wb.getXLData(3,12, 0);
    		String bondsGuarantees_Resolved=wb.getXLData(5,12, 0);
    		String execp9=wb.getXLData(7,12, 0);
    		String clarification=wb.getXLData(14,7,0);
    		String execp4=wb.getXLData(18,7, 0);
    		boolean flag=false;
    		exeCP2=wb.getXLData(6, 5, 0);
    		login.url();
		
			flag=proMethods.smallworkForm();
			if(flag){
				Reporter.log("Small Works flow changed to Project, end this test");
			}
			else{
			if((ourformat.equals("No"))||(bidsheetauthorised.equals("No"))){
    			rtq.board();
    		}
			login.loginSL();
			ab.getViewalltasks().click();
			cu.waitForPageToLoad();
			b.projectname();
			submit.testsubmitQuoteform();
			rtq.statusQuotesubmit();
			if((clarification.equals("No"))||(execp4.equals("Yes"))){
				rtq.boardcp4();
			}
			cp45.apointkeystaf();
    		cp45.commerSuit();
			proMethods.salesToOperation();
	       proMethods.operation_acceptance();
	        if(exe.equals("Yes")||(exeCP5.equals("Yes")||(draftproduced.equals("No")))){
				rtq.board();
			}
	       proMethods.pdp();
	      //**********CP6 exe dession **********
			if(execp6.equals("Yes")){
				rtq.boardcp6();
			}
			
			proMethods.deliveryreview();
			//**********OD approval **************
			pdop.obtainpracticalcomplition();
			//***********CP8 exe dession **********
			if(certificateobtained.equals("No")||retationapplied.equals("No")||onmSubmitted.equals("No")||snagListIdentified.equals("No")||internalCompletionDocument.equals("No")||execp8.equals("Yes")){
				rtq.boardcp6();
			}
			pdop.postpracticalcomplition();
			//***********CP9 exe dession **********
			if(finalAccountAgreement.equals("No")||finalRetentionPaid.equals("No")||projectDocumentArchived.equals("No")||projectDebrief.equals("No")||subContractAccountSettled.equals("No")||closureofProject.equals("No")||bondsGuarantees_Resolved.equals("No")||execp9.equals("Yes")){
				rtq.boardcp6();
			}
			}
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
	@AfterClass
	public void afterClass(){
		Driver.driver().quit();
	}
}
