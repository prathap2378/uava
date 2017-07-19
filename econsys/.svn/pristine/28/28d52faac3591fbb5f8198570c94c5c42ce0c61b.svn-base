package com.econsys.Projects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;
public class Monorail extends Driver {
	
	private static Logger log = Logger.getLogger(Monorail.class.getName());
	//Page UI classes
	public static Preparequote prepare_Quoteui=PageFactory.initElements(Driver.driver(), Preparequote.class);
	static CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	static RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	static ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	static Salestooperation so=PageFactory.initElements(Driver.driver(),Salestooperation.class);
	static AppointkeystaffandCommerSuitUi ak=PageFactory.initElements(Driver.driver(), AppointkeystaffandCommerSuitUi.class);
	static PDPui pdp_ui=PageFactory.initElements(Driver.driver(),PDPui.class);
	static Alerts alerts = new Alerts();
	//import classes
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	static Basic b=new Basic();
	static Login login=new Login();
	static TasksCP5toCP9 pdop=new TasksCP5toCP9();
	static EconsysVariables ev = new EconsysVariables();
	
	//Variables
	/*public static String estimatedSize;
	public static String location;*/
	
	static int num;
	double overallSell;
	String filepath=System.getProperty("user.dir");
	
	//Monorail flow 
	@Test(invocationCount = 1,threadPoolSize = 1)
	//invocationCount = 10,threadPoolSize = 1
	public void test1() throws Exception {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		monorailTestFlow(ev.estimatedSize,ev.location);
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
	//Test method
	@Test
	public static void monorailTestFlow(String estimatedSize,String location) throws Exception{
		//******URL&&&&&&&&&
		login.url();

		//*****Login as genral user******
		 Thread.sleep(1000);
		boolean elementexist=driver.findElements(By.cssSelector("input[id='_58_emailInput'][name='_58_login']")).size()>0;
		if(elementexist)
		login.user(); 
		
		//****intiation of rtq form*********
	    b.rtqForm(estimatedSize,location);
	    
	    //rtq submit externally
	    nrtq.getSubmit().click();
	    
	    //Logout
	    login.logout();
		
		//***********CP1 exe dession************
		if((estimatedSize.equals("D 500+"))||(location.equals("Other"))) {
			rtq.board();
		}
		String userName = wb.getXLData(1, 0,0);
		String sl=wb.getXLData(10, 0, 0);
		
		if(!sl.equals(userName)){
			rtq.ASL();
			}
			else{
				
			}
		
		//Prepare Quote
		rtq.prepare_Quote();
		cu.selectByVisibleText(prepare_Quoteui.getExpliciteapprovalatgateway2(),ev.exeCP2);
		prepare_Quoteui.getQuoteprepared().click();
		login.logout();
		
		b.pathdession(estimatedSize,location);
		//**********CP2 exe dession**************
		if((ev.ourformat.equals("No"))||(ev.bidsheetauthorised.equals("No"))||(ev.exeCP2.equals("Yes"))){
			rtq.board();
		}
		rtq.submitandresubmit();
		rtq.statusQuotesubmit(estimatedSize,location);
		/*if((ev.cusrecivedas.equals("Verbal"))||(ev.startdate.equals("No"))||(ev.endate.equals("No"))){
			g34.sdApproval();
		}
		if(((ev.cusrecivedas.equals("Email"))||(ev.cusrecivedas.equals("Sub Contract"))||(ev.cusrecivedas.equals("Purchase Order"))||(ev.cusrecivedas.equals("Letter of Intent")))&&(ev.docsatis.equals("No"))&&(ev.startdate.equals("Yes"))&&(ev.endate.equals("Yes"))){
		   g34.tandcreview();
		   g34.operationreview();
		}
		//**********CP4 exe dession**************
		if((ev.scope.equals("No"))||(ev.docrefrence.equals("No"))||(ev.termsandcond.equals("No")||(ev.execp4.equals("Yes")))){
			rtq.boardcp4();
		}*/
		//**********CP4 exe dession New Flow**************
		if((ev.clarification.equals("No"))||(ev.execp4.equals("Yes"))){
			rtq.boardcp4();
		}	
		g45.apointkeystaf();
		g45.commerSuit();
        //Sales to operation hand-over
		g45.salestoOperation();
		
  	    cu.selectByVisibleText(so.getExeCP5(),ev.exe5_SalestoOper);
  	    ab.getComments().sendKeys("Sales to operation");
  	    ab.getSubmitbutton().click();
  	    login.logout();
  	    
  	    //operation hand-over
        g45.operationAcceptance();
  	  	cu.selectByVisibleText(ak.getExeOperationAcceptanceCP5(), ev.exeCP5_OperationAccep);
  	  	ab.getComments().sendKeys("Operations Acceptance");
  	  	driver.findElement(By.xpath("//input[@id='approve']")).click();
  	  	login.logout();
		
  	  	//**********CP5 exe dession **********
        if(ev.exe5_SalestoOper.equals("Yes")||(ev.exeCP5_OperationAccep.equals("Yes")||(ev.draftproduced.equals("No")))){
			rtq.board();
		}
        //driver.close();
		pdop.pdp();
		cu.selectByVisibleText(pdp_ui.getExecp6(),ev.execp6);
		Thread.sleep(1000);
		ab.getSubmitbutton().click();
		Thread.sleep(1000);
		login.logout();
		//**********CP6 exe dession **********
		if(ev.execp6.equals("Yes")){
			rtq.boardcp6();
		}
		
		//driver.close();
		pdop.deveryreview();
		//**********OD approval **************
		pdop.obtainpracticalcomplition();
		
		cu.selectByVisibleText(pdp_ui.getOpc_cp8(), ev.execp8);
		ab.getSubmitbutton().click();
		login.logout();
		//***********CP8 exe dession **********
		if(ev.certificateobtained.equals("No")||ev.retationapplied.equals("No")||ev.onmSubmitted.equals("No")||ev.snagListIdentified.equals("No")||ev.internalCompletionDocument.equals("No")||ev.execp8.equals("Yes")){
			rtq.boardcp6();
		}
		pdop.postpracticalcomplition();
		cu.selectByVisibleText(pdp_ui.getPpc_cp9(), ev.execp9);
		ab.getSubmitbutton().click();
		login.logout();
		//***********CP9 exe dession **********
		if(ev.finalAccountAgreement.equals("No")||ev.finalRetentionPaid.equals("No")||ev.projectDocumentArchived.equals("No")||ev.projectDebrief.equals("No")||ev.subContractAccountSettled.equals("No")||ev.closureofProject.equals("No")||ev.bondsGuarantees_Resolved.equals("No")||ev.execp9.equals("Yes")){
			rtq.boardcp6();
		}
		log.info("Monorail Test script ended....");
	
	}
	//***************Assign sales leader task **************
	 public void ASL() throws InterruptedException, IOException {
		 
		  login.loginSD();
		  Thread.sleep(1000);
	   	  ab.getViewalltasks().click();
	   	  System.out.println("Projet name ASL");
	   	  b.projectname();
		  
	   	  Thread.sleep(1000);
	   	  /*ab.getViewalltasks().click();*/
		  Select select=new Select(sla.getSalesleader());
		  
		  String sl=wb.getXLData(7,3, 0);
		  //select sales leader
		  select.selectByVisibleText(sl);
		  
		  		  
		  //View work load
		  //sla.getViewworkload().click();
		  sla.getComments().sendKeys("Asigne sales leader");
		  
		  //Save task
		  //sla.getSavebutton().click();
		  
		  //Allocate sales leader
		  sla.getAllocate().click();
		  
		  //Cancel task
		  //sla.getCancelbutton().click();
		  login.logout();
		}
	 //********Prepare Quote task***********
	 public void prepare_Quote() throws InterruptedException, IOException {
		 ProjectMethods_Small_Works projectMethods_Small_Works = new ProjectMethods_Small_Works();
		 login.loginSL();
		 b.projectname();
		 Thread.sleep(1000);
		 cu.selectByVisibleText(prepare_Quoteui.getQuotationonourFormat(), ev.ourformat);
		 
		 cu.waitForPageToLoad();
		 //driver.findElement(By.xpath("//div[@id='quoteDocument-dropzone']")).click();
		 //projectMethods_Small_Works.uploadFile("G1 Gateway Approval.doc");
		 //driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		 prepare_Quoteui.getQuotedocument_Linkfile().click();
		 projectMethods_Small_Works.linktoFileupload();
		 cu.waitForPageToLoad();
		 
		 prepare_Quoteui.getRiskopportunityregister_Linkfile().click();
		 projectMethods_Small_Works.linktoFileupload();
		 
		 cu.selectByVisibleText(prepare_Quoteui.getBidSheetAuthorised(), ev.bidsheetauthorised);
		  
		 prepare_Quoteui.getComments().sendKeys("Prepare Quote");

		 //Reading cost and sell values
		 String testdataXLpath=filepath+"\\src\\main\\java\\com\\econsys\\TestData\\Monorail_testdata.xls";
		 FileInputStream file = new FileInputStream(testdataXLpath);
		 HSSFWorkbook wb1 = new HSSFWorkbook(file);
		 int sheetNumber = 2;
		 HSSFSheet Firstpage=wb1.getSheetAt(sheetNumber);
		  
		 double overallCost=Firstpage.getRow(1).getCell(4).getNumericCellValue();
		 prepare_Quoteui.getOverallProjectCost().sendKeys(""+overallCost);
		  
		 overallSell=Firstpage.getRow(1).getCell(5).getNumericCellValue();
		 prepare_Quoteui.getOverallProjectSell().sendKeys(""+overallSell);
			  
		 Iterator rowIterator = Firstpage.rowIterator();	
				
		 while(rowIterator.hasNext()){
		 HSSFRow row = (HSSFRow) rowIterator.next();
		 int rowNum = row.getRowNum();
				
		 if (rowNum !=0) {
		 String cell1Value = row.getCell(0).getStringCellValue();
		       
		 double Cost = row.getCell(1).getNumericCellValue();
		          	
		 double sell = row.getCell(2).getNumericCellValue();
		           	
		 prepare_Quoteui.getAddnewpopup().click();
		 
		 prepare_Quoteui.getCostCodeCategorytextfield().sendKeys(cell1Value);
		 cu.waitForPageToLoad();
		 prepare_Quoteui.getCost().sendKeys(""+Cost);
		 prepare_Quoteui.getSell().sendKeys(""+sell);
		 Thread.sleep(1000);
		 prepare_Quoteui.getSaveAddcostsellpopup().click();
		
		 Thread.sleep(1000);
		 }
	     	 }
		 prepare_Quoteui.getBidsheet_linkfile().click();
		 projectMethods_Small_Works.linktoFileupload();
		 cu.waitForPageToLoad();
		 /*cu.selectByVisibleText(quote_form.getExpliciteapprovalatgateway2(),exeCP2);
			  
		 quote_form.getQuoteprepared().click();
		 login.logout();*/
     	 }
	 //*********SubmitQuote***********
	 public void submitandresubmit() throws IOException, InterruptedException{
		 login.loginSL();
		 b.projectname();
		 Thread.sleep(1000);
		 ccq.getComments().sendKeys("Submit Quote");
		 ccq.getSubmit().click();
		 
	     }
	//*********status Quote submit***********
	 public void statusQuotesubmit(String estimatedSize,String location) throws IOException, InterruptedException{
		 ProjectMethods_Small_Works projectMethods_Small_Works = new ProjectMethods_Small_Works();
		 //login.loginSL();
		 //String rtqType= driver.findElement(By.xpath("//tr[td[@title='"+wb.getXLData(1, 2, 1)+"']]/td[6]")).getText();
		 b.projectname();
		 Thread.sleep(500);
		 
		 log.info("quotestatuscp2cp3 : "+ev.quote_StatusCp2Cp3 );
		 cu.selectByVisibleText(ccq.getQuoteStatus(),ev.quote_StatusCp2Cp3);
		 Thread.sleep(500);
		 	if(ev.quote_StatusCp2Cp3.equals("Customer Commitment Received")){
		 		{
		 			
		 			cu.selectByVisibleText(ccq.getCustomerCommitmentType(), ev.customerCommitmentType);
		 			
		 			if(!"Verbal Commitment Received - Under Review".equals(ev.customerCommitmentType)){
		 			ccq.getUploadDoc_StatusofSubmitQuote().click();
		 			projectMethods_Small_Works.linktoFileupload();
		 			}
		 		}
		 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();
		 
		 	//customer commitment LOI received- status of submitted quote		 
		 	if(ev.customerCommitmentType.equals("LOI Received - Under Review")){
		 		Thread.sleep(1000);
		 		b.projectname();
		 		
		 		cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),ev.loi_Commencement);
		 		ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
				 			 	
		 		if(ev.loi_Commencement.equals("Yes")){
		 			
		 			cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), ev.questionsLOI);
		 			
		 			//4 questions "Yes"
		 			if(ev.questionsLOI.equals("Yes")){
			 	 		cu.waitForPageToLoad();
			 	 		driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
			 	 		ab.getLinkFileCheckbox().click();
			 			ab.getAdd_LinkfilePopup().click();
			 	 		ab.getSubmitbutton().click();
			 	 		login.logout();
			 	 		g34.clApproval();
			 	 		//g34.sdApprovalnewFlow(); this task is removed from the flow
			 	 		login.loginSL();
			 	 		g34.customercommit();
			 			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 			 
			 			 ccq.getSubmit().click();
			 			 login.logout();
			 		}

		 			//4 questions "No"
		 			if(ev.questionsLOI.equals("No")){
				 		g34.customercommitmentLOIrecived();
			 		}
		
		 		}
			 	if(ev.loi_Commencement.equals("No")){
				 ab.getSubmitbutton().click();
				 login.logout();
				 rtq.boardcp6();
				 login.loginSL();
				 g34.customercommit();
				 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
				 
				 ccq.getSubmit().click();
				 login.logout();
			 	}
		 	}
		 	if(ev.customerCommitmentType.equals("Verbal Commitment Received - Under Review")){
			 Thread.sleep(1000);
			
			 b.projectname();
			 driver.findElement(By.xpath("//input[@id='fileList_flm_verbalCommitment']")).click();
			 projectMethods_Small_Works.linktoFileupload();
	 		ab.getComments().sendKeys("Verbal Doc Uploaded");//added by Kaveri
			 ab.getSubmitbutton().click();//added by Kaveri
			 login.logout();
			 //SD approval task
			 g34.sdApproval(); 
			 //Customer commitment task
			 login.loginSL();//added by Kaveri	
			 g34.customercommit();
			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 
			 ccq.getSubmit().click();
			 login.logout();
		 	}
		
		 	else if(ev.customerCommitmentType.equals("PO Received - Under Review")||ev.customerCommitmentType.equals("Email Received - Under Review")||ev.customerCommitmentType.equals("Sub-Contract Received - Under Review"))
		 	{
			 g34.customercommit();
			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 ccq.getSubmit().click();
			 login.logout();
		 	}
		 }
		
		 
		 if(ev.quote_StatusCp2Cp3.equals("Amend Bid")){
		
		 //CP2-CP3 prepare quote	 
	     ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();	 
		 rtq.prepareQuotecp2cp3();
		 cu.selectByVisibleText(prepare_Quoteui.getExecp3(),ev.exeCP3);
		 prepare_Quoteui.getQuoteprepared().click();
		 login.logout();
		 
		 b.pathdessioncp2cp3(estimatedSize,location);
		 if((ev.ourformat.equals("Yes")&&ev.cp2cp3ourformat.equals("No"))||(ev.cp2cp3bidsheetauthorised.equals("No"))||(ev.exeCP3.equals("Yes"))){
		 rtq.board();
		 	
		 rtq.submitandresubmit();
		 //driver.quit();
		 rtq.status_Quote_Resubmit(estimatedSize,location);
		 }
		
	}

}
	//*********status Quote Re-submit***********
	 public void status_Quote_Resubmit(String estimatedSize,String location) throws IOException, InterruptedException{
		 ProjectMethods_Small_Works projectMethods_Small_Works = new ProjectMethods_Small_Works();
		 //login.loginSL();
		 cu.waitForPageToLoad();
		 b.projectname();
		 Thread.sleep(1000);
		 
		 
		 cu.selectByVisibleText(ccq.getQuoteStatus(),ev.quote_StatusCp3Cp4);
		 
		 if(ev.quote_StatusCp3Cp4.equals("Customer Commitment Received")){ 
		 {
			 Thread.sleep(1000);
			 
			 cu.selectByVisibleText(ccq.getCustomerCommitmentType(), ev.customerCommitmentType);
			 
			 if("Verbal Commitment Received - Under Review" != ev.customerCommitmentType){
				 ccq.getUploadDoc_StatusofSubmitQuote().click();
				 projectMethods_Small_Works.linktoFileupload();
		 		 }
		 }
		 ab.getComments().sendKeys("Quote status");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 
		//customer commitment LOI received- status of Re-submitted quote
		 if(ev.customerCommitmentType.equals("LOI Received - Under Review"))
		 {
			 b.projectname();
			 cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),ev.loi_Commencement);
			 ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
			 			 	
			 if(ev.loi_Commencement.equals("Yes")){
			 	
			 	cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), ev.questionsLOI);
			 	 		
			 	if(ev.questionsLOI.equals("Yes")){
			 		cu.waitForPageToLoad();
			 		driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
			 		projectMethods_Small_Works.linktoFileupload();
		 	 		ab.getSubmitbutton().click();
		 	 		login.logout();
		 	 		g34.clApproval();
		 	 		//g34.sdApprovalnewFlow(); this task is removed from the flow
		 	 		login.loginSL();
		 	 		g34.customercommit();
		 			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
		 			 
		 			 ccq.getSubmit().click();
		 			 login.logout();
		 	 	}//input[@id='flm_att_0multifile_hidden_LoiDocs']
			 	 		
			  	//4 questions "No"
			 	else if(ev.questionsLOI.equals("No")){
			  		g34.customercommitmentLOIrecived();
			  	}
			 }
			 
			 else if(ev.loi_Commencement.equals("No")){
				 ab.getSubmitbutton().click();
				 login.logout();
				 rtq.boardcp6();
				 login.loginSL();
				 g34.customercommit();
				 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
				 
				 ccq.getSubmit().click();
				 login.logout();
			 }
		 }
		 if(ev.customerCommitmentType.equals("Verbal Commitment Received - Under Review"))
		 {
			 b.projectname();
			 driver.findElement(By.xpath("//input[@id='fileList_flm_verbalCommitment']")).click();
			 projectMethods_Small_Works.linktoFileupload();
			 ab.getSubmitbutton().click();
			 //SD approval task
			 g34.sdApproval();
			 //Customer commitment task
			 g34.customercommit();
			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 
			 ccq.getSubmit().click();
			 login.logout();
		 }
		 else if(ev.customerCommitmentType.equals("PO Received - Under Review")||ev.customerCommitmentType.equals("Email Received - Under Review")||ev.customerCommitmentType.equals("Sub-Contract Received - Under Review"))
		 {
			 g34.customercommit();
			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 
			 ccq.getSubmit().click();
			 login.logout();
		 }
	  	}
		 //******Amend bid******
		 if(ev.quote_StatusCp3Cp4.equals("Amend Bid")){
		 	 
		 rtq.prepareQuotecp2cp3();
		 b.pathdessioncp2cp3(estimatedSize,location);
		 
		 	if((ev.ourformat.equals("Yes")&&ev.cp2cp3ourformat.equals("No"))||(ev.cp2cp3bidsheetauthorised.equals("No"))||(ev.exeCP3.equals("Yes"))){
		 		rtq.board();
			}
		 
		 rtq.submitandresubmit();
				
		 rtq.status_Quote_Resubmit(estimatedSize,location);
		 }
	 }
	 
