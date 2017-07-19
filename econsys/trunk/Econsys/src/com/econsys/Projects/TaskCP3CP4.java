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
	RtqFormUIodj nrtq=PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
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
	
	//Veriables
	static String final_quoted_scope;
	static String docs_Refrenced;
	static String terms_and_conditions;
	static String project_Start_Date;
	static String project_End_Date;
	static String contract_Value;
	static String clarification=null;
	static String docsatis=null;
	static String execp4=null;
	String filepath=System.getProperty("user.dir");
	static String cusrecivedas=null;
	static String scope=null;
	static String docrefrence=null;
	static String termsandcond=null;
	static String startdate=null;
	static String endate=null;
		
  @Test
  //**********Customer commitment OLD flow********
  
  
  //****Customer Commitment New Flow******
  public void customercommit() throws IOException, InterruptedException{
		 	 		 
		 ab.getViewalltasks().click();
		 b.projectname();
		 //Thread.sleep(1000);
		 //Customer Commitments recived as
		 final_quoted_scope=wb.getXLData(2,7,0);
		 cu.selectByVisibleText(ccq.getFinal_quoted_scope(), final_quoted_scope);
		 
		 docs_Refrenced=wb.getXLData(4,7, 0);
		 cu.selectByVisibleText(ccq.getDocs_referenced(),docs_Refrenced);
		 
		 terms_and_conditions=wb.getXLData(6,7, 0);
		 cu.selectByVisibleText(ccq.getTerms_and_conditions(), terms_and_conditions);
		 
		 project_Start_Date=wb.getXLData(8,7, 0);
		 cu.selectByVisibleText(ccq.getProject_Start_Date(), project_Start_Date);
		 
		 project_End_Date=wb.getXLData(10,7, 0);
		 cu.selectByVisibleText(ccq.getProject_End_Date(), project_End_Date);
		 
		 /*contract_Value=wb.getXLData(12,7, 0);
		 cu.selectByVisibleText(ccq.getContract_Value(), contract_Value);//Now this element is removed from the page*/
		 
		 if(final_quoted_scope.equals("No")||docs_Refrenced.equals("No")||terms_and_conditions.equals("No")||project_Start_Date.equals("No")||project_End_Date.equals("No")){
				ccq.getReseon_for_No().sendKeys("Reason for No"); 
		 }
		 
		 else if(final_quoted_scope.equals("Yes")&&docs_Refrenced.equals("Yes")&&terms_and_conditions.equals("Yes")&&project_Start_Date.equals("Yes")&&project_End_Date.equals("Yes")){
			 	clarification=wb.getXLData(14, 7, 0);
			 	cu.selectByVisibleText(ccq.getClarificationsSelectBox(), clarification);
			 	//ccq.getClarificationsTextArea().sendKeys("Clarification");
			 if(clarification.equals("No")){
				 driver.findElement(By.xpath("//input[@id='img_cmt_startFinalQuote']")).sendKeys("Selected No");
			 }
		 }
		 
		 //docsatis=wb.getXLData(16,7, 0);
		 //cu.selectByVisibleText(ccq.getDocumentStatify(), docsatis);
		 
		 ccq.getComments().sendKeys("Coustomer commitment");
		 
		 /*execp4=wb.getXLData(18,7, 0);
		 cu.selectByVisibleText(ccq.getExeCP4(), execp4);*/
		 
		 ccq.getSubmit().click();
		 login.logout();
		 
		 if(final_quoted_scope.equals("Yes")&&docs_Refrenced.equals("Yes")&&terms_and_conditions.equals("Yes")&&project_Start_Date.equals("Yes")&&project_End_Date.equals("Yes")){
			 
		 }
			 
		 if(final_quoted_scope.equals("No")||docs_Refrenced.equals("No")||terms_and_conditions.equals("No")||project_Start_Date.equals("No")||project_End_Date.equals("No")){
			g34.clApproval();
		//	g34.sdApprovalnewFlow();// SD Approval flow removed
		 }
		 
		 //driver().quit();
	 }
  
  public void customercommitmentLOIrecived() throws IOException, InterruptedException{
	  	//Customer Commitments recived as
		 final_quoted_scope=wb.getXLData(2,7,0);
		 cu.selectByVisibleText(ccq.getFinal_quoted_scope(), final_quoted_scope);
		 
		 docs_Refrenced=wb.getXLData(4,7, 0);
		 cu.selectByVisibleText(ccq.getDocs_referenced(),docs_Refrenced);
		 
		 terms_and_conditions=wb.getXLData(6,7, 0);
		 cu.selectByVisibleText(ccq.getTerms_and_conditions(), terms_and_conditions);

		 project_Start_Date=wb.getXLData(8,7, 0);
		 cu.selectByVisibleText(ccq.getProject_Start_Date(), project_Start_Date);
		 
		 project_End_Date=wb.getXLData(10,7, 0);
		 cu.selectByVisibleText(ccq.getProject_End_Date(), project_End_Date);
		 
		 /*contract_Value=wb.getXLData(12,7, 0);
		 cu.selectByVisibleText(ccq.getContract_Value(), contract_Value); //Now this element is removed from the page*/
		 
		 if(final_quoted_scope.equals("No")||docs_Refrenced.equals("No")||terms_and_conditions.equals("No")||project_Start_Date.equals("No")||project_End_Date.equals("No")){
				ccq.getReseon_for_No().sendKeys("Reseaon for No"); 
		 }
		 
		 else if(final_quoted_scope.equals("Yes")&&docs_Refrenced.equals("Yes")&&terms_and_conditions.equals("Yes")&&project_Start_Date.equals("Yes")&&project_End_Date.equals("Yes")){
			 	clarification=wb.getXLData(14, 7, 0);
			 	cu.selectByVisibleText(ccq.getClarificationsSelectBox(), clarification);
			 	//ccq.getClarificationsTextArea().sendKeys("Clarification");
			 if(clarification.equals("No")){
				 driver.findElement(By.xpath("//input[@id='img_cmt_startFinalQuote']")).sendKeys("Selected No");
			 }
		 }
		 
		 //docsatis=wb.getXLData(16,7, 0);
		 //cu.selectByVisibleText(ccq.getDocumentStatify(), docsatis);
		 
		 ccq.getComments().sendKeys("Coustomer commitment");
		 
		 execp4=wb.getXLData(18,7, 0);
		 cu.selectByVisibleText(ccq.getExeCP4(), execp4);
		 
		 ccq.getSubmit().click();
		 login.logout();
		 

		 if(final_quoted_scope.equals("Yes")&&docs_Refrenced.equals("Yes")&&terms_and_conditions.equals("Yes")&&project_Start_Date.equals("Yes")&&project_End_Date.equals("Yes")){
			 
		 }
			 
		 if(final_quoted_scope.equals("No")||docs_Refrenced.equals("No")||terms_and_conditions.equals("No")||project_Start_Date.equals("No")||project_End_Date.equals("No")){
			g34.clApproval();
			//g34.sdApprovalnewFlow(); this task is removed from the flow
		 }
  }
  public void clApproval() throws IOException, InterruptedException{
	  	login.loginCL();
	  	driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  	b.projectnameboard();
	  	ab.getComments().sendKeys("Customer Commitment CL Approval");
	  	ab.getReviewInvolveapprovebutton().click();
	  	login.logout();
  }
  public void sdApprovalnewFlow() throws IOException, InterruptedException{
	   login.loginSD();
	   driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	   b.projectnameboard();
	   ab.getComments().sendKeys("Customer Commitment SD Approval");
	   ab.getReviewInvolveapprovebutton().click();
	   login.logout();
  }
  public void sdApproval() throws IOException, InterruptedException {
	  login.loginSD();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  Thread.sleep(1000);
	  b.projectnameboard();
	 
	 // ato.getProofofVerbalCommitment().sendKeys(filepath+"\\Documentsuploded\\SDapproval.doc");
	  ab.getComments().sendKeys("SD Approval");
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();
  }
  public void tandcreview() throws IOException, InterruptedException{
	  login.loginCL();
	  ab.getReviewinvolvetasks().click();
      b.projectnamerevieinvolve();
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
	  b.projectnamerevieinvolve();
	  //Thread.sleep(1000);
	  cu.selectByVisibleText(ato.getOperationprogrammereview(),"Yes");
	  //Thread.sleep(1000);
	  driver().findElement(By.xpath("//input[@id='fl_st_programmereview']")).sendKeys(filepath+"\\Documentsuploded\\Programmereview.xlsx");
	  ab.getComments().sendKeys("Operational Programme Review");
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();
  }
  public void customercommitoldFlow() throws IOException, InterruptedException{
		 
		 ab.getViewalltasks().click();
		 b.projectname();
		 //Thread.sleep(1000);
		 //Customer Commitments recived as
		 cusrecivedas=wb.getXLData(2,6, 0);
		 cu.selectByVisibleText(ccq.getCustomerCommitmentReceivedAs(), cusrecivedas);
		 if(cusrecivedas.equals("Email")||cusrecivedas.equals("Letter of Intent")||cusrecivedas.equals("Purchase Order")||cusrecivedas.equals("Sub Contract")){
			 //ccq.getCaRecievedAsFile().sendKeys(filepath+"\\Documentsuploded\\G3 Gateway Approval.doc");
			 ccq.getCaRecievedAsFile().sendKeys(filepath+"\\Documentsuploded\\Monorail_Issuelist_Oct06.xls");
		 }
		 
		 scope=wb.getXLData(4,6, 0);
		 cu.selectByVisibleText(ccq.getScopeofwork(), scope);
		 if(scope.equals("Yes")){
			 //ccq.getWorkAcceptedFile().sendKeys(filepath+"\\Documentsuploded\\G5 Create draft Commercial Suite- Explanation.docx");
			 ccq.getWorkAcceptedFile().sendKeys(filepath+"\\Documentsuploded\\Monorail_Issuelist_Oct07.xls");
		 }
		 
		 docrefrence=wb.getXLData(6,6,0);
		 cu.selectByVisibleText(ccq.getDocumentsreferenced(), docrefrence);
		 if(docrefrence.equals("Yes")){
			 //ccq.getScopedocumentFile().sendKeys(filepath+"\\Documentsuploded\\Scope of works.xlsx");
			 ccq.getScopedocumentFile().sendKeys(filepath+"\\Documentsuploded\\Monorail_Issuelist_Oct08.xls");
		 }
		 
		 termsandcond=wb.getXLData(8,6, 0);
		 cu.selectByVisibleText(ccq.getTermsandConditions(), termsandcond);
		 if(termsandcond.equals("Yes")){
			 ccq.getTermsdocumentFile().sendKeys(filepath+"\\Documentsuploded\\G2 Risk and Opportunity register - Explanation.docx");
		 }
		 
		 startdate=wb.getXLData(10,6, 0);
		 cu.selectByVisibleText(ccq.getProjectStartDateAccepted(), startdate);
		 if(startdate.equals("Yes")){
			 ccq.getStartdateFile().sendKeys(filepath+"\\Documentsuploded\\G2 Record Estimated Cost and Sell values - Explanation.docx");
		 }
		 
		 endate=wb.getXLData(12,6, 0);
		 cu.selectByVisibleText(ccq.getProjectEndDateAccepted(), endate);
		 if(endate.equals("Yes")){
			 ccq.getEnddateFile().sendKeys(filepath+"\\Documentsuploded\\G6 Risk Register.xlsx");
		 }
		 
		 clarification=wb.getXLData(14,6, 0);
		 cu.selectByVisibleText(ccq.getClarificationsSelectBox(), clarification);
		 
		 ccq.getClarificationsTextArea().sendKeys("Clarification");
		 
		 docsatis=wb.getXLData(16,6,0);
		 cu.selectByVisibleText(ccq.getDocumentStatify(), docsatis);
		 
		 ccq.getComments().sendKeys("Coustomer commitment");
		 
		 execp4=wb.getXLData(18,7, 0);
		 cu.selectByVisibleText(ccq.getExeCP4(), execp4);
		 
		 ccq.getSubmit().click();
		 login.logout();
		 
		 //driver().quit();
	 }
}