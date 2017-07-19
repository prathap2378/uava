package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.econsys.Projects.*; 
import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.*;
import com.econsys.TestData.*;

public class ProjectMethods_Small_Works extends Driver{
	//Page factory
	Logger log=Logger.getLogger(ProjectMethods_Small_Works.class.getName());
	RtqFormUi rtq = PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	Preparequote prepare_Quoteui = PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils commonutils = PageFactory.initElements(Driver.driver(), CommonUtils.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	smallWorkPageElements sWp= PageFactory.initElements(Driver.driver(),smallWorkPageElements.class);
	Salestooperation sales=PageFactory.initElements(Driver.driver(), Salestooperation.class);
	AppointkeystaffandCommerSuitUi appointKeyStaff_CommercialSuite_Ui=PageFactory.initElements(Driver.driver(), AppointkeystaffandCommerSuitUi.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	LoginPageui loginui=PageFactory.initElements(Driver.driver(), LoginPageui.class);
	PDPui pdp_Ui=PageFactory.initElements(Driver.driver(),PDPui.class);
	
	//Import class
	Login login = new Login();
	Workbook wb = new Workbook();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	Basic b = new Basic();
	Monorail monorail=new Monorail();
	EconsysVariables ev = new EconsysVariables();
	
	String filepath=System.getProperty("user.dir");
	
	public void uploadFile(String filename) throws InterruptedException  {
		
		//Specify the file location with extension
		StringSelection selctFilepath = new StringSelection(filepath+"\\Documentsuploded\\"+filename);
		//Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selctFilepath,null);
		
		try {
		Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				Thread.sleep(3000);
				robot.keyPress(KeyEvent.VK_CANCEL);
				// you are in a popup
				/*Frame frame = null;
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));*/
				InputStream inputStream = ProjectMethods_Small_Works.class.getResourceAsStream("image.jpg");
				//URL doc = ProjectMethods_Small_Works.class.getResource("D:\\Workspace\\Monorail\\src\\com\\testdata\\in\\Monorail_testoutput.xls");
				//System.out.println("url:"+doc);
			} catch (AWTException e) {
				e.printStackTrace();
			}
	}

public void linktoFileupload() throws InterruptedException{
		ProjectMethods_Small_Works pm = new ProjectMethods_Small_Works();
		commonutils.blindWait();
		boolean linktoFileCheckbox = ab.getLinkFileCheckbox().isDisplayed();
		int linktoFileCheckbox_Size = driver.findElements(By.xpath("//input[@class='list_item_link_docs_multiple']")).size();
		
		if(linktoFileCheckbox_Size>0){
			ab.getLinkFileCheckbox().click();
			ab.getAdd_LinkfilePopup().click();
			}
				else{
					commonutils.waitForPageToLoad();
					driver.findElements(By.xpath("//td/a[contains(text(),'Close')]")).get(0).click();
					log.info("check box not present so uploading file again");
					log.info("Files are not available");
					pm.uploadFile("Updated Risk and Opportunity Register 3.txt");
			}
		
	}
	
public boolean smallworkForm() throws InterruptedException, IOException, ClassNotFoundException, SQLException{
		int rownum= wb.getrowNum(2);
		boolean flag=false;
			
			login.loginSL();
			
			DBConnection db = new DBConnection();
			log.info(DBConnection.emailConfiguration());
			
			//rtq.getNewform().click();
			driver.findElement(By.xpath("//li[@id='layout_47']/a")).click();
			//rtq.getSmallWorks().click();
			commonutils.blindWait();
			driver.findElement(By.xpath("//a/span[contains(text(),'mall')]")).click();
			commonutils.waitForPageToLoad();
			rtq.getProjectName().sendKeys(ev.projectName());
			rtq.getCustomerName().sendKeys(wb.getXLData(3, 1, 1));
			commonutils.selectByIndex(rtq.getSmallWorksType(), 1);
			//Quote Info
			commonutils.selectByVisibleText(prepare_Quoteui.getQuotationonourFormat(), wb.getXLData(2, 5, 0));
			prepare_Quoteui.getOverallProjectCost().sendKeys(wb.getXLData(1, 4, 2));
			String sell = wb.getXLData(1, 5, 2);
			prepare_Quoteui.getOverallProjectSell().sendKeys(wb.getXLData(1, 5, 2));
			
			//File upload Quote document small works
			Driver.driver().findElement(By.xpath("//div[@id='quoteDocument-dropzone']")).click();
			uploadFile("Copy of Panel Production Schedule Template.xlsx");
			
			for(int i=1;i<=rownum;i++){
			prepare_Quoteui.getAddnewpopup().click();
		    commonutils.waitForPageToLoad();
		    prepare_Quoteui.getCostCodeCategorytextfield().sendKeys(wb.getXLData(i, 0, 2));
		    prepare_Quoteui.getCost().sendKeys(wb.getXLData(i, 1, 2));
			prepare_Quoteui.getSell().sendKeys(wb.getXLData(i, 2, 2));
			prepare_Quoteui.getSaveAddcostsellpopup().click();
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
		    }
			
			if (driver instanceof JavascriptExecutor) {
			    ((JavascriptExecutor)driver).executeScript("setTimeout(function () { }, 0)");
			} else {
			    throw new IllegalStateException("This driver does not support JavaScript!");
			}
			commonutils.blindWait();
			prepare_Quoteui.getBidsheet_linkfile().click();
			linktoFileupload();
			
			commonutils.selectByVisibleText(prepare_Quoteui.getBidSheetAuthorised(), wb.getXLData(15, 5, 0));
			prepare_Quoteui.getComments().sendKeys("Small Work form ...");
			rtq.getSubmit().click();
			
			//boolean alert = Driver.driver().findElements(By.xpath("//div[@class='modal-body']")).size()>0;
			
			int sellValue_Configured = DBConnection.sell_Value_SmallWorks();
			int sell_Actual = Integer.parseInt(sell);
			String option_SmallWorks_or_Project = wb.getXLData(18,9,0);
			
			if(sell_Actual>sellValue_Configured){
				commonutils.blindWait();
				Driver.driver().findElement(By.xpath("//a[text()='"+option_SmallWorks_or_Project+"']")).click();
				if(option_SmallWorks_or_Project.contentEquals("Yes")){
					Thread.sleep(2000);
					log.info("This is taking Project workflow, Currently saving the Project form");
					rtq.getSave().click();
					flag=true;
				}
				else{
					log.info("Continues with Small Works flow");
				}
			}
			log.info("log out small work form");
			login.logout();
			log.info("loged out");
			return flag;
}
	
//Submit quote form
public void submit_Quoteform() throws InterruptedException{
		boolean flag=false;
		try {
			commonutils.waitForPageToLoad();
			//**Verify the Quote form 
			if(sWp.getProInfo_accordion().isDisplayed()&&sWp.getQuoteInfo_accordion().isDisplayed()){
				
				flag=true;
				log.info("All elements present in the Quote form");
			}
			rtq.getComments().sendKeys("Submit Quote");
			sWp.getSubmitBtn().click();
			//login.logout();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Assert.assertEquals(flag, true);
	}
	

public void statusofSubmitQuote() throws IOException, InterruptedException{
     login.url();
	 //login.loginSL();
	 //String rtqType= driver.findElement(By.xpath("//tr[td[@title='"+wb.getXLData(1, 2, 1)+"']]/td[6]")).getText();
	 b.projectname();
	 Thread.sleep(500);
	 
	 log.info("quotestatuscp2cp3 : "+ev.quote_StatusCp2Cp3 );
	 commonutils.selectByVisibleText(ccq.getQuoteStatus(),ev.quote_StatusCp2Cp3);
	 Thread.sleep(1000);
	 	if(ev.quote_StatusCp2Cp3.equals("Customer Commitment Received")){
	 		
	 			//customerCommitmentType=wb.getXLData(9, 3, 0);
	 			commonutils.selectByVisibleText(ccq.getCustomerCommitmentType(), ev.customerCommitmentType);
	 			
	 			if(!"Verbal Commitment Received - Under Review".equals(ev.customerCommitmentType)){
	 			ccq.getUploadDoc_StatusofSubmitQuote().click();
	 			linktoFileupload();
	 			}
	 		
	 ab.getComments().sendKeys("Quote status");
	 ccq.getSubmit().click();
	 
	 		//customer commitment LOI received- status of submitted quote		 
	 		if(ev.customerCommitmentType.equals("LOI Received - Under Review")){
	 			Thread.sleep(1000);
	 			b.projectname();
	 			String loicommencement=wb.getXLData(11,3,0);
	 			commonutils.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),loicommencement);
	 			ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
			 			 	
	 			if(loicommencement.equals("Yes")){
	 				String questionsLOI=wb.getXLData(13,3,0);
	 				commonutils.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), questionsLOI);
	 			
	 				//4 questions "Yes"
	 				if(questionsLOI.equals("Yes")){
	 					commonutils.waitForPageToLoad();
	 					driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
	 					linktoFileupload();
	 					b.submit_Logout();
	 					g34.clApproval();
	 					//g34.sdApprovalnewFlow(); this task is removed from the flow
	 					login.loginSL();
	 					g34.customercommit();
	 				}

	 				//4 questions "No"
	 				if(questionsLOI.equals("No")){
			 		g34.customercommitmentLOIrecived();
	 				}
	
	 			}
	 			if(loicommencement.equals("No")){
	 				b.submit_Logout();
	 				monorail.boardcp6();
	 				login.loginSL();
	 				g34.customercommit();
	 			}
	 		}
	 		if(ev.customerCommitmentType.equals("Verbal Commitment Received - Under Review")){
	 			b.projectname();
	 			driver.findElement(By.xpath("//input[@id='fileList_flm_verbalCommitment']")).click();
	 			linktoFileupload();
	 			ab.getComments().sendKeys("Verbal Doc Uploaded");//added by Kaveri
	 			b.submit_Logout();
	 			//SD approval task
	 			g34.sdApproval(); 
	 			//Customer commitment task
	 			login.loginSL();//added by Kaveri	
	 			g34.customercommit();
	 		}
	
	 		else if(ev.customerCommitmentType.equals("PO Received - Under Review")||ev.customerCommitmentType.equals("Email Received - Under Review")||ev.customerCommitmentType.equals("Sub-Contract Received - Under Review"))
	 		{
	 			g34.customercommit();
	 		}
	 	}
	 //Amend bid-
	 if(ev.quote_StatusCp2Cp3.equals("Amend Bid")){
		 ab.getComments().sendKeys("Quote status");
		 ccq.getSubmit().click();	 
		 //cp2-cp3 prepare quote
		 monorail.prepareQuotecp2cp3();
		 commonutils.selectByVisibleText(prepare_Quoteui.getExecp3(),ev.exeCP3);
		 prepare_Quoteui.getQuoteprepared().click();
		 login.logout();
		 
		 if((ev.ourformat.equals("Yes")&&ev.cp2cp3ourformat.equals("No"))||(ev.cp2cp3bidsheetauthorised.equals("No"))||(ev.exeCP3.equals("Yes"))){
			 monorail.board();
		 }
		 monorail.submitandresubmit();
		 statusQuoteresubmit();
	 }
}

