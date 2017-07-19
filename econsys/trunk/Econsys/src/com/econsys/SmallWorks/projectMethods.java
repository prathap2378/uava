package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.econsys.Projects.*; 
import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.TestData.*;

public class projectMethods {
	RtqFormUIodj rtq = PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	Preparequote quoteform = PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils commonutils = PageFactory.initElements(Driver.driver(), CommonUtils.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	Basic b=PageFactory.initElements(Driver.driver(), Basic.class);
	smallWorkPageElements sWp= PageFactory.initElements(Driver.driver(),smallWorkPageElements.class);
	Salestooperation sales=PageFactory.initElements(Driver.driver(), Salestooperation.class);
	AppointkeystaffandCommerSuitUi ak=PageFactory.initElements(Driver.driver(), AppointkeystaffandCommerSuitUi.class);

	PDPui pdp=PageFactory.initElements(Driver.driver(),PDPui.class);
	String filepath=System.getProperty("user.dir");

	//Import class
	Login login = new Login();
	Workbook wb = new Workbook();
	public void uploadFile(String filename)  {
		// Specify the file location with extension
				 StringSelection sel = new StringSelection(filepath+"\\Documentsuploded\\"+filename);
				// Copy to clipboard
				 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
				 	 System.out.println("selection" +sel+" File Name "+filepath+"\\Documentsuploded\\"+filename);
			Robot robot;
			try {
				robot = new Robot();
				Thread.sleep(1000);
			      
				  // Press Enter
				 robot.keyPress(KeyEvent.VK_ENTER);
				 
				// Release Enter
				 robot.keyRelease(KeyEvent.VK_ENTER);
				 
				  // Press CTRL+V
				 robot.keyPress(KeyEvent.VK_CONTROL);
				 robot.keyPress(KeyEvent.VK_V);
				 
				// Release CTRL+V
				 robot.keyRelease(KeyEvent.VK_CONTROL);
				 robot.keyRelease(KeyEvent.VK_V);
				 Thread.sleep(1000);
				        
				        // Press Enter 
				 robot.keyPress(KeyEvent.VK_ENTER);
				 robot.keyRelease(KeyEvent.VK_ENTER);
				 Thread.sleep(3000);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	}
	public void linktoFileupload(){
		commonutils.blindWait();
		ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();
		/*quoteform.getLink_firstCheckbox().click();
		quoteform.getAdd_LinkfilePopup().click();*/
		//quoteform.getClose_uploadfield().click();
	}
	
	public boolean smallworkForm(){
		int rownum= wb.getrowNum(2);
		boolean flag=false;
		try {
			login.loginSL();
			rtq.getNewform().click();
			rtq.getSmallWorks().click();
			commonutils.waitForPageToLoad();
			rtq.getProjectName().sendKeys(wb.getXLData(1, 2, 1));
			rtq.getCustomerName().sendKeys(wb.getXLData(3, 1, 1));
			commonutils.selectByIndex(rtq.getSmallWorksType(), 1);
			//Quote Info
			commonutils.selectByVisibleText(quoteform.getQuotationonourFormat(), wb.getXLData(2, 5, 0));
			quoteform.getOverallProjectCost().sendKeys(wb.getXLData(1, 4, 2));
			quoteform.getOverallProjectSell().sendKeys(wb.getXLData(1, 5, 2));
			
			for(int i=1;i<=rownum;i++){
			quoteform.getAddnewpopup().click();
		    commonutils.waitForPageToLoad();
		    quoteform.getCostCodeCategorytextfield().sendKeys(wb.getXLData(i, 0, 2));
			quoteform.getCost().sendKeys(wb.getXLData(i, 1, 2));
			quoteform.getSell().sendKeys(wb.getXLData(i, 2, 2));
			quoteform.getSaveAddcostsellpopup().click();
			Thread.sleep(2000);
		    }
			Driver.driver().findElement(By.xpath("//div[@id='quoteDocument-dropzone']")).click();
			uploadFile("Copy of Panel Production Schedule Template.xlsx");
			quoteform.getBidsheet_linkfile().click();
			linktoFileupload();
			commonutils.selectByVisibleText(quoteform.getBidSheetAuthorised(), wb.getXLData(15, 5, 0));
			quoteform.getComments().sendKeys("Small Work form ...");
			rtq.getSubmit().click();
			Thread.sleep(2000);
			if(Driver.driver().findElement(By.xpath("//div[@class='modal-body']")).isDisplayed()){
				Driver.driver().findElement(By.xpath("//a[text()='"+wb.getXLData(18,9,0)+"']")).click();
				if(wb.getXLData(18,9,0).contentEquals("Yes")){
					System.out.println("This is taking Project workflow, Currently saving the Project form");
					rtq.getSave().click();
					flag=true;
				}
				else{
					System.out.println("Continues with Small Works flow");
				}
			}
			   login.logout();
			   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} 
		return flag;

			}


	public void salesToOperation(){
		try {
			login.loginSL();
			ab.getViewalltasks().click();
			b.projectname();
	        quoteform.getAddnewpopup().click();
	        sWp.getDescription().sendKeys("Test1");
	        quoteform.getSaveAddcostsellpopup().click(); // Save button of Add New pop up
	       
	        sWp.getUpload_sales().click();
	        commonutils.blindWait();
	        sWp.getLinkTofilebtn().click();
	        commonutils.blindWait();
	        linktoFileupload();
	        commonutils.selectByVisibleText(sales.getMeeting(), wb.getXLData(22, 7, 0));
	        sales.getComments().sendKeys("Sales to Operation form ...");
	        sWp.getSubmitBtn().click();
	        login.logout();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
	}
	public void operation_acceptance(){
	
		try{
			login.loginPL();
			ab.getViewalltasks().click();
			commonutils.blindWait();
			b.projectname();
			List<WebElement> opacce=Driver.driver().findElements(By.xpath("//td[@aria-describedby='salesToOperationGrid_action']/select"));
		 	
			for(int j=0;j<opacce.size();j++){
				commonutils.waitForPageToLoad();	
				commonutils.selectByVisibleText(opacce.get(j),"Yes");
			}
			commonutils.selectByVisibleText(ak.getMeetingwithsales(),wb.getXLData(6, 9, 0));
		   	quoteform.getComments().sendKeys("Operation Acceptance Form ...");
		   	ab.getReviewInvolveapprovebutton().click();
		   	login.logout();
		}catch(Exception e){
			e.printStackTrace();
			}
	}
	public void pdp() throws IOException, InterruptedException {
		  login.url();
		  
		  login.loginPL();
		  ab.getViewalltasks().click();
		  b.projectname();
		  
		  List<WebElement> deletebutton=Driver.driver().findElements(By.xpath("//a[starts-with(@id,'delete_')]"));
		  for(int i=0;i<deletebutton.size();i++){
			  Thread.sleep(1000);
			  deletebutton.get(i).click();
			  Thread.sleep(1000);
			  Driver.driver().findElement(By.xpath("//a[@class='btn btn-small btn-info']")).click();
		  }
		  Thread.sleep(1000);
		  /*pdp.getPlandoc().sendKeys(filepath+"\\Documentsuploded\\plandoc.docx");*/
		  pdp.getProject_Programme_document().click();
		  linktoFileupload();
		  
		  /*Value forecast grid details and adding milestone values*/
		  Thread.sleep(1000);
		  pdp.getAddnewvalueforcast().click();
		  pdp.getMilestone().sendKeys("Milestone");
		  Driver.driver().findElement(By.xpath("//input[@id='milestoneDate']")).click();
		  pdp.getDate().click();
		  Thread.sleep(1000);
		  String milestonevalue=wb.getXLData(2, 11, 0);
		  pdp.getAmount().sendKeys(""+milestonevalue);
		  Driver.driver().findElement(By.xpath("//textarea[@id='comments']")).sendKeys("Milestone Value...");
		  pdp.getSavemilestone().click();
		 
		  /*Mile stone Comments*/
		  Thread.sleep(1000);
		  /*Driver.driver().findElement(By.xpath("//textarea[starts-with(@id,'x_cmt_prodAppForcGrid_Row')]")).sendKeys("milestone");
		  Driver.driver().findElement(By.linkText("Save")).click();*/
		  /*Mile stone document*/
		  Driver.driver().findElement(By.xpath("//input[@id='fileList_flm_milestoneDocument']")).click();
		  linktoFileupload();
		  
		  
		  ab.getComments().sendKeys("PDP form ...");
		  String execp6=wb.getXLData(4, 11, 0);
		  commonutils.selectByVisibleText(pdp.getExecp6(),execp6);
		  Thread.sleep(1000);
		  sWp.getSubmitBtn().click();
		  Thread.sleep(1000);
		  login.logout();
	  }
	 public void deliveryreview() throws IOException, InterruptedException{
		  String url=wb.getXLData(1,3,0);
		  login.url();
		  String deliveryReview_dission=wb.getXLData(10,12,0);
		  
		 // login as PL to *********** submit
		  if(deliveryReview_dission.equals("Submit")){
		  login.loginPL();
		  ab.getViewalltasks().click();
		  b.projectname();
		  
		  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
		  uploadFile("Project programme document 1.txt");
		  Driver.driver().findElement(By.id("mdrMilestoneDocument-dropzone")).click();
		  uploadFile("Milestone Document 1.txt");
		  
		  
		  ab.getComments().sendKeys("Delivery review submit");
		  ab.getSubmitbutton().click();
		  login.logout();
		  }
		 
		 // login as PL for ************ Monthly Review
		  if(deliveryReview_dission.equals("Monthly Review")){
		  login.loginPL();
		  ab.getViewalltasks().click();
		  b.projectname();
		  
		  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
		  uploadFile("Project programme document 2.txt");
		  Driver.driver().findElement(By.id("mdrMilestoneDocument-dropzone")).click();
		  uploadFile("Milestone Document 2.txt");
		  
		  
		  ab.getComments().sendKeys("Delivery review to monthly review");
		  Driver.driver().findElement(By.xpath("//input[@value='To Monthly Review']")).click();
		  login.logout();
		  }

		  //Login as ****** OD
		  login.loginOD();
		  Driver.driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		  b.projectnameboard();
		  ab.getComments().sendKeys("Approved monthly review");
		  ab.getBoardapprovebutton().click();
		  login.logout();
	
		  /*login as PL *********** Project Completed*/
		  login.loginPL();
		  ab.getViewalltasks().click();
		  b.projectname();
		  
		  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
		  uploadFile("Project programme document 3.txt");
		  Driver.driver().findElement(By.id("mdrMilestoneDocument-dropzone")).click();
		  uploadFile("Milestone Document 3.txt");
		  
		  
		  ab.getComments().sendKeys("Delivery review project completed with out changes");
		  Driver.driver().findElement(By.xpath("//input[@value='Project Completed']")).click();
		  Thread.sleep(1000);
		  Driver.driver().findElement(By.xpath("//a[@class='btn btn-small btn-info']")).click();
		  Thread.sleep(1000);
		  login.logout();
		//a[@class='btn btn-primary'] ,//a[@class='btn null']
		  /*Login as ****** OD*/
		  login.loginOD();
		  Driver.driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
		  b.projectnameboard();
		  ab.getComments().sendKeys("Approved monthly review");
		  ab.getBoardapprovebutton().click();
		  login.logout();
	  }
}
