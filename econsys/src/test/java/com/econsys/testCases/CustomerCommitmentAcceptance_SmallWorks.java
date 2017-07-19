package com.econsys.testCases;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.Projects.*;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class CustomerCommitmentAcceptance_SmallWorks {
	private static Logger log = Logger.getLogger(smallWork_flow.class.getName());

	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RTQForm_Ui nrtq=PageFactory.initElements(Driver.driver(), RTQForm_Ui.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	ProjectMethods_Small_Works proMethods=PageFactory.initElements(Driver.driver(), ProjectMethods_Small_Works.class);
	//SubmitQuote submit=PageFactory.initElements(Driver.driver(), SubmitQuote.class);
	TasksCP4toCP5 cp45=PageFactory.initElements(Driver.driver(), TasksCP4toCP5.class);
	TasksCP5toCP9 pdop=PageFactory.initElements(Driver.driver(), TasksCP5toCP9.class);
	
	static Workbook wb=new Workbook();
	static Monorail monorail=new Monorail();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	static Basic b=new Basic();
	static Login login=new Login();
	EconsysVariables ev = new EconsysVariables();
	
	boolean flag=false;
	String customerCommitmentType;
	
@Test
public void verify_SW_LOICCA() throws InterruptedException, IOException, AWTException, ClassNotFoundException, SQLException{
	//new CustomerCommitmentAcceptance();
	log.info("verify_SW_LOICCA");
	customerCommitmentType=wb.getXLData(15, 3, 1);
	flag=proMethods.smallworkForm();
	log.info("Flag : "+flag);
		if(flag){
			Reporter.log("Small Works flow changed to Project, end this test");
		}
		else{
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))){
			b.boardApproval();
		}
	login.loginSL();
	ab.getViewalltasks().click();
	cu.waitForPageToLoad();
	b.projectname();
	proMethods.submit_Quoteform();
	//proMethods.statusofSubmitQuote(customerCommitmentType);
	monorail.statusQuotesubmit(customerCommitmentType,ev.quoteStatusCCARecived);
	if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
		b.boardApproval();
	}
	}
}
//@Test
public void verify_SW_POCCA() throws InterruptedException, IOException, AWTException, ClassNotFoundException, SQLException{
	//new CustomerCommitmentAcceptance();
	customerCommitmentType=wb.getXLData(16, 3, 1);
	flag=proMethods.smallworkForm();
	log.info("Flag : "+flag);
		if(flag){
			Reporter.log("Small Works flow changed to Project, end this test");
		}
		else{
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))){
			b.boardApproval();
		}
	login.loginSL();
	ab.getViewalltasks().click();
	cu.waitForPageToLoad();
	b.projectname();
	proMethods.submit_Quoteform();
	monorail.statusQuotesubmit(customerCommitmentType, ev.quoteStatusCCARecived);
	if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
		b.boardApproval();
	}
	}
	}
@Test
public void verify_SW_VerbalCCA() throws InterruptedException, IOException, AWTException, ClassNotFoundException, SQLException{
	//new CustomerCommitmentAcceptance();
	log.info("verify_SW_VerbalCCA");
	customerCommitmentType=wb.getXLData(17, 3, 1);
	flag=proMethods.smallworkForm();
	log.info("Flag : "+flag);
		if(flag){
			Reporter.log("Small Works flow changed to Project, end this test");
		}
		else{
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))){
			b.boardApproval();
		}
	login.loginSL();
	ab.getViewalltasks().click();
	cu.waitForPageToLoad();
	b.projectname();
	proMethods.submit_Quoteform();
	monorail.statusQuotesubmit(customerCommitmentType, ev.quoteStatusCCARecived);
	if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
		b.boardApproval();
	}
		}
}

@Test
public void verify_SW_EmailCCA() throws InterruptedException, IOException, AWTException, ClassNotFoundException, SQLException{
	//new CustomerCommitmentAcceptance();
	customerCommitmentType=wb.getXLData(18, 3, 1);
	flag=proMethods.smallworkForm();
	log.info("Flag : "+flag);
		if(flag){
			Reporter.log("Small Works flow changed to Project, end this test");
		}
		else{
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))){
			b.boardApproval();
		}
	login.loginSL();
	ab.getViewalltasks().click();
	cu.waitForPageToLoad();
	b.projectname();
	proMethods.submit_Quoteform();
	monorail.statusQuotesubmit(customerCommitmentType, ev.quoteStatusCCARecived);
	if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
		b.boardApproval();
	}
		}
}
//@Test
public void verify_SW_SubContractCCA() throws InterruptedException, IOException, AWTException, ClassNotFoundException, SQLException{
	//new CustomerCommitmentAcceptance();
	customerCommitmentType=wb.getXLData(19, 3, 1);
	flag=proMethods.smallworkForm();
	log.info("Flag : "+flag);
		if(flag){
			Reporter.log("Small Works flow changed to Project, end this test");
		}
		else{
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))){
			b.boardApproval();
		}
	login.loginSL();
	ab.getViewalltasks().click();
	cu.waitForPageToLoad();
	b.projectname();
	proMethods.submit_Quoteform();
	monorail.statusQuotesubmit(customerCommitmentType, ev.quoteStatusCCARecived);
	if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
		b.boardApproval();
	}
		}
}

@Test
public void verify_SW_AmendBid() throws InterruptedException, IOException, AWTException, ClassNotFoundException, SQLException{
	//new CustomerCommitmentAcceptance();
	log.info("verify_SW_AmendBid");
	login.url();
	customerCommitmentType=wb.getXLData(15, 3, 1);
	flag=proMethods.smallworkForm();
	
	log.info("Flag : "+flag);
	if(flag){
		Reporter.log("Small Works flow changed to Project, end this test");
	}else{
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))){
			b.boardApproval();
		}
	login.loginSL();
	ab.getViewalltasks().click();
	cu.waitForPageToLoad();
	b.projectname();
	proMethods.submit_Quoteform();
	monorail.statusQuotesubmit(customerCommitmentType,ev.quoteStatusAmendBid);
	if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
		b.boardApproval();
	}
		}
}
}