public void statusQuoteresubmit() throws InterruptedException, IOException {
    	 //login.loginSL();
    	 commonutils.waitForPageToLoad();
		 b.projectname();
		 Thread.sleep(1000);
		 
		 
		 commonutils.selectByVisibleText(ccq.getQuoteStatus(),ev.quote_StatusCp3Cp4);
		 
		 if(ev.quote_StatusCp3Cp4.equals("Customer Commitment Received")){ 
		 {
			 Thread.sleep(1000);
			 ev.customerCommitmentType=wb.getXLData(9,3,0);
			 commonutils.selectByVisibleText(ccq.getCustomerCommitmentType(), ev.customerCommitmentType);
			 
			 if("Verbal Commitment Received - Under Review" != ev.customerCommitmentType){
				 ccq.getUploadDoc_StatusofSubmitQuote().click();
		 		 linktoFileupload();
		 		 }
		 }
		 ab.getComments().sendKeys("Quote status");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 
		//customer commitment LOI received- status of Re-submitted quote
		 if(ev.customerCommitmentType.equals("LOI Received - Under Review"))
		 {
			 b.projectname();
			 String loicommencement=wb.getXLData(11,3,0);
			 commonutils.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),loicommencement);
			 ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
			 			 	
			 if(loicommencement.equals("Yes")){
			 	String questionsLOI=wb.getXLData(13,3,0);
			 	commonutils.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), questionsLOI);
			 	 		
			 	if(questionsLOI.equals("Yes")){
			 		commonutils.waitForPageToLoad();
			 		driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
		 	 		linktoFileupload();
		 	 		ab.getSubmitbutton().click();
		 	 		login.logout();
		 	 		g34.clApproval();
		 	 		//g34.sdApprovalnewFlow(); this task is removed from the flow
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
				 monorail.boardcp6();
				 login.loginSL();
				 g34.customercommit();
			 }
		 }
		 if(ev.customerCommitmentType.equals("Verbal Commitment Received - Under Review"))
		 {
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
		 else if(ev.customerCommitmentType.equals("PO Received - Under Review")||ev.customerCommitmentType.equals("Email Received - Under Review")||ev.customerCommitmentType.equals("Sub-Contract Received - Under Review"))
		 {
			 g34.customercommit();
		 }
	  	}
		 //******Amend bid******
		 if(ev.quote_StatusCp3Cp4.equals("Amend Bid")){
		 	 
			 monorail.prepareQuotecp2cp3();
	
		 
		 	if((ev.ourformat.equals("Yes")&&ev.cp2cp3ourformat.equals("No"))||(ev.cp2cp3bidsheetauthorised.equals("No"))||(ev.exeCP3.equals("Yes"))){
		 		monorail.board();
			}
		 
		 monorail.submitandresubmit();
				
		 statusQuoteresubmit();
		 }
     }
