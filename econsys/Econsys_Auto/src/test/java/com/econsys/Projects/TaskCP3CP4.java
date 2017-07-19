package com.econsys.Projects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;


public class TaskCP3CP4 extends Driver{
	
	//Page UI classes
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	SDapprTandCOPacceptanceui ato=PageFactory.initElements(Driver.driver(),SDapprTandCOPacceptanceui.class);
	
	//import classes
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static Login login=new Login();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static Basic b=new Basic();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	EconsysVariables ev = new EconsysVariables();
	//Veriables
	static String contract_Value;
	String filepath=System.getProperty("user.dir");
	
		
  @Test
  //**********Customer commitment OLD flow********
  
  
  //****Customer Commitment New Flow******
  public void customercommit() throws IOException, InterruptedException{
		 	 System.out.println("this method is customercommit().....");		 
		 b.projectname();
		 //Thread.sleep(1000);
		 //Customer Commitments recived as
		 
		 cu.selectByVisibleText(ccq.getFinal_quoted_scope(), ev.final_quoted_scope);
		 
		 
		 cu.selectByVisibleText(ccq.getDocs_referenced(),ev.docs_Refrenced);
		 
		 
		 cu.selectByVisibleText(ccq.getTerms_and_conditions(), ev.terms_and_conditions);
		 
		 
		 cu.selectByVisibleText(ccq.getProject_Start_Date(), ev.project_Start_Date);
		 
		 
		 cu.selectByVisibleText(ccq.getProject_End_Date(), ev.project_End_Date);
		 
		 /*contract_Value=wb.getXLData(12,7, 0);
		 cu.selectByVisibleText(ccq.getContract_Value(), contract_Value);//Now this element is removed from the page*/
		 
		 if(ev.final_quoted_scope.equals("No")||ev.docs_Refrenced.equals("No")||ev.terms_and_conditions.equals("No")||ev.project_Start_Date.equals("No")||ev.project_End_Date.equals("No")){
				ccq.getReseon_for_No().sendKeys("Reason for No"); 
		 }
		 
		 else if(ev.final_quoted_scope.equals("Yes")&&ev.docs_Refrenced.equals("Yes")&&ev.terms_and_conditions.equals("Yes")&&ev.project_Start_Date.equals("Yes")&&ev.project_End_Date.equals("Yes")){
			 	ev.clarification=wb.getXLData(14, 7, 0);
			 	cu.selectByVisibleText(ccq.getClarificationsSelectBox(), ev.clarification);
			 	//ccq.getClarificationsTextArea().sendKeys("ev.clarification");
			 if(ev.clarification.equals("No")){
				 driver.findElement(By.xpath("//input[@id='img_cmt_startFinalQuote']")).sendKeys("Selected No");
			 }
		 }
		 
		 //ev.ev.docsatis=wb.getXLData(16,7, 0);
		 //cu.selectByVisibleText(ccq.getDocumentStatify(), ev.ev.docsatis);
		 
		 ccq.getComments().sendKeys("Coustomer commitment");
		 
		 
		 
		 if(ev.final_quoted_scope.equals("Yes")&&ev.docs_Refrenced.equals("Yes")&&ev.terms_and_conditions.equals("Yes")&&ev.project_Start_Date.equals("Yes")&&ev.project_End_Date.equals("Yes")){
			 
		 }
			 
		 if(ev.final_quoted_scope.equals("No")||ev.docs_Refrenced.equals("No")||ev.terms_and_conditions.equals("No")||ev.project_Start_Date.equals("No")||ev.project_End_Date.equals("No")){
			g34.clApproval();
		//	g34.sdApprovalnewFlow();// SD Approval flow removed
		 }
		 
		 //driver().quit();
	 }
  
