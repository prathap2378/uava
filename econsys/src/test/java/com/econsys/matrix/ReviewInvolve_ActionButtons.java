package com.econsys.matrix;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Genriclibrery.EconsysVariables;
import com.econsys.Projects.Basic;
import com.econsys.Projects.Login;
import com.econsys.Projects.Monorail;
import com.econsys.Projects.ReviewInvolve;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;
import com.econsys.UIobjectrepositary.CommercialReviewInvolve;
import com.econsys.UIobjectrepositary.EngReviewInvoveUi;
import com.econsys.UIobjectrepositary.Preparequote;

/**
 * @author bhanu.pk
 * Engineering and commercial review involvement action buttons
 * Reject approve save cancel and form validation
 */

public class ReviewInvolve_ActionButtons extends Driver{
	
	CommercialReviewInvolve ricommercial = PageFactory.initElements(Driver.driver(), CommercialReviewInvolve.class);
	EngReviewInvoveUi riEngineering = PageFactory.initElements(Driver.driver(), EngReviewInvoveUi.class);
	ActionButtonsUi ab = PageFactory.initElements(Driver.driver(), ActionButtonsUi.class);
	Preparequote prepareQuoteUI = PageFactory.initElements(Driver.driver(), Preparequote.class);
	Logger log = Logger.getLogger(ReviewInvolve_ActionButtons.class);
	//Class imported
	Login login = new Login();
	Monorail monorail = new Monorail();
	Basic b = new Basic();
	Workbook wb = new Workbook();
	EconsysVariables ev = new EconsysVariables();
	CommonUtils cu = new CommonUtils();

	@Test
	public void InvolveActions() throws IOException, InterruptedException, AWTException {
	  String estimatedSize = wb.getXLData(3, 3, 1);
	  String location =  wb.getXLData(4, 3, 1);
	  
	  login.url();
		//Monorail.monorailTestFlow(e_Size,location);
		cu.waitForPageToLoad();
		boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
		if(elementexist)
		login.user(); 
		
		//****Initiation of rtq form*********
	    b.rtqForm(estimatedSize,location);
	    b.submit_Logout();
	    
		//***********CP1 exe dession************
		if((estimatedSize.equals("D 500-1000k"))||(location.equals("Other"))) {
			b.boardApproval();
		}
		String userName = wb.getXLData(1, 0,0);
		String sl=wb.getXLData(10, 0, 0);
//Assign sales leader bypass		
		if(!sl.equals(userName)){
		monorail.ASL();
		}
		
		//Prepare Quote
		monorail.prepare_Quote();
		cu.selectByVisibleText(prepareQuoteUI.getExpliciteapprovalatgateway2(),ev.exeCP2);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		if(estimatedSize.equals("D 500-1000k")){
			System.out.println("Engineering Involvement path");
			login.loginEL();
			  Thread.sleep(1000);
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN); 
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getComments().sendKeys("Engineering involvement save...");
			  ab.getSavebutton().click();
			  log.info("Engineering involvement saved");
			  //Reject engineering involvement Need to wright new prepare quote
			  b.projectname_Involves();
			  cu.blindWait();
			  //select No before reject
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Engineering involvement rejection");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		if(location.equals("Other")){
			System.out.println("Commercial Involvement path");
			login.loginCL();
			  
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN);	 
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getComments().sendKeys("Commercial involvement");
			  ab.getSavebutton().click();
			  log.info("Commercial involvement saved");
			  
			//Reject commercial involvement Need to wright new prepare quote
			  cu.blindWait();
			  b.projectname_Involves();
			  cu.blindWait();
			//select No before reject
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Commercial involvement rejection");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		monorail.prepare_Quote2();
		cu.selectByVisibleText(prepareQuoteUI.getExpliciteapprovalatgateway2(),ev.exeCP2);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		b.pathdession(estimatedSize, location);
		
		//For CL approval in case of Quotation in our format is No
		if((ev.ourformat.equals("No"))){
			MatrixProjects.clApproval();
		}

		//**********CP2 exe dession**************
		if(ev.exeCP2.equals("Yes")){
			b.boardApproval();
		}
		//If condition does not match for SD approval
		else if((ev.bidsheetauthorised.equals("No"))){
			MatrixProjects.sdApproval();
		}
		
		monorail.submitQuote();
		monorail.statusofSubmitQuote(ev.customerCommitmentType,ev.quoteStatusAmendBid);
		
		//Re-Prepare Quote
		monorail.prepareQuotecp2cp3();
		cu.selectByVisibleText(prepareQuoteUI.getExecp3(),ev.exeCP3);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		if(estimatedSize.equals("D 500-1000k")){
			System.out.println("Engineering Involvement path");
			login.loginEL();
			  Thread.sleep(1000);
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN); 
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getComments().sendKeys("Engineering involvement save CP2-CP3...");
			  ab.getSavebutton().click();
			  log.info("Engineering involvement saved");
			  //Reject engineering involvement Need to wright new prepare quote
			  b.projectname_Involves();
			  cu.blindWait();
			//select No before reject
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Engineering involvement rejection CP2-CP3");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		if(location.equals("Other")){
			System.out.println("Commercial Involvement path");
			login.loginCL();
			  
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN);	 
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  
			  b.projectname_Involves();
			  cu.blindWait();
			  ab.getComments().sendKeys("Commercial involvement");
			  ab.getSavebutton().click();
			  log.info("Commercial involvement saved CP2-CP3");
			  
			//Reject commercial involvement Need to wright new prepare quote
			  b.projectname_Involves();
			  cu.blindWait();
			//select No before reject
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Commercial involvement rejection CP2-CP3");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		login.loginSL();
		monorail.prepareQuotecp2cp3();
		cu.selectByVisibleText(prepareQuoteUI.getExecp3(),ev.exeCP3);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		b.pathdessioncp2cp3(ev.estimatedSize, ev.location);
		log.info("review involvment actions are sucessfull...");
  }
  
