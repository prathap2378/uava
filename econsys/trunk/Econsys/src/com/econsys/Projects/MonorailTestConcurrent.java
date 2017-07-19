package com.econsys.Projects;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class MonorailTestConcurrent extends Driver {
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
	
	

	@Test
	public void test1() throws IOException, InterruptedException, AWTException {
		
		monorailTestFlow();
	}
	
	@Test
	public void test2() throws IOException, InterruptedException, AWTException {
		
		monorailTestFlow();
	}
	
	@Test
	public void test3() throws IOException, InterruptedException, AWTException {
		
		monorailTestFlow();
	}

	public static void monorailTestFlow() throws IOException, InterruptedException, AWTException {
		
		//******URL&&&&&&&&&
				login.url();
				//driver().manage().deleteAllCookies();
				//wb.setXLData(10, 10, 0);
				//*****Login as genral user******
				login.user();
						
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
						
				//****intiation of rtq form*********
				b.rtqForm();
				
				//***********CP1 exe dession************
				if((estimatedSize.equals("D 500+"))||(location.equals("Other"))) {
				
					rtq.board();
				
				}
				
				rtq.ASL();
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
				if((scope.equals("No"))||(docrefrence.equals("No"))||(termsandcond.equals("No")||(execp4.equals("Yes")))){
					
					rtq.boardcp4();
				}
				
				   g45.apointkeystaf();
				   
				   g45.commerSuit();
				
				   g45.salestoOperation();
				
				   g45.operationAcceptance();
				
				//CP5 varibles for approval conditions
				   draftproduced=wb.getXLData(2,9, 0);
				   exe=wb.getXLData(24,7, 0);
				   exeCP5=wb.getXLData(8, 9, 0);
				if(exe.equals("Yes")||(exeCP5.equals("Yes")||(draftproduced.equals("No")))){
			 		  rtq.board();
			 	  }
				
				//driver().quit();
				pdop.pdp();
				String execp6=wb.getXLData(4, 11, 0);
				if(execp6.equals("Yes")){
					rtq.boardcp6();
				}
				//driver().quit();
				pdop.deveryreview();
				
				String certificateobtained=wb.getXLData(6,11, 0);
				String retationapplied=wb.getXLData(8,11, 0);
				String onmSubmitted=wb.getXLData(10,11, 0);
				String snagListIdentified=wb.getXLData(12,11, 0);
				String internalCompletionDocument=wb.getXLData(14,11, 0);
				String execp8=wb.getXLData(16,11, 0);
				
				pdop.obtainpracticalcomplition();
				
				if(certificateobtained.equals("No")||retationapplied.equals("No")||onmSubmitted.equals("No")||snagListIdentified.equals("No")||internalCompletionDocument.equals("No")||execp8.equals("Yes")){
					rtq.boardcp6();
				}
				
				pdop.postpracticalcomplition();
				
				String finalAccountAgreement=wb.getXLData(18,11, 0);
				String finalRetentionPaid=wb.getXLData(20,11, 0);
				String projectDocumentArchived=wb.getXLData(22,11, 0);
				String projectDebrief=wb.getXLData(18,11, 0);
				String subContractAccountSettled=wb.getXLData(1,12, 0);
				String closureofProject=wb.getXLData(3,12, 0);
				String bondsGuarantees_Resolved=wb.getXLData(5,12, 0);
				String execp9=wb.getXLData(7,12, 0);
				
				if(finalAccountAgreement.equals("No")||finalRetentionPaid.equals("No")||projectDocumentArchived.equals("No")||projectDebrief.equals("No")||subContractAccountSettled.equals("No")||closureofProject.equals("No")||bondsGuarantees_Resolved.equals("No")||execp9.equals("Yes")){
					rtq.boardcp6();
				}
	}
	
		//***************Assign sales leader task **************
	 public void ASL() throws InterruptedException, IOException {
		 
		 login.loginSD();
		  
	   	  ab.getViewalltasks().click();
	   	  b.projectname();
		  
	   	  cu.waitForPageToLoad();
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
		  Thread.sleep(2000);
		  login.logout();
		  
		}
	 
	 //********Prepare Quote task***********
	 public void preparequote() throws InterruptedException, IOException {
		  
		 login.loginSL();
			 
		 	ab.getViewalltasks().click();
		 	 b.projectname();
			 
		 	/*Thread.sleep(1000);
		 	ab.getViewalltasks().click();*/
			 ourformat=wb.getXLData(2, 5, 0);
			 cu.selectByVisibleText(pq.getQuotationonourFormat(), ourformat);
			 
			 bidsheetauthorised=wb.getXLData(4, 5, 0);
			 cu.selectByVisibleText(pq.getBidSheetAuthorised(), bidsheetauthorised);
			 //pq.getRiskopportunityregister().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\Copy of Panel Production Schedule Template.xlsx");
			// pq.getQuotedocument().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\G1 Request to Quote - Procedure.docx");
			 //pq.getBidsheet().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\G1 RtQ rev01_120220 amended.xlsx");
			  		  	  
			  pq.getComments().sendKeys("Prepare Quote");

			  //Reading cost and sell values
			  String XLpath=PropertiesUtil.getPropValues("Path_TestData");
			  FileInputStream file = new FileInputStream(XLpath);
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
			  System.out.println("savig");
			  pq.getSaveAddcostsellpopup().click();
			  System.out.println("savig");
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
		 
		 ab.getViewalltasks().click();
		 b.projectname();
		 /*Thread.sleep(1000);
		 ab.getViewalltasks().click();*/
		ccq.getComments().sendKeys("Submit Quote");
		ccq.getSubmit().click();
		
	 }
	 
	//*********statusQuotesubmitandresubmit***********
	 public void statusQuotesubmit() throws IOException, InterruptedException{
		 
		 ab.getViewalltasks().click();
		 b.projectname();
		 
		 String quotestatuscp2cp3=wb.getXLData(9,5, 0);
		 cu.selectByVisibleText(ccq.getQuoteStatus(),quotestatuscp2cp3);
		 
		 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();
		 		 
		 if(quotestatuscp2cp3.equals("Amend Bid")){
			 
			 rtq.prepareQuotecp2cp3();
			 b.pathdessioncp2cp3();
			 
			 if((ourformat.equals("Yes")&&cp2cp3ourformat.equals("No"))||(cp2cp3bidsheetauthorised.equals("No"))||(exeCP3.equals("Yes"))){
					rtq.board();
				}
			 rtq.submitandresubmit();
				
			 rtq.statusQuoteresubmit();
			
		 }
		 else if(quotestatuscp2cp3.equals("Customer Commitment Received")){
			 			 
			 g34.customercommit();
		 }
		 
		 
	 }
	 
	 public void statusQuoteresubmit() throws IOException, InterruptedException{
		 ab.getViewalltasks().click();
		 b.projectname();
		 
		 String quotestatuscp3cp4=wb.getXLData(10,5, 0);
		 cu.selectByVisibleText(ccq.getQuoteStatus(),quotestatuscp3cp4);
		 
		 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();
		 		 
		 if(quotestatuscp3cp4.equals("Amend Bid")){
			 
			 rtq.prepareQuotecp2cp3();
			 b.pathdessioncp2cp3();
			 
			 if((ourformat.equals("Yes")&&cp2cp3ourformat.equals("No"))||(cp2cp3bidsheetauthorised.equals("No"))||(exeCP3.equals("Yes"))){
					rtq.board();
				}
			 rtq.submitandresubmit();
				
			 rtq.statusQuoteresubmit();
				
		 }
		 else if(quotestatuscp3cp4.equals("Customer Commitment Received")){
			 			 
			 g34.customercommit();
		 }
	 }
	 
	 //Prepare quote Cp2-Cp3
	 public void prepareQuotecp2cp3() throws IOException, InterruptedException{
			
		 cp2cp3ourformat=wb.getXLData(13, 5, 0);
		 cp2cp3bidsheetauthorised=wb.getXLData(15,5, 0);
		 exeCP3=wb.getXLData(17,5, 0);
		 		 	 
		 ab.getViewalltasks().click();
		 b.projectname();
		 
		 cu.selectByVisibleText(pq.getCp2cp3gaformat(), cp2cp3ourformat);
		 
		 /*pq.getCp2cp3riskregisterdoc().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\cp2-ap3 Risk Register (Example).xlsx");
		 pq.getCp2cp3quotedoc().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\cp2-cp3 quote doc.xlsx");
		 */
		 driver().findElement(By.xpath("//div[@id='bidSheet_Span']/table/tbody/tr/td[2]/a/u")).click();
		 pq.getCp2cp3biddoc().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\cp2-cp3 bid sheet.xlsx");
		 cu.selectByVisibleText(pq.getCp2cp3bidsheet(), cp2cp3bidsheetauthorised);
		 
		 ab.getComments().sendKeys("cp2-cp3 prepare quote");
		 cu.selectByVisibleText(pq.getExecp3(),exeCP3);
		 pq.getQuoteprepared().click();
		 login.logout();
		 
	 }
	 
	 
	 //*********Board*********
	 public void board() throws IOException, InterruptedException{
		 
		 login.loginboard();
		 		 
		 driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		 b.projectnameboard();
		
		 ab.getComments().sendKeys("Board");
		 ab.getBoardapprovebutton().click();
		 login.logout();
	 }
	 
public void boardcp4() throws IOException, InterruptedException{
		 
		 login.loginboard();
		 
		 driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		 b.projectnameboard();
		
		 //Authorize commence ment check at CP4
		 String atherize=wb.getXLData(11,9, 0);
		 cu.selectByVisibleText(driver().findElement(By.xpath("//select[@id='st_authoriseCommencement']")), atherize);	 
		
		 ab.getComments().sendKeys("Board");
		 ab.getBoardapprovebutton().click();
		 login.logout();
	 }

public void boardcp6() throws IOException, InterruptedException{
	 
	 login.loginboard();
	 		 
	 driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	 b.projectnameboard();
	
	 ab.getComments().sendKeys("Board");
	 driver().findElement(By.xpath("//input[@value='Approve']")).click();
	 login.logout();
}
}