  public void customercommitmentLOIrecived() throws IOException, InterruptedException{
	  	//Customer Commitments recived as
		 
		 cu.selectByVisibleText(ccq.getFinal_quoted_scope(), ev.final_quoted_scope);
		 
		 ev.docs_Refrenced=wb.getXLData(4,7, 0);
		 cu.selectByVisibleText(ccq.getDocs_referenced(),ev.docs_Refrenced);
		 
		 ev.terms_and_conditions=wb.getXLData(6,7, 0);
		 cu.selectByVisibleText(ccq.getTerms_and_conditions(), ev.terms_and_conditions);

		 ev.project_Start_Date=wb.getXLData(8,7, 0);
		 cu.selectByVisibleText(ccq.getProject_Start_Date(), ev.project_Start_Date);
		 
		 ev.project_End_Date=wb.getXLData(10,7, 0);
		 cu.selectByVisibleText(ccq.getProject_End_Date(), ev.project_End_Date);
		 
		 /*contract_Value=wb.getXLData(12,7, 0);
		 cu.selectByVisibleText(ccq.getContract_Value(), contract_Value); //Now this element is removed from the page*/
		 
		 if(ev.final_quoted_scope.equals("No")||ev.docs_Refrenced.equals("No")||ev.terms_and_conditions.equals("No")||ev.project_Start_Date.equals("No")||ev.project_End_Date.equals("No")){
				ccq.getReseon_for_No().sendKeys("Reseaon for No"); 
		 }
		 
		 else if(ev.final_quoted_scope.equals("Yes")&&ev.docs_Refrenced.equals("Yes")&&ev.terms_and_conditions.equals("Yes")&&ev.project_Start_Date.equals("Yes")&&ev.project_End_Date.equals("Yes")){
			 	ev.clarification=wb.getXLData(14, 7, 0);
			 	cu.selectByVisibleText(ccq.getClarificationsSelectBox(), ev.clarification);
			 	//ccq.getClarificationsTextArea().sendKeys("ev.clarification");
			 if(ev.clarification.equals("No")){
				 driver.findElement(By.xpath("//input[@id='img_cmt_startFinalQuote']")).sendKeys("Selected No");
			 }
		 }
		 
		 //ev.ev.docsatis=wb.getXLData(16,7, 0);
		 //cu.selectByVisibleText(ccq.getDocumentStatify(), ev.ev.docsatis);
		 
		 ccq.getComments().sendKeys("Coustomer commitment");
		 
		 
		 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
		 
		 ccq.getSubmit().click();
		 login.logout();
		 

		 if(ev.final_quoted_scope.equals("Yes")&&ev.docs_Refrenced.equals("Yes")&&ev.terms_and_conditions.equals("Yes")&&ev.project_Start_Date.equals("Yes")&&ev.project_End_Date.equals("Yes")){
			 
		 }
			 
		 if(ev.final_quoted_scope.equals("No")||ev.docs_Refrenced.equals("No")||ev.terms_and_conditions.equals("No")||ev.project_Start_Date.equals("No")||ev.project_End_Date.equals("No")){
			g34.clApproval();
			//g34.sdApprovalnewFlow(); this task is removed from the flow
		 }
  }
  public void clApproval() throws IOException, InterruptedException{
	  	login.loginCL();
	  	driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  	b.projectname_ReviewApproval();
	  	ab.getComments().sendKeys("Customer Commitment CL Approval");
	  	ab.getApproveBtn().click();
	  	login.logout();
  }
  public void sdApprovalnewFlow() throws IOException, InterruptedException{
	   login.loginSD();
	   driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	   b.projectname_ReviewApproval();
	   ab.getComments().sendKeys("Customer Commitment SD Approval");
	   ab.getApproveBtn().click();
	   login.logout();
  }
  public void sdApproval() throws IOException, InterruptedException {
	  login.loginSD();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  Thread.sleep(1000);
	  b.projectname_ReviewApproval();
	 
	 // ato.getProofofVerbalCommitment().sendKeys(filepath+"\\Documentsuploded\\SDapproval.doc");
	  ab.getComments().sendKeys("SD Approval");
	  ab.getApproveBtn().click();
	  login.logout();
  }
  public void tandcreview() throws IOException, InterruptedException{
	  login.loginCL();
	  ab.getReviewinvolvetasks().click();
      b.projectname_ReviewApproval();
      //Thread.sleep(1000);
	  cu.selectByVisibleText(ato.getTandctermsandcondition(),"Yes");
	  Thread.sleep(1000);
	  driver().findElement(By.xpath("//input[@id='fl_st_termsandConditions']")).sendKeys(filepath+"\\Documentsuploded\\T&Creview.xlsx");
	  cu.selectByVisibleText(ato.getTandcprogamme(), "Yes");
	  //Thread.sleep(1000);
	  driver().findElement(By.xpath("//input[@id='fl_st_programme']")).sendKeys(filepath+"\\Documentsuploded\\Programme.xlsx");
	  ab.getComments().sendKeys("T and C review");
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();
  }
  public void operationreview() throws IOException, InterruptedException{
	  login.loginOD();
	  ab.getReviewinvolvetasks().click();
	  b.projectname_ReviewApproval();
	  //Thread.sleep(1000);
	  cu.selectByVisibleText(ato.getOperationprogrammereview(),"Yes");
	  //Thread.sleep(1000);
	  driver().findElement(By.xpath("//input[@id='fl_st_programmereview']")).sendKeys(filepath+"\\Documentsuploded\\Programmereview.xlsx");
	  ab.getComments().sendKeys("Operational Programme Review");
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();
  }
  public void customercommitoldFlow() throws IOException, InterruptedException{
		 
		 b.projectname();
		 //Thread.sleep(1000);
		 //Customer Commitments recived as
		 ev.cusrecivedas=wb.getXLData(2,6, 0);
		 cu.selectByVisibleText(ccq.getCustomerCommitmentReceivedAs(), ev.cusrecivedas);
		 if(ev.cusrecivedas.equals("Email")||ev.cusrecivedas.equals("Letter of Intent")||ev.cusrecivedas.equals("Purchase Order")||ev.cusrecivedas.equals("Sub Contract")){
			 //ccq.getCaRecievedAsFile().sendKeys(filepath+"\\Documentsuploded\\G3 Gateway Approval.doc");
			 ccq.getCaRecievedAsFile().sendKeys(filepath+"\\Documentsuploded\\Monorail_Issuelist_Oct06.xls");
		 }
		 
		 ev.scope=wb.getXLData(4,6, 0);
		 cu.selectByVisibleText(ccq.getScopeofwork(), ev.scope);
		 if(ev.scope.equals("Yes")){
			 //ccq.getWorkAcceptedFile().sendKeys(filepath+"\\Documentsuploded\\G5 Create draft Commercial Suite- Explanation.docx");
			 ccq.getWorkAcceptedFile().sendKeys(filepath+"\\Documentsuploded\\Monorail_Issuelist_Oct07.xls");
		 }
		 
		 ev.docrefrence=wb.getXLData(6,6,0);
		 cu.selectByVisibleText(ccq.getDocumentsreferenced(), ev.docrefrence);
		 if(ev.docrefrence.equals("Yes")){
			 //ccq.getScopedocumentFile().sendKeys(filepath+"\\Documentsuploded\\ev.scope of works.xlsx");
			 ccq.getScopedocumentFile().sendKeys(filepath+"\\Documentsuploded\\Monorail_Issuelist_Oct08.xls");
		 }
		 
		 ev.termsandcond=wb.getXLData(8,6, 0);
		 cu.selectByVisibleText(ccq.getTermsandConditions(), ev.termsandcond);
		 if(ev.termsandcond.equals("Yes")){
			 ccq.getTermsdocumentFile().sendKeys(filepath+"\\Documentsuploded\\G2 Risk and Opportunity register - Explanation.docx");
		 }
		 
		 ev.startdate=wb.getXLData(10,6, 0);
		 cu.selectByVisibleText(ccq.getProjectStartDateAccepted(), ev.startdate);
		 if(ev.startdate.equals("Yes")){
			 ccq.getStartdateFile().sendKeys(filepath+"\\Documentsuploded\\G2 Record Estimated Cost and Sell values - Explanation.docx");
		 }
		 
		 ev.endate=wb.getXLData(12,6, 0);
		 cu.selectByVisibleText(ccq.getProjectEndDateAccepted(), ev.endate);
		 if(ev.endate.equals("Yes")){
			 ccq.getEnddateFile().sendKeys(filepath+"\\Documentsuploded\\G6 Risk Register.xlsx");
		 }
		 
		 ev.clarification=wb.getXLData(14,6, 0);
		 cu.selectByVisibleText(ccq.getClarificationsSelectBox(), ev.clarification);
		 
		 ccq.getClarificationsTextArea().sendKeys("ev.clarification");
		 
		 ev.docsatis=wb.getXLData(16,6,0);
		 cu.selectByVisibleText(ccq.getDocumentStatify(), ev.docsatis);
		 
		 ccq.getComments().sendKeys("Coustomer commitment");
		 
		 ev.execp4=wb.getXLData(18,7, 0);
		 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
		 
		 ccq.getSubmit().click();
		 login.logout();
		 
		 //driver().quit();
	 }
}