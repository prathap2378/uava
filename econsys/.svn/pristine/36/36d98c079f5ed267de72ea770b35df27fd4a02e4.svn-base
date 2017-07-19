package adminpage;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.ActionButtonsUi;
import com.UIobjectrepositary.in.Assignsalesleader;
import com.UIobjectrepositary.in.CosCommitQuoteStatusUi;
import com.UIobjectrepositary.in.Preparequote;
import com.UIobjectrepositary.in.RtqFormUIodj;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;


public class Monorail extends Driver {
	private static Logger log = Logger.getLogger(Monorail.class.getName());
	//Page UI classes
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RtqFormUIodj nrtq=PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	
	//import classes
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	static Basic b=new Basic();
	static Login login=new Login();
	static TasksCP5toCP9 pdop=new TasksCP5toCP9();
	
	//Variables
	public static String estimatedSize;
	public static String location;
	static String ourformat=null;
	static String cp2cp3ourformat=null;
	static String bidsheetauthorised=null;
	static String cp2cp3bidsheetauthorised=null;
	static String exeCP2=null;
	static String exeCP3=null;
	static String cusrecivedas=null;
	static String scope=null;
	static String docrefrence=null;
	static String termsandcond=null;
	static String startdate=null;
	static String endate=null;
	static String clarification=null;
	static String docsatis=null;
	static String execp4=null;
	static String exe=null;
	static String exeCP5=null;
	static String draftproduced=null;
	static int num;
	String filepath=System.getProperty("user.dir");
	String customerCommitmentType;
	