public void statusofSubmitQuote(String customerCommitmentType) throws IOException, InterruptedException {
    	 
	 //login.loginSL();
	 commonutils.waitForPageToLoad();
	 //String rtqType= driver.findElement(By.xpath("//tr[td[@title='"+wb.getXLData(1, 2, 1)+"']]/td[6]")).getText();
	 b.projectname();
	 Thread.sleep(1000);
	 
	 log.info("quotestatuscp2cp3 ***: "+ev.quote_StatusCp2Cp3 );
	 commonutils.selectByVisibleText(ccq.getQuoteStatus(),ev.quote_StatusCp2Cp3);
	 Thread.sleep(1000);
	 	if(ev.quote_StatusCp2Cp3.equals("Customer Commitment Received")){
	 		{
	 			commonutils.selectByVisibleText(ccq.getCustomerCommitmentType(), customerCommitmentType);
	 			
	 			if(!"Verbal Commitment Received - Under Review".equals(customerCommitmentType)){
	 			ccq.getUploadDoc_StatusofSubmitQuote().click();
	 			ab.getLinkFileCheckbox().click();
	 			ab.getAdd_LinkfilePopup().click();
	 			}
	 		}
	 ab.getComments().sendKeys("Quote status");
	 ccq.getSubmit().click();
	 
	 	//customer commitment LOI received- status of submitted quote		 
	 	if(customerCommitmentType.equals("LOI Received - Under Review")){
	 		Thread.sleep(1000);
	 		b.projectname();
	 		String loicommencement=wb.getXLData(11,3,0);
	 		commonutils.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_request_for_cw']")),loicommencement);
	 		ab.getComments().sendKeys("Customer Commitment Type-LOI Received");
			 			 	
	 		if(loicommencement.equals("Yes")){
	 			String questionsLOI=wb.getXLData(13,3,0);
	 			commonutils.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_Loi_5_QS']")), questionsLOI);
	 			
	 			//4 questions "Yes"
	 			if(questionsLOI.equals("Yes")){
	 				commonutils.waitForPageToLoad();
		 	 		driver().findElement(By.xpath("//input[@id='fileList_flm_LoiDocs']")).click();
		 	 		ab.getLinkFileCheckbox().click();
		 			ab.getAdd_LinkfilePopup().click();
		 	 		ab.getSubmitbutton().click();
		 	 		login.logout();
		 	 		g34.clApproval();
		 	 		//g34.sdApprovalnewFlow(); this task is removed from the flow
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
			 monorail.boardcp6();
			 login.loginSL();
			 g34.customercommit();
		 	}
	 	}
	 	//Verbal Commitment Received - Under Review
	 	if(customerCommitmentType.equals("Verbal Commitment Received - Under Review")){
		 commonutils.blindWait();		
		 b.projectname();
		 driver.findElement(By.xpath("//input[@id='fileList_flm_verbalCommitment']")).click();
		 linktoFileupload();
		 ab.getComments().sendKeys("Verbal Doc Uploaded");//added by Kaveri
		 ab.getSubmitbutton().click();//added by Kaveri
		 login.logout();
		 //SD approval task
		 g34.sdApproval(); 
		 //Customer commitment task
		 login.loginSL();//added by Kaveri	
		 g34.customercommit();
	 	}
	 	//PO Received - Under Review,Email Received - Under Review,Sub-Contract Received - Under Review
	 	else if(customerCommitmentType.equals("PO Received - Under Review")||customerCommitmentType.equals("Email Received - Under Review")||customerCommitmentType.equals("Sub-Contract Received - Under Review"))
	 	{
		 g34.customercommit();
	 	}
	 }
	
	 
	 if(ev.quote_StatusCp2Cp3.equals("Amend Bid")){
	
		 ab.getComments().sendKeys("Quote status");
	 ccq.getSubmit().click();	 
	 monorail.prepareQuotecp2cp3();
	 if((ev.ourformat.equals("Yes")&&ev.cp2cp3ourformat.equals("No"))||(ev.cp2cp3bidsheetauthorised.equals("No"))||(ev.exeCP3.equals("Yes"))){
			 monorail.board();
			 	}
		 monorail.submitandresubmit();
		 statusQuoteresubmit();
	 }
	 	
    		
    	}
	public void salesToOperation(){
		try {
			login.loginSL();
			b.projectname();
			prepare_Quoteui.getAddnewpopup().click();
	        sWp.getDescription().sendKeys("Test1");
	        prepare_Quoteui.getSaveAddcostsellpopup().click(); // Save button of Add New pop up
	       
	        sWp.getUpload_sales().click();
	        commonutils.blindWait();
	        sWp.getLinkTofilebtn().click();
	        commonutils.blindWait();
	        linktoFileupload();
	        commonutils.selectByVisibleText(sales.getMeeting(), wb.getXLData(22, 7, 0));
	        sales.getComments().sendKeys("Sales to Operation form ...");
	        
	        /*commonutils.selectByVisibleText(sWp.getExe_cp5_sw(),"");
	        sWp.getSubmitBtn().click();
	        login.logout();
*/	        
	        
		} catch (Exception e) {
			e.printStackTrace();
			} 
	}
	public void operation_acceptance(){
	
		try{
			login.loginPL();
			commonutils.blindWait();
			b.projectname();
			List<WebElement> opacce=Driver.driver().findElements(By.xpath("//td[@aria-describedby='salesToOperationGrid_action']/select"));
		 	
			for(int j=0;j<opacce.size();j++){
				commonutils.waitForPageToLoad();	
				commonutils.selectByVisibleText(opacce.get(j),"Yes");
			}
			commonutils.selectByVisibleText(appointKeyStaff_CommercialSuite_Ui.getMeetingwithsales(),wb.getXLData(6, 9, 0));
			prepare_Quoteui.getComments().sendKeys("Operation Acceptance Form ...");
		   	/*ab.getReviewInvolveapprovebutton().click();
		   	login.logout();*/
		}catch(Exception e){
			e.printStackTrace();
			}
	}
	public void pdp() throws IOException, InterruptedException {
		  login.url();
		  
		  login.loginPL();
		  b.projectname();
		  
		  List<WebElement> deletebutton=Driver.driver().findElements(By.xpath("//a[starts-with(@id,'delete_')]"));
		  for(int i=0;i<deletebutton.size();i++){
			  commonutils.blindWait();
			  deletebutton.get(i).click();
			  commonutils.blindWait();
			  Driver.driver().findElement(By.xpath("//a[@class='btn btn-small btn-info']")).click();
		  }
		  commonutils.blindWait();
		  /*pdp.getPlandoc().sendKeys(filepath+"\\Documentsuploded\\plandoc.docx");*/
		  pdp_Ui.getProject_Programme_document().click();
		  linktoFileupload();
		  
		  /*Value forecast grid details and adding milestone values*/
		  commonutils.blindWait();
		  pdp_Ui.getAddnewvalueforcast().click();
		  pdp_Ui.getMilestone().sendKeys("Milestone");
		  Driver.driver().findElement(By.xpath("//input[@id='milestoneDate']")).click();
		  pdp_Ui.getDate().click();
		  commonutils.blindWait();
		  String milestonevalue=wb.getXLData(2, 11, 0);
		  pdp_Ui.getAmount().sendKeys(""+milestonevalue);
		  Driver.driver().findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Milestone Value...");
		  pdp_Ui.getSavemilestone().click();
		 
		  /*Mile stone Comments*/
		  Thread.sleep(1000);
		  /*Driver.driver().findElement(By.xpath("//textarea[starts-with(@id,'x_cmt_prodAppForcGrid_Row')]")).sendKeys("milestone");
		  Driver.driver().findElement(By.linkText("Save")).click();*/
		  /*Mile stone document*/
		  Driver.driver().findElement(By.xpath("//input[@id='fileList_flm_milestoneDocument']")).click();
		  linktoFileupload();
		  
		  
		  ab.getComments().sendKeys("PDP form ...");
		  /*
		  commonutils.selectByVisibleText(pdp_Ui.getExecp6(),execp6);
		  Thread.sleep(1000);
		  sWp.getSubmitBtn().click();
		  Thread.sleep(1000);
		  login.logout();*/
	  }
	
	public void submit_Delivery_Review() throws InterruptedException, IOException{
		  login.loginPL();
		  b.projectname();
		  
		  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
		  uploadFile("Project programme document 1.txt");
		  Driver.driver().findElement(By.id("mdrMilestoneDocument-dropzone")).click();
		  uploadFile("Milestone Document 1.txt");
		  
		  
		  ab.getComments().sendKeys("Delivery review submit");
		  
	  }
	public void review_Delivery_Review() throws IOException, InterruptedException{
		login.loginPL();
		  b.projectname();
		  
		  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
		  uploadFile("Project programme document 2.txt");
		  Driver.driver().findElement(By.id("mdrMilestoneDocument-dropzone")).click();
		  uploadFile("Milestone Document 2.txt");
		  
		  
		  ab.getComments().sendKeys("Delivery review to monthly review");
		  
	}
	public void od_approval() throws IOException, InterruptedException{
		//Login as ****** OD
		  login.loginOD();
		  Driver.driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		  b.projectname_ReviewApproval();
		  ab.getComments().sendKeys("Approved monthly review");
		  ab.getBoardapprovebutton().click();
		  login.logout();
	}
public void project_complted_DeliveryReview() throws IOException, InterruptedException{
	/*login as PL *********** Project Completed*/
	  login.loginPL();
	  b.projectname();
	  
	  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
	  uploadFile("Project programme document 3.txt");
	  Driver.driver().findElement(By.id("mdrMilestoneDocument-dropzone")).click();
	  uploadFile("Milestone Document 3.txt");
	  
	  
	  ab.getComments().sendKeys("Delivery review project completed with out changes");
	  Driver.driver().findElement(By.xpath("//input[@value='Project Completed']")).click();
	  commonutils.blindWait();
	  Driver.driver().findElement(By.xpath("//a[@class='btn btn-small btn-info']")).click();
	  commonutils.blindWait();
	  login.logout();
}
	//Delivery Review
  public void deliveryreview() throws IOException, InterruptedException{
	  ProjectMethods_Small_Works delivery_ReviewMethods = new ProjectMethods_Small_Works();
		  
		  login.url();
		  String deliveryReview_dission=wb.getXLData(10,12,0);
		  
		  
		  //login as PL to Delivery Review *********** submit
		  if(deliveryReview_dission.equals("Submit")){
			  delivery_ReviewMethods.submit_Delivery_Review();
			  ab.getSubmitbutton().click();
			  login.logout();
		  }
		 
		 // login as PL for ************ Monthly Review
		  if(deliveryReview_dission.equals("Monthly Review")){
			  delivery_ReviewMethods.review_Delivery_Review();
			  Driver.driver().findElement(By.xpath("//input[@value='To Monthly Review']")).click();
			  login.logout();
		  }

		  delivery_ReviewMethods.od_approval();
	
		  delivery_ReviewMethods.project_complted_DeliveryReview();
		  
		  delivery_ReviewMethods.od_approval();
		
	  }
  //Small work rtq form with out file upload
  public void smallWorkForm1() throws IOException, InterruptedException{
			
			login.loginSL();
			
			rtq.getNewform().click();
			rtq.getSmallWorks().click();
			commonutils.waitForPageToLoad();
			rtq.getProjectName().sendKeys(ev.projectName());
			rtq.getCustomerName().sendKeys(wb.getXLData(3, 1, 1));
			commonutils.selectByIndex(rtq.getSmallWorksType(), 1);
			//Quote Info
			commonutils.selectByVisibleText(prepare_Quoteui.getQuotationonourFormat(), wb.getXLData(2, 5, 0));
			
			prepare_Quoteui.getComments().sendKeys("Small Work form ...");
			
  }
}