@Test
  public void reviewActions() throws IOException, InterruptedException, AWTException {
	  String estimatedSize = wb.getXLData(6, 3, 1);
	  String location =  wb.getXLData(7, 3, 1);
	  //login.url();
		cu.waitForPageToLoad();
		boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
		if(elementexist)
		login.user(); 
		
		//****Initiation of rtq form*********
	    b.rtqForm(estimatedSize,location);
	    b.submit_Logout();
	    
		//***********CP1 exe dession************
		if((estimatedSize.equals("D 500-1000k"))||(location.equals("Other"))) {
			b.boardApproval();
		}
		String userName = wb.getXLData(1, 0,0);
		String sl=wb.getXLData(10, 0, 0);
//Assign sales leader bypass		
		if(!sl.equals(userName)){
		monorail.ASL();
		}
		//Prepare Quote
		monorail.prepare_Quote();
		cu.selectByVisibleText(prepareQuoteUI.getExpliciteapprovalatgateway2(),ev.exeCP2);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		if(estimatedSize.equals("C 250-500k")){
			System.out.println("Engineering review path");
			login.loginEL();
			//cancel
			  Thread.sleep(1000);
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN); 
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  //save
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getComments().sendKeys("Engineering involvement save...");
			  ab.getSavebutton().click();
			  log.info("Engineering involvement saved");
			  //Reject
			  b.projectname_Reviews();
			  cu.blindWait();
			//select No before reject
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Engineering involvement rejection");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		if(location.equals("South East")){
			System.out.println("Commercial Involvement path");
			login.loginCL();
			  //cancel
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN);	 
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  //save
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getComments().sendKeys("Commercial involvement");
			  ab.getSavebutton().click();
			  log.info("Commercial involvement saved");
			  
			//Reject
			  b.projectname_Reviews();
			  cu.blindWait();
			//select No before reject
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Commercial involvement rejection");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		monorail.prepare_Quote2();
		cu.selectByVisibleText(prepareQuoteUI.getExpliciteapprovalatgateway2(),ev.exeCP2);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		b.pathdession(estimatedSize, location);
		
		//For CL approval in case of Quotation in our format is No
				if((ev.ourformat.equals("No"))){
					MatrixProjects.clApproval();
				}

				//**********CP2 exe dession**************
				if(ev.exeCP2.equals("Yes")){
					b.boardApproval();
				}
				//If condition does not match for SD approval
				else if((ev.bidsheetauthorised.equals("No"))){
					MatrixProjects.sdApproval();
				}
		
		monorail.submitQuote();
		monorail.statusofSubmitQuote(ev.customerCommitmentType,ev.quoteStatusAmendBid);
		
		monorail.prepareQuotecp2cp3();
		cu.selectByVisibleText(prepareQuoteUI.getExecp3(),ev.exeCP3);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		
		if(estimatedSize.equals("C 250-500k")){
			System.out.println("Engineering Involvement path");
			login.loginEL();
			  Thread.sleep(1000);
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN); 
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getComments().sendKeys("Engineering involvement save...");
			  ab.getSavebutton().click();
			  log.info("Engineering involvement saved");
			  //Reject engineering involvement Need to wright new prepare quote
			  b.projectname_Reviews();
			  cu.blindWait();
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Engineering involvement rejection");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		if(location.equals("South East")){
			System.out.println("Commercial Involvement path");
			login.loginCL();
			  
			  ab.getReviewinvolvetasks().sendKeys(Keys.RETURN);	 
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getCancelbutton().click();
			  
			  b.projectname_Reviews();
			  cu.blindWait();
			  ab.getComments().sendKeys("Commercial involvement");
			  ab.getSavebutton().click();
			  log.info("Commercial involvement saved");
			  
			//Reject commercial involvement Need to wright new prepare quote
			  b.projectname_Reviews();
			  cu.blindWait();
			  ReviewInvolve.select_No_inDropdowns();
			  ab.getComments().sendKeys("Commercial involvement rejection");
			  ab.getRejectbutton().click();
			  login.logout();
		}
		
		login.loginSL();
		monorail.prepareQuotecp2cp3();
		cu.selectByVisibleText(prepareQuoteUI.getExecp3(),ev.exeCP3);
		prepareQuoteUI.getQuoteprepared().click();
		login.logout();
		b.pathdessioncp2cp3(ev.estimatedSize, ev.location);
		log.info("review actions are sucessfull...");

  }
}