public void statusQuotesubmit(String customerCommitmentType) throws IOException, InterruptedException{
	ProjectMethods_Small_Works projectMethods_Small_Works = new ProjectMethods_Small_Works();
		 //login.loginSL();
		 cu.waitForPageToLoad();
		 // String rtqType= driver.findElement(By.xpath("//tr[td[@title='"+wb.getXLData(1, 2, 1)+"']]/td[6]")).getText();
		 b.projectname();
		 Thread.sleep(1000);
		 log.info("quotestatuscp2cp3 : "+ev.quote_StatusCp2Cp3 );
		 cu.selectByVisibleText(ccq.getQuoteStatus(),ev.quote_StatusCp2Cp3);
		 Thread.sleep(1000);
		 	if(ev.quote_StatusCp2Cp3.equals("Customer Commitment Received")){
		 		{
		 			cu.selectByVisibleText(ccq.getCustomerCommitmentType(), customerCommitmentType);
		 			
		 			if(!"Verbal Commitment Received - Under Review".equals(customerCommitmentType)){
		 			ccq.getUploadDoc_StatusofSubmitQuote().click();
		 			projectMethods_Small_Works.linktoFileupload();
		 			}
		 		}
		 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();
		 
		 	//customer commitment LOI received- status of submitted quote		 
		 	if(customerCommitmentType.equals("LOI Received - Under Review")){
		 		Thread.sleep(1000);
		 		b.projectname();
		 		
		 		cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),ev.loi_Commencement);
		 		ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
				 			 	
		 		if(ev.loi_Commencement.equals("Yes")){
		 			
		 			cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), ev.questionsLOI);
		 			
		 			//4 questions "Yes"
		 			if(ev.questionsLOI.equals("Yes")){
			 	 		cu.waitForPageToLoad();
			 	 		driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
			 	 		projectMethods_Small_Works.linktoFileupload();
			 	 		ab.getSubmitbutton().click();
			 	 		login.logout();
			 	 		g34.clApproval();
			 	 		//g34.sdApprovalnewFlow(): this task is removed from the flow
			 	 		login.loginSL();
			 	 		g34.customercommit();
			 			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 			 
			 			 ccq.getSubmit().click();
			 			 login.logout();
			 		}

		 			//4 questions "No"
		 			if(ev.questionsLOI.equals("No")){
				 		g34.customercommitmentLOIrecived();
			 		}
		
		 		}
			 	if(ev.loi_Commencement.equals("No")){
				 ab.getSubmitbutton().click();
				 login.logout();
				 rtq.boardcp6();
				 login.loginSL();
				 g34.customercommit();
			 	}
		 	}
		 	if(customerCommitmentType.equals("Verbal Commitment Received - Under Review")){
			 Thread.sleep(1000);
			
			 b.projectname();
			 driver.findElement(By.xpath("//input[@id='fileList_flm_verbalCommitment']")).click();
			 projectMethods_Small_Works.linktoFileupload();
	 		ab.getComments().sendKeys("Verbal Doc Uploaded");//added by Kaveri
			 ab.getSubmitbutton().click();//added by Kaveri
			 login.logout();
			 //SD approval task
			 g34.sdApproval(); 
			 //Customer commitment task
			 login.loginSL();//added by Kaveri	
			 g34.customercommit();
			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 
			 ccq.getSubmit().click();
			 login.logout();
		 	}
		
		 	else if(customerCommitmentType.equals("PO Received - Under Review")||customerCommitmentType.equals("Email Received - Under Review")||customerCommitmentType.equals("Sub-Contract Received - Under Review"))
		 	{
			 g34.customercommit();
			 cu.selectByVisibleText(ccq.getExeCP4(), ev.execp4);
			 
			 ccq.getSubmit().click();
			 login.logout();
		 	}
		 }
		
		 
		 if(ev.quote_StatusCp2Cp3.equals("Amend Bid")){
		
	 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();	 
		 rtq.prepareQuotecp2cp3();
		 prepare_Quoteui.getQuoteprepared().click();
		 login.logout();
		 b.pathdessioncp2cp3(ev.estimatedSize,ev.location);
		 if((ev.ourformat.equals("Yes")&&ev.cp2cp3ourformat.equals("No"))||(ev.cp2cp3bidsheetauthorised.equals("No"))||(ev.exeCP3.equals("Yes"))){
		 rtq.board();
		 	
		 rtq.submitandresubmit();
		 rtq.status_Quote_Resubmit(ev.estimatedSize,ev.location);
		 }
		
	}
	 }
	 
	 //Prepare quote Cp2-Cp3
	 public void prepareQuotecp2cp3() throws IOException, InterruptedException{
		 ProjectMethods_Small_Works projectMethods_Small_Works = new ProjectMethods_Small_Works(); 
		 cu.waitForPageToLoad();		 	 
		 b.projectname();
		 cu.selectByVisibleText(prepare_Quoteui.getCp2cp3gaformat(), ev.cp2cp3ourformat);
		 /*quote_form.getCp2cp3riskregisterdoc().sendKeys(filepath+"\\Documentsuploded\\cp2-ap3 Risk Register (Example).xlsx");
		 quote_form.getCp2cp3quotedoc().sendKeys(filepath+"\\Documentsuploded\\cp2-cp3 quote doc.xlsx");
		 */
		 driver().findElement(By.xpath("//div[@id='upl_fl_flm_bidSheet0']/div[2]/a")).click();
		 prepare_Quoteui.getCp2cp3biddoc().click();
		 projectMethods_Small_Works.linktoFileupload();
		 cu.selectByVisibleText(prepare_Quoteui.getCp2cp3bidsheet(), ev.cp2cp3bidsheetauthorised);
		 ab.getComments().sendKeys("cp2-cp3 prepare quote");
		 /*cu.selectByVisibleText(quote_form.getExecp3(),exeCP3);
		 quote_form.getQuoteprepared().click();
		 login.logout();*/
		 
	 }
	 //*********Board*********
	 public void board() throws IOException, InterruptedException{
		 login.loginboard();
		 Thread.sleep(1000);
		 driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		 b.projectname_ReviewApproval();
		 Thread.sleep(1000);
		 ab.getComments().sendKeys("Board");
		 ab.getBoardapprovebutton().click();
		 login.logout();
	 }
     public void boardcp4() throws IOException, InterruptedException{
    	 login.loginboard();
		 Thread.sleep(1000);
		 driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		 b.projectname_ReviewApproval();
		 Thread.sleep(1000);
		 //Authorize commence ment check at CP4
		 
		 cu.selectByVisibleText(driver().findElement(By.xpath("//select[@id='st_authoriseCommencement']")), ev.atherize);	 
		 cu.waitForPageToLoad();
		 ab.getComments().sendKeys("Board");
		 ab.getBoardapprovebutton().click();
		 login.logout();
	 }
     public void boardcp6() throws IOException, InterruptedException{
    	 login.loginboard();
	     Thread.sleep(1000);
	     driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	     b.projectname_ReviewApproval();
	     Thread.sleep(1000);
	     ab.getComments().sendKeys("Board");
	     driver().findElement(By.xpath("//input[@value='Approve']")).click();
	     login.logout();
     }
     
	}