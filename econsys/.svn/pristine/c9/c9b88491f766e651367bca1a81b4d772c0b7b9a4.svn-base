package com.econsys.Projects;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POC.Econsys_Auto.ActionButtons;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.*;
import com.econsys.UIobjectrepositary.*;

public class CustomerCommitmentAcceptance_Projects extends Driver{
	private static Logger log = Logger.getLogger(Monorail.class.getName());
	//Page UI classes
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	static CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	static RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	public static Preparequote prepare_Quoteui=PageFactory.initElements(Driver.driver(), Preparequote.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	
	//import classes
	//Driver driver=new Driver();
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	static Basic b=new Basic();
	static Login login=new Login();
	static TasksCP5toCP9 pdop=new TasksCP5toCP9();
	static ActionButtons actionBtns= new ActionButtons();
	EconsysVariables ev = new EconsysVariables();
	
	String userName = wb.getXLData(1, 0,0);
	String sl=wb.getXLData(10, 0, 0);
	
	static int num;
	String filepath=System.getProperty("user.dir");
	
	CustomerCommitmentAcceptance_Projects() throws IOException{
		
	}
	
@Test
public void verifyLOICCA() throws InterruptedException, IOException, AWTException{

	login.url();
	log.info("verifyLOICCA");
	String customerCommitmentType = wb.getXLData(15, 3, 1);
	Thread.sleep(1000);
	
	login.user(); 
	
	//**** rtq form*********
    b.rtqForm(ev.estimatedSize,ev.location);
    
    //rtq submit externally
    actionBtns.clickSubmit();
    cu.waitForPageToLoad();
	login.logout();
	//***********CP1 exe dession************
	if((ev.estimatedSize.equals("D 500+"))||(ev.location.equals("Other"))) {
		rtq.board();
	}
	
	//Assign a sales leader if task is not submitted by a sales leader
	if(!sl.equals(userName)){
		rtq.ASL();
		}
		else{
			rtq.prepare_Quote();
			prepare_Quoteui.getQuoteprepared().click();
			login.logout();
		}
	b.pathdession(ev.estimatedSize,ev.location);
	//**********CP2 exe dession**************
	if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
		rtq.board();
	}
	rtq.submitandresubmit();
	rtq.statusQuotesubmit(customerCommitmentType);
	}
//Customer commitment as PO received
@Test
public void verifyPOCCA() throws InterruptedException, IOException, AWTException{
	log.info("verifyPOCCA");
	String customerCommitmentType = wb.getXLData(16, 3, 1);
	Thread.sleep(1000);
	boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
	if(elementexist)
	login.user(); 
	
	//****intiation of rtq form*********
    b.rtqForm(ev.estimatedSize,ev.location);
 
    //rtq submit externally
    actionBtns.clickSubmit();
    cu.waitForPageToLoad();
	login.logout();
	//***********CP1 exe dession************
	if((ev.estimatedSize.equals("D 500+"))||(ev.location.equals("Other"))) {
		rtq.board();
	}
	if(!sl.equals(userName)){
		rtq.ASL();
		}
		else{
			rtq.prepare_Quote();
			prepare_Quoteui.getQuoteprepared().click();
			login.logout();
		}
	//driver.close();
	b.pathdession(ev.estimatedSize,ev.location);
	//**********CP2 exe dession**************
	if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
		rtq.board();
	}
	rtq.submitandresubmit();
	rtq.statusQuotesubmit(customerCommitmentType);
	}
//Customer commitment as Verbal received
@Test
public void verifyVerbalCCA() throws InterruptedException, IOException, AWTException{
	log.info("verifyVerbalCCA");	
	String customerCommitmentType = wb.getXLData(17, 3, 1);
	Thread.sleep(1000);
	boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
	if(elementexist)
	login.user(); 
	
	
	
	//****intiation of rtq form*********
    b.rtqForm(ev.estimatedSize,ev.location);
 
    //rtq submit externally
    actionBtns.clickSubmit();
    cu.waitForPageToLoad();
	login.logout();
	//***********CP1 exe dession************
	if((ev.estimatedSize.equals("D 500+"))||(ev.location.equals("Other"))) {
		rtq.board();
	}
	if(!sl.equals(userName)){
		rtq.ASL();
		}
		else{
			rtq.prepare_Quote();
			prepare_Quoteui.getQuoteprepared().click();
			login.logout();
		}
	//driver.close();
	b.pathdession(ev.estimatedSize,ev.location);
	//**********CP2 exe dession**************
	if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
		rtq.board();
	}
	rtq.submitandresubmit();
	rtq.statusQuotesubmit(customerCommitmentType);
	}
