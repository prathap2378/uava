package com.econsys.Projects;

import java.io.IOException;
import java.util.List;




import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POC.Econsys_Auto.RandomNumber;

import com.econsys.Genriclibrery.*;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class TasksCP4toCP5 extends Driver {
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	AppointkeystaffandCommerSuitUi ak=PageFactory.initElements(Driver.driver(), AppointkeystaffandCommerSuitUi.class);
	Salestooperation so=PageFactory.initElements(Driver.driver(),Salestooperation.class);
	
	//import classes
		static Workbook wb=new Workbook();
		static Monorail rtq=new Monorail();
		static Login login=new Login();
		static ReviewInvolve ri=new ReviewInvolve();
		static Basic b=new Basic();
		static int num;
		RandomNumber radomNum=new RandomNumber();
		EconsysVariables ev =new EconsysVariables();
		ProjectMethods_Small_Works projectMethods_Small_Works = new ProjectMethods_Small_Works();
		
	
		String filepath=System.getProperty("user.dir");
		
		public static void main(String[] args) {
			TasksCP4toCP5 c=new TasksCP4toCP5();
			try {
				//c.commerSuit();
				c.salestoOperation();
				c.operationAcceptance();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				c.operationAcceptance();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
  @Test
public void apointkeystaf() throws IOException, InterruptedException{
	  
	  login.loginOD();
	  
	  b.projectname();
	  
	  String el=wb.getXLData(21,5, 0);
	  String cl=wb.getXLData(23,5, 0);
	  String pl=wb.getXLData(25,5, 0);
	  cu.selectByVisibleText(ak.getLeadEL(), el);
	  cu.selectByVisibleText(ak.getLeadCL(), cl);
	  cu.selectByVisibleText(ak.getLeadPL(), pl);
	  num=radomNum.randumNumber();
	  ak.getJobid().sendKeys(""+num);
	  ab.getComments().sendKeys("Appoint Key staff");
	  ab.getSubmitbutton().click();
	  login.logout();
  }
   
  public void commerSuit() throws IOException, InterruptedException{
	  
	  login.loginCL();
	  Thread.sleep(1000);
	  b.projectname();
	  cu.selectByVisibleText(ak.getDraftCommercialSuitProduced(),ev.draftproduced);
	  if(ev.draftproduced.equals("Yes")){
	  ak.getCummercialSuit_doc().click();
	  projectMethods_Small_Works.linktoFileupload();
	  }
	  ab.getComments().sendKeys("Commercial Suite and Application for Payment");
	  ab.getSubmitbutton().click();
	  //Thread.sleep(1000);
	  login.logout();
	  //driver().quit();
  }
  
  public void commerSuitUKAS() throws IOException, InterruptedException{
	  login.loginCL();
	  cu.blindWait();
	  b.projectname();
	  cu.selectByVisibleText(ak.getDraftCommercialSuitProduced(),ev.draftproduced);
	  if(ev.draftproduced.equals("Yes")){
	  ak.getCummercialSuit_doc().click();
	  projectMethods_Small_Works.linktoFileupload();
	  }
	  cu.selectByIndex(driver.findElement(By.xpath("//select[@id='st_insurance']")), 1);
	  cu.selectByIndex(driver.findElement(By.xpath("//select[@id='st_forecatAccounts']")), 1);
	  cu.selectByIndex(driver.findElement(By.xpath("//select[@id='st_projectPlanner']")), 1);
	  
	
	  cu.selectByIndex(driver.findElement(By.xpath("//select[@id='st_paymentRequestType']")), 2);
	  ab.getComments().sendKeys("Commercial Suite and Application for Payment");
	  ab.getSubmitbutton().click();
	  //Thread.sleep(1000);
	  login.logout();
	  //driver().quit();
  }
  
  public void salestoOperation() throws IOException, InterruptedException {
	  
	  login.loginSL();
	  //Thread.sleep(1000);
	  b.projectname();
	  
	  //List of radio buttons
	  //List<WebElement> radio = driver().findElements(By.xpath("//input[@type='radio'][@value='false']"));value="NA"
	  List<WebElement> radio = driver().findElements(By.xpath("//input[@type='radio'][@value='NA']"));
	  for(int i=0;i<radio.size();i++){
	  cu.waitForPageToLoad();
	  radio.get(i).click();

	  /*//List of Comment popups	
	  List<WebElement> commen=driver().findElements(By.xpath("//input[starts-with(@id,'img_cmt')]"));
	  //commen.click();
	  	
	  commen.get(i).sendKeys("Sales to operation");
	  //Thread.sleep(1000);
	  driver().findElement(By.linkText("Save")).click();*/
					
	  }
						
	  String meeting=wb.getXLData(22,7, 0);
	  cu.selectByVisibleText(so.getMeeting(), meeting);
	  ab.getComments().sendKeys("Sales to operation");
	  /*exe=wb.getXLData(24,7, 0);
	  cu.selectByVisibleText(so.getExeCP5(),exe);
	  
	  ab.getSubmitbutton().click();
	  login.logout();*/
  }
  
  public void operationAcceptance() throws IOException, InterruptedException{
	  /*String url=wb.getXLData(1, 3);
      login.url(url);*/
	  login.loginPL();
	  //Thread.sleep(1000); 
	  b.projectname();

	  //List of Yes operation drop downs
	  List<WebElement> opacce=driver().findElements(By.xpath("//select[starts-with(@id,'acceptanceStatus_')]"));
	 	
	  for(int j=0;j<opacce.size();j++){
	  cu.waitForPageToLoad();	
	  cu.selectByVisibleText(opacce.get(j),"Yes");
	  }
	 	
	  String meetingwithSL=wb.getXLData(6, 9, 0);
	  cu.selectByVisibleText(ak.getMeetingwithsales(),meetingwithSL);
	  ab.getComments().sendKeys("Operations Acceptance");

	  /*exeCP5=wb.getXLData(8, 9, 0);
	  cu.selectByVisibleText(ak.getExeOperationAcceptanceCP5(), exeCP5);
	  ab.getReviewInvolveapprovebutton().click();
	  login.logout();*/
	  
      //Meeting Notes
	  cu.waitForPageToLoad();
	  String meeting=wb.getXLData(22,7, 0);
	  
	  if(meetingwithSL.equals("Yes")||meeting.equals("Yes")){
	  login.loginSL();
	 		
	  b.projectname();
		 	
	  driver().findElement(By.xpath("//textarea[@id='salesLeaderNotes']")).sendKeys("Sales Leader meeting notes");
	  ab.getComments().sendKeys("Sales leader meeting notes");
	  ab.getSubmitbutton().click();
	  login.logout();
		 	
	  cu.waitForPageToLoad();
	  login.loginPL();
		 	
	  b.projectname();
		 	
	  driver().findElement(By.xpath("//textarea[@id='projectLeaderNotes']")).sendKeys("Project Leader meeting notes");
	  ab.getComments().sendKeys("Project leader meeting notes");
	  ab.getSubmitbutton().click();
	  login.logout();
	  //driver().quit();
	  }
      }
}