	@Test(invocationCount = 1,threadPoolSize = 1)
	//invocationCount = 10,threadPoolSize = 1
	public void test1() throws IOException, InterruptedException, AWTException {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		monorailTestFlow();
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
	
	//Test method
	public static void monorailTestFlow() throws IOException, InterruptedException, AWTException {
		//******URL&&&&&&&&&
		String url=wb.getXLData(1, 3, 0);
		login.url(url);
		//driver.manage().deleteAllCookies();
		//wb.setXLData(10, 10, 0);
		
		//*****Login as genral user******
		Thread.sleep(1000);
		String un=wb.getXLData(1,0, 0);
		String pwd=wb.getXLData(1, 1, 0);
		login.user(un,pwd);
		
		//***********RTQ inputs
		estimatedSize=wb.getXLData(8, 1, 1);
		location=wb.getXLData(9,2,1);
		//*****Prepare quote inputs*********
		ourformat=wb.getXLData(2, 5, 0);
		bidsheetauthorised=wb.getXLData(4, 5, 0);
		exeCP2=wb.getXLData(6, 5, 0);
		//Customer commitment inputs
		cusrecivedas=wb.getXLData(2,7, 0);
		scope=wb.getXLData(4,7, 0);
		docrefrence=wb.getXLData(6,7, 0);
		termsandcond=wb.getXLData(8,7, 0);
		startdate=wb.getXLData(10,7, 0);
		endate=wb.getXLData(12,7, 0);
		execp4=wb.getXLData(18,7, 0);
		docsatis=wb.getXLData(16,7, 0);
		clarification=wb.getXLData(14,7,0);
		//CP5 varibles for approval conditions
		draftproduced=wb.getXLData(2,9, 0);
		exe=wb.getXLData(24,7, 0);
		exeCP5=wb.getXLData(8, 9, 0);
        //CP6 variables
		String execp6=wb.getXLData(4, 11, 0);
		//CP8 variables 
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
		
		//****intiation of rtq form*********
		b.rtqForm();
		
		//***********CP1 exe dession************
		if((estimatedSize.equals("D 500+"))||(location.equals("Other"))) {
			rtq.board();
		}
		//rtq.ASL();
		/*driver.close();*/
		rtq.preparequote();
		b.pathdession();
		//**********CP2 exe dession**************
		if((ourformat.equals("No"))||(bidsheetauthorised.equals("No"))||(exeCP2.equals("Yes"))){
			rtq.board();
		}
		rtq.submitandresubmit();
		rtq.statusQuotesubmit();
		if((cusrecivedas.equals("Verbal"))||(startdate.equals("No"))||(endate.equals("No"))){
			g34.sdApproval();
		}
		if(((cusrecivedas.equals("Email"))||(cusrecivedas.equals("Sub Contract"))||(cusrecivedas.equals("Purchase Order"))||(cusrecivedas.equals("Letter of Intent")))&&(docsatis.equals("No"))&&(startdate.equals("Yes"))&&(endate.equals("Yes"))){
		   g34.tandcreview();
		   g34.operationreview();
		}
		//**********CP4 exe dession**************
		/*if((scope.equals("No"))||(docrefrence.equals("No"))||(termsandcond.equals("No")||(execp4.equals("Yes")))){
			rtq.boardcp4();
		}*/
		//**********CP4 exe dession New Flow**************
		if((clarification.equals("No"))||(execp4.equals("Yes"))){
			rtq.boardcp4();
		}		
		g45.apointkeystaf();
		g45.commerSuit();
        g45.salestoOperation();
        g45.operationAcceptance();
		//**********CP5 exe dession **********
        if(exe.equals("Yes")||(exeCP5.equals("Yes")||(draftproduced.equals("No")))){
			rtq.board();
		}
        //driver.close();
		pdop.pdp();
		//**********CP6 exe dession **********
		if(execp6.equals("Yes")){
			rtq.boardcp6();
		}
		driver.close();
		pdop.deveryreview();
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
	
		//***************Assign sales leader task **************
	 public void ASL() throws InterruptedException, IOException {
		 
		  login.loginSD();
		  Thread.sleep(1000);
	   	  ab.getViewalltasks().click();
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
	 public void preparequote() throws InterruptedException, IOException {
		  
		 login.loginSL();
		 Thread.sleep(1000);	 
		 ab.getViewalltasks().click();
		 b.projectname();
		 Thread.sleep(1000);
		 ourformat=wb.getXLData(2, 5, 0);
		 cu.selectByVisibleText(pq.getQuotationonourFormat(), ourformat);
		 
		 cu.waitForPageToLoad();
		 pq.getQuotedocument_Linkfile().click();
		 ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();
		 cu.waitForPageToLoad();
		 pq.getBidsheet_linkfile().click();
		 ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();
		 cu.waitForPageToLoad();
		 pq.getRiskopportunityregister_Linkfile().click();
		 ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();
		 
		 bidsheetauthorised=wb.getXLData(4, 5, 0);
		 cu.selectByVisibleText(pq.getBidSheetAuthorised(), bidsheetauthorised);
		  
		 pq.getComments().sendKeys("Prepare Quote");

		 //Reading cost and sell values
		 String testdataXLpath=filepath+"//src//com//testdata//in//Monorail_testdata.xls";
		 FileInputStream file = new FileInputStream(testdataXLpath);
		 HSSFWorkbook wb1 = new HSSFWorkbook(file);
		 int sheetname=2;
		 HSSFSheet Firstpage=wb1.getSheetAt(sheetname);
		  
		 double overallCost=Firstpage.getRow(1).getCell(4).getNumericCellValue();
		 pq.getOverallProjectCost().sendKeys(""+overallCost);
		  
		 double overallSell=Firstpage.getRow(1).getCell(5).getNumericCellValue();
		 pq.getOverallProjectSell().sendKeys(""+overallSell);
			  
		 Iterator rowIterator = Firstpage.rowIterator();	
				
		 while(rowIterator.hasNext()){
		 HSSFRow row = (HSSFRow) rowIterator.next();
		 int rowNum = row.getRowNum();
				
				
		 if (rowNum !=0) {
		 String cell1Value = row.getCell(0).getStringCellValue();
		       
		 double Cost = row.getCell(1).getNumericCellValue();
		          	
		 double sell = row.getCell(2).getNumericCellValue();
		           	
		 pq.getAddnewpopup().click();
		 pq.getCostCodeCategorytextfield().sendKeys(cell1Value);
		 cu.waitForPageToLoad();
		 pq.getCost().sendKeys(""+Cost);
		 pq.getSell().sendKeys(""+sell);
		 Thread.sleep(1000);
		 pq.getSaveAddcostsellpopup().click();
		
		 Thread.sleep(1000);
		 }
	     	 }
		 exeCP2=wb.getXLData(6, 5, 0);
		 cu.selectByVisibleText(pq.getExpliciteapprovalatgateway2(),exeCP2);
			  
		 pq.getQuoteprepared().click();
		 login.logout();
     	 }
	 
	 //*********SubmitQuote***********
	 public void submitandresubmit() throws IOException, InterruptedException{
		 login.loginSL();
		 cu.waitForPageToLoad();
		 ab.getViewalltasks().click();
		 b.projectname();
		 Thread.sleep(1000);
		 ccq.getComments().sendKeys("Submit Quote");
		 ccq.getSubmit().click();
		 Thread.sleep(1000);
	     }
	//*********status Quote submit***********
	 public void statusQuotesubmit() throws IOException, InterruptedException{
		 cu.waitForPageToLoad();
		 ab.getViewalltasks().click();
		 b.projectname();
		 Thread.sleep(1000);
		 String quotestatuscp2cp3=wb.getXLData(9,5, 0);
		 cu.selectByVisibleText(ccq.getQuoteStatus(),quotestatuscp2cp3);
		 Thread.sleep(1000);
		 	if(quotestatuscp2cp3.equals("Customer Commitment Received")){
		 		{
		 			customerCommitmentType=wb.getXLData(9, 3, 0);
		 			cu.selectByVisibleText(ccq.getCustomerCommitmentType(), customerCommitmentType);
		 			
		 			if("Verbal Commitment Received - Under Review" != customerCommitmentType){
		 			ccq.getUploadDoc_StatusofSubmitQuote().click();
		 			ab.getLinkFileCheckbox().click();
		 			ab.getAdd_LinkfilePopup().click();
		 			}
		 		}
		 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();
		 
		 	//customer commitment LOI received- status of submitted quote		 
		 	if(customerCommitmentType.equals("LOI Received - Under Review")){
		 		ab.getViewalltasks().click();
		 		b.projectname();
		 		String loicommencement=wb.getXLData(11,3,0);
		 		cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),loicommencement);
		 		ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
				 			 	
		 		if(loicommencement.equals("Yes")){
		 			String questionsLOI=wb.getXLData(13,3,0);
		 			cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), questionsLOI);
		 			
		 			//4 questions "Yes"
		 			if(questionsLOI.equals("Yes")){
			 	 		cu.waitForPageToLoad();
			 	 		driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
			 	 		ab.getLinkFileCheckbox().click();
			 			ab.getAdd_LinkfilePopup().click();
			 	 		ab.getSubmitbutton().click();
			 	 		login.logout();
			 	 		g34.clApproval();
			 	 		g34.sdApprovalnewFlow();
			 	 		login.loginSL();
			 	 		g34.customercommit();
			 		}

		 			//4 questions "No"
		 			if(questionsLOI.equals("No")){
				 		g34.customercommitmentLOIrecived();
			 		}
			 	}
			 	if(loicommencement.equals("No")){
				 ab.getSubmitbutton().click();
				 login.logout();
				 rtq.boardcp6();
				 login.loginSL();
				 g34.customercommit();
			 	}
		 	}
		 	if(customerCommitmentType.equals("Verbal Commitment Received - Under Review")){
			 ab.getViewalltasks().click();
			 b.projectname();
			 driver.findElement(By.xpath("//input[@id='fileList_flm_verbalCommitment']")).click();
			 ab.getLinkFileCheckbox().click();
	 		 ab.getAdd_LinkfilePopup().click();
			 ab.getSubmitbutton().click();
			 //SD approval task
			 g34.sdApproval();
			 //Customer commitment task
			 g34.customercommit();
		 	}
		
		 	else if(customerCommitmentType.equals("PO Received - Under Review")||customerCommitmentType.equals("Email Received - Under Review")||customerCommitmentType.equals("Sub-Contract Received - Under Review"))
		 	{
			 g34.customercommit();
		 	}
		 }
		 
