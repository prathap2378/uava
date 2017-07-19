package com.econsys.testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.Projects.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;
import com.econsys.UIobjectrepositary.Preparequote;

public class CP1_CP9flowTest  extends Driver{
	static Workbook wb=new Workbook();
	Basic b = new Basic();
	CommonUtils cu = new CommonUtils();
	Login login = new Login();
	Monorail monorail = new Monorail();
	EconsysVariables ev = new EconsysVariables();
	Logger log = Logger.getLogger(CP1_CP9flowTest.class.getName());
	ActionButtonsUi ab = PageFactory.initElements(Driver.driver(), ActionButtonsUi.class);
	Preparequote prepareQuoteUI = PageFactory.initElements(Driver.driver(), Preparequote.class);
	//Green path1
	@Test(priority=2)
	public void greenPathflow() throws Exception {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		String e_Size = wb.getXLData(9, 3, 1);
		String location =  wb.getXLData(10, 3, 1);
		
		Monorail.monorailTestFlow(e_Size,location);
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
	
	//Red path(invocationCount = 1,threadPoolSize = 1)
	@Test(priority=1)
	//invocationCount = 10,threadPoolSize = 1
	public void redPathflow() throws Exception {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		String estimatedSize = wb.getXLData(3, 3, 1);
		String location =  wb.getXLData(4, 3, 1);
		
		//Monorail.monorailTestFlow(e_Size,location);
		//RTQ form submit
		cu.waitForPageToLoad();
		boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
		if(elementexist)
		login.user(); 
		
		//****intiation of rtq form*********
	    b.rtqForm(estimatedSize,location);
	    ab.getSubmitbutton().click();
	    
	    //Logout
	    login.logout();
		
		//***********CP1 exe dession************
		if((estimatedSize.equals("D 500+"))||(location.equals("Other"))) {
			b.boardApproval();
		}
		
		monorail.ASL();
		
		//Prepare Quote
		monorail.prepare_Quote();
		cu.selectByVisibleText(prepareQuoteUI.getExpliciteapprovalatgateway2(),ev.exeCP2);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		b.pathdession(estimatedSize,location);
		//**********CP2 exe dession**************
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
			b.boardApproval();
		}
		monorail.submitQuote();
		monorail.statusQuotesubmit(ev.customerCommitmentType,ev.quoteStatusAmendBid);
		
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
	//Amber path
	@Test
	public void amberPathflow() throws Exception {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		String estimatedSize = wb.getXLData(6, 3, 1);
		String location =  wb.getXLData(7, 3, 1);
		login.url();
		//Monorail.monorailTestFlow(e_Size,location);
		cu.waitForPageToLoad();
		boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
		if(elementexist)
		login.user(); 
		
		//****intiation of rtq form*********
	    b.rtqForm(estimatedSize,location);
	    ab.getSubmitbutton().click();
	    
	    //Logout
	    login.logout();
		
		//***********CP1 exe dession************
		if((estimatedSize.equals("D 500+"))||(location.equals("Other"))) {
			b.boardApproval();
		}
		/*String userName = wb.getXLData(1, 0,0);
		String sl=wb.getXLData(10, 0, 0);
		
		if(!sl.equals(userName)){*/
		monorail.ASL();
			
		
		//Prepare Quote
		monorail.prepare_Quote();
		cu.selectByVisibleText(prepareQuoteUI.getExpliciteapprovalatgateway2(),ev.exeCP2);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		b.pathdession(estimatedSize,location);
		//**********CP2 exe dession**************
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
			b.boardApproval();
		}
		monorail.submitQuote();
		monorail.statusQuotesubmit(ev.customerCommitmentType,ev.quoteStatusAmendBid);
		
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
}