//Customer commitment as Email received
@Test
public void verifyEmailCCA() throws InterruptedException, IOException, AWTException{
	log.info("verifyEmailCCA");
	
	String customerCommitmentType = wb.getXLData(18, 3, 1);
	Thread.sleep(1000);
	boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
	if(elementexist)
	login.user(); 
	
	
	
	//****intiation of rtq form*********
    b.rtqForm(ev.estimatedSize,ev.location);
 
    //rtq submit externally
    actionBtns.clickSubmit();
    cu.waitForPageToLoad();
	login.logout();
	//***********CP1 exe dession************
	if((ev.estimatedSize.equals("D 500+"))||(ev.location.equals("Other"))) {
		rtq.board();
	}
	if(!sl.equals(userName)){
		rtq.ASL();
		}
		else{
			rtq.prepare_Quote();
			prepare_Quoteui.getQuoteprepared().click();
			login.logout();
		}
	//driver.close();
	b.pathdession(ev.estimatedSize,ev.location);
	//**********CP2 exe dession**************
	if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
		rtq.board();
	}
	rtq.submitandresubmit();
	rtq.statusQuotesubmit(customerCommitmentType);
	}
//Customer commitment as Sub-contract received
@Test
public void verifySubContractCCA() throws InterruptedException, IOException, AWTException{
	log.info("verifySubContractCCA");	
	String customerCommitmentType = wb.getXLData(19, 3, 1);
	Thread.sleep(1000);
	boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
	if(elementexist)
	login.user(); 
	
	//****intiation of rtq form*********
    b.rtqForm(ev.estimatedSize,ev.location);
 
    //rtq submit externally
    actionBtns.clickSubmit();
    cu.waitForPageToLoad();
	login.logout();
	//***********CP1 exe dession************
	if((ev.estimatedSize.equals("D 500+"))||(ev.location.equals("Other"))) {
		rtq.board();
	}
	if(!sl.equals(userName)){
		rtq.ASL();
		}
		else{
			rtq.prepare_Quote();
			prepare_Quoteui.getQuoteprepared().click();
			login.logout();
		}
	b.pathdession(ev.estimatedSize,ev.location);
	//**********CP2 exe dession**************
	if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
		rtq.board();
	}
	rtq.submitandresubmit();
	rtq.statusQuotesubmit(customerCommitmentType);
	}

@Test
public void verifyAmendBidCCA() throws InterruptedException, IOException, AWTException{
	log.info("verifyAmendBidCCA");
	
	String customerCommitmentType = wb.getXLData(19, 3, 1);
	Thread.sleep(1000);
	boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
	if(elementexist)
	login.user(); 
	
	//****intiation of rtq form*********
    b.rtqForm(ev.estimatedSize,ev.location);
    
    //rtq submit externally
    actionBtns.clickSubmit();
    cu.waitForPageToLoad();
	login.logout();
	//***********CP1 exe dession************
	if((ev.estimatedSize.equals("D 500+"))||(ev.location.equals("Other"))) {
		rtq.board();
	}
	if(!sl.equals(userName)){
		rtq.ASL();
		}
		else{
			rtq.prepare_Quote();
			prepare_Quoteui.getQuoteprepared().click();
			login.logout();
		}
	//driver.close();
	
	b.pathdession(ev.estimatedSize,ev.location);
	//**********CP2 exe dession**************
	if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
		rtq.board();
	}
	rtq.submitandresubmit();
	rtq.statusQuotesubmit(ev.estimatedSize,ev.location);
	}
}