		 if(quotestatuscp2cp3.equals("Amend Bid")){
		
		 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();	 
		 rtq.prepareQuotecp2cp3();
		 b.pathdessioncp2cp3();
		 if((ourformat.equals("Yes")&&cp2cp3ourformat.equals("No"))||(cp2cp3bidsheetauthorised.equals("No"))||(exeCP3.equals("Yes"))){
		 rtq.board();
		 	}
		 rtq.submitandresubmit();
		 rtq.statusQuoteresubmit();
		 	}
	     }
	//*********status Quote Re-submit***********
	 public void statusQuoteresubmit() throws IOException, InterruptedException{
		 cu.waitForPageToLoad();
		 ab.getViewalltasks().click();
		 b.projectname();
		 Thread.sleep(1000);
		 
		 String quotestatuscp3cp4=wb.getXLData(10,5, 0);
		 cu.selectByVisibleText(ccq.getQuoteStatus(),quotestatuscp3cp4);
		 
		 if(quotestatuscp3cp4.equals("Customer Commitment Received")){ 
		 {
			 Thread.sleep(1000);
			 customerCommitmentType=wb.getXLData(9,3,0);
			 cu.selectByVisibleText(ccq.getCustomerCommitmentType(), customerCommitmentType);
			 
			 if("Verbal Commitment Received - Under Review" != customerCommitmentType){
				 ccq.getUploadDoc_StatusofSubmitQuote().click();
		 		 ab.getLinkFileCheckbox().click();
		 		 ab.getAdd_LinkfilePopup().click();
		 		 }
		 }
		 ab.getComments().sendKeys("Quote status");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 
		//customer commitment LOI received- status of Re-submitted quote
		 if(customerCommitmentType.equals("LOI Received - Under Review"))
		 {
			 ab.getViewalltasks().click();
			 b.projectname();
			 String loicommencement=wb.getXLData(11,3,0);
			 cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),loicommencement);
			 ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
			 			 	
			 if(loicommencement.equals("Yes")){
			 	String questionsLOI=wb.getXLData(13,3,0);
			 	cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), questionsLOI);
			 	 		
			 	if(questionsLOI.equals("Yes")){
			 		cu.waitForPageToLoad();
			 		driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
		 	 		ab.getLinkFileCheckbox().click();
		 			ab.getAdd_LinkfilePopup().click();
		 	 		ab.getSubmitbutton().click();
		 	 		login.logout();
		 	 		g34.clApproval();
		 	 		g34.sdApprovalnewFlow();
		 	 		login.loginSL();
		 	 		g34.customercommit();
		 	 	}//input[@id='flm_att_0multifile_hidden_LoiDocs']
			 	 		
			  	//4 questions "No"
			 	else if(questionsLOI.equals("No")){
			  		g34.customercommitmentLOIrecived();
			  	}
			 }
			 
			 else if(loicommencement.equals("No")){
				 ab.getSubmitbutton().click();
				 login.logout();
				 rtq.boardcp6();
				 login.loginSL();
				 g34.customercommit();
			 }
		 }
		 if(customerCommitmentType.equals("Verbal Commitment Received - Under Review"))
		 {
			 ab.getViewalltasks().click();
			 b.projectname();
			 driver.findElement(By.xpath("//input[@id='fileList_flm_verbalCommitment']")).click();
			 ab.getLinkFileCheckbox().click();
	 		 ab.getAdd_LinkfilePopup().click();
			 ab.getSubmitbutton().click();
			 //SD approval task
			 g34.sdApproval();
			 //Customer commitment task
			 g34.customercommit();
		 }
		 else if(customerCommitmentType.equals("PO Received - Under Review")||customerCommitmentType.equals("Email Received - Under Review")||customerCommitmentType.equals("Sub-Contract Received - Under Review"))
		 {
			 g34.customercommit();
		 }
	  	}
		 //******Amend bid******
		 if(quotestatuscp3cp4.equals("Amend Bid")){
		 	 
		 rtq.prepareQuotecp2cp3();
		 b.pathdessioncp2cp3();
		 
		 	if((ourformat.equals("Yes")&&cp2cp3ourformat.equals("No"))||(cp2cp3bidsheetauthorised.equals("No"))||(exeCP3.equals("Yes"))){
		 		rtq.board();
			}
		 
		 rtq.submitandresubmit();
				
		 rtq.statusQuoteresubmit();
		 }
	 }
	 //Prepare quote Cp2-Cp3
	 public void prepareQuotecp2cp3() throws IOException, InterruptedException{
			
		 cp2cp3ourformat=wb.getXLData(13, 5, 0);
		 cp2cp3bidsheetauthorised=wb.getXLData(15,5, 0);
		 exeCP3=wb.getXLData(17,5, 0);
		 cu.waitForPageToLoad();		 	 
		 ab.getViewalltasks().click();
		 b.projectname();
		 cu.selectByVisibleText(pq.getCp2cp3gaformat(), cp2cp3ourformat);
		 /*pq.getCp2cp3riskregisterdoc().sendKeys(filepath+"\\Documentsuploded\\cp2-ap3 Risk Register (Example).xlsx");
		 pq.getCp2cp3quotedoc().sendKeys(filepath+"\\Documentsuploded\\cp2-cp3 quote doc.xlsx");
		 */
		 driver().findElement(By.xpath("//div[@id='upl_fl_flm_bidSheet0']/div[2]/a")).click();
		 pq.getCp2cp3biddoc().click();
		 ab.getLinkFileCheckbox().click();
 		 ab.getAdd_LinkfilePopup().click();
		 cu.selectByVisibleText(pq.getCp2cp3bidsheet(), cp2cp3bidsheetauthorised);
		 ab.getComments().sendKeys("cp2-cp3 prepare quote");
		 cu.selectByVisibleText(pq.getExecp3(),exeCP3);
		 pq.getQuoteprepared().click();
		 login.logout();
		 
	 }
	 //*********Board*********
	 public void board() throws IOException, InterruptedException{
		 login.board();
		 Thread.sleep(1000);
		 driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		 b.projectnameboard();
		 Thread.sleep(1000);
		 ab.getComments().sendKeys("Board");
		 ab.getBoardapprovebutton().click();
		 login.logout();
	 }
     public void boardcp4() throws IOException, InterruptedException{
		 login.board();
		 Thread.sleep(1000);
		 driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		 b.projectnameboard();
		 Thread.sleep(1000);
		 //Authorize commence ment check at CP4
		 String atherize=wb.getXLData(11,9, 0);
		 cu.selectByVisibleText(driver().findElement(By.xpath("//select[@id='st_authoriseCommencement']")), atherize);	 
		 cu.waitForPageToLoad();
		 ab.getComments().sendKeys("Board");
		 ab.getBoardapprovebutton().click();
		 login.logout();
	 }
     public void boardcp6() throws IOException, InterruptedException{
	     login.board();
	     Thread.sleep(1000);
	     driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	     b.projectnameboard();
	     Thread.sleep(1000);
	     ab.getComments().sendKeys("Board");
	     driver().findElement(By.xpath("//input[@value='Approve']")).click();
	     login.logout();
     }
	}