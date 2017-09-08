package com.econsys.Projects;

import java.io.IOException;
import java.util.List;




import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POC.econsys.RandomNumber;

import com.econsys.Genriclibrery.*;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class TasksCP4toCP5 extends Driver {
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RTQForm_Ui nrtq=PageFactory.initElements(Driver.driver(), RTQForm_Ui.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	AppointkeystaffandCommerSuitUi ak=PageFactory.initElements(Driver.driver(), AppointkeystaffandCommerSuitUi.class);
	Salestooperation so=PageFactory.initElements(Driver.driver(),Salestooperation.class);
	
	Logger log = Logger.getLogger(TasksCP4toCP5.class);
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
	
  @Test
public void apointkeystaf() throws IOException, InterruptedException{
	  
	  login.loginOD();
	  String taskName = PropertiesUtil.getPropValues("appoint_key_staff");
	  b.projectTaskName(taskName);
	  
	  Thread.sleep(1000);
	  cu.selectByVisibleText(ak.getLeadEL(), ev.el);
	  cu.selectByVisibleText(ak.getLeadCL(), ev.cl);
	  cu.selectByVisibleText(ak.getLeadPL(), ev.pl);
	  num=radomNum.randumNumber();
	  ak.getJobid().sendKeys(""+num);
	  ab.getComments().sendKeys("Appoint Key staff");
	  ab.getSubmitbutton().click();
	  login.logout();
  }
  //Submit response used in PAG and Matrix
  public void submitResponse() throws InterruptedException, IOException{
	  login.url();
	  login.loginOD();
	  b.projectname();
	  
	  ab.getComments().sendKeys("Submit response...");
	  b.submit_Logout();
  }
  //commercial suite general
  public void commerSuit() throws IOException, InterruptedException{
	  
	  login.loginCL();
	  cu.waitForPageToLoad();
	  String taskName = PropertiesUtil.getPropValues("commercial_Suite");
	  b.projectTaskName(taskName);
	  cu.selectByVisibleText(ak.getDraftCommercialSuitProduced(),ev.draftproduced);
	  if(ev.draftproduced.equals("Yes")){
		  ak.getCummercialSuit_doc().click();
		  projectMethods_Small_Works.linktoFileupload();
	  }
	  ab.getComments().sendKeys("Commercial Suite and Application for Payment");
	  ab.getSubmitbutton().click();
	  login.logout();
  }
//Commercial suite of UKAS 
  public void commerSuitUKAS() throws IOException, InterruptedException{
	  login.loginCL();
	  cu.blindWait();
	  String taskName = PropertiesUtil.getPropValues("commercial_task_Prior_Commencement");
	  b.projectTaskName(taskName);
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
  
  //Commercial suite for 4eg
  public void cummercialSuite_4eg() throws InterruptedException, IOException{
	//Payment terms
	  login.loginCL();
	  cu.blindWait();
	  //String taskName = PropertiesUtil.getPropValues("commercial_Suite");
	  b.projectTaskName("Commercial Tasks Prior to Commencement");
	  cu.blindWait();
	  log.info("commmercial suite payments ");
	  cu.selectByIndex(ak.getDraftCommercialSuitProduced(),2);
	  /*if(ev.draftproduced.equals("Yes")){
		  ak.getPayment_Cycle_Document().click();
		  projectMethods_Small_Works.linktoFileupload();
	  }*/
	  ak.getPayment_Terms().sendKeys("15");
	  ak.getDays_From().sendKeys("3");
	  log.info("completed");
	  ab.getComments().sendKeys("Commercial Suite and Application for Payment");
	  ab.getSubmitbutton().click();
	  //Thread.sleep(1000);
	  login.logout();
	  //driver().quit();
  }
  
  //using this in GA, Matrix and UKAS as there in delegate option in ukas also
  public void salestoOperation() throws IOException, InterruptedException {
	  
	  login.loginSL();
	  //Thread.sleep(1000);
	  String sales = PropertiesUtil.getPropValues("salesto_Operation");
	  b.projectTaskName(sales);
	  List<WebElement> radio = driver().findElements(By.xpath("//input[@type='radio'][@value='NA']"));
	  for(int i=0;i<radio.size();i++){
	  cu.waitForPageToLoad();
	  radio.get(i).click();
	  }
	  cu.selectByVisibleText(so.getMeeting(), ev.meeting);
      String customerCommitmentType= ev.customerCommitmentType;
      System.out.println(ev.customerCommitmentType);
      if(customerCommitmentType.equals("LOI Received - Under Review")||customerCommitmentType.equals("Email Received - Under Review")
   			||customerCommitmentType.equals("Verbal Commitment Received - Under Review")){
    	  System.out.println(ev.customerCommitmentType+"is email check");
    	  int a = driver.findElements(By.xpath("//select[@id='st_cCChangeTaskOwner']")).size();
    	  System.out.println("size of elements "+a);
    	  if(a>0){
    		  System.out.println(ev.customerCommitmentType+"there is delegate");
    	  cu.selectByVisibleText(so.getDelegateTaskto_PL(),ev.delegatetoPL);
    	  }
      }
	  
	  ab.getComments().sendKeys("Sales to operation");
  }
//using this in GA, Matrix and UKAS as there in delegate option in ukas also 
  public void operationAcceptance() throws IOException, InterruptedException{
	  /*String url=wb.getXLData(1, 3);
      login.url(url);*/
	  login.loginPL();
	  //Thread.sleep(1000); 
	  String taskName = PropertiesUtil.getPropValues("operations_Acceptanceof_Handover");
	  b.projectTaskName(taskName);

	  //List of Yes operation drop downs
	  List<WebElement> opacce=driver().findElements(By.xpath("//select[starts-with(@id,'acceptanceStatus_')]"));
	 	
	  for(int j=0;j<opacce.size();j++){
	  cu.waitForPageToLoad();	
	  cu.selectByVisibleText(opacce.get(j),"Yes");
	  }
	  //	  customer commitment type
	  String customerCommitmentType= ev.customerCommitmentType;
      if(customerCommitmentType.equals("LOI Received - Under Review")||customerCommitmentType.equals("Email Received - Under Review")
   			||customerCommitmentType.equals("Verbal Commitment Received - Under Review")){
	 	int a = driver.findElements(By.xpath("//select[@id='st_cCChangeTaskOwnerOPS']")).size();
	 	if(a>0){
	 		cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_cCChangeTaskOwnerOPS']")),"Yes");
	 	}
      }
	  cu.selectByVisibleText(ak.getMeetingwithsales(),ev.meetingwithSL);
	  ab.getComments().sendKeys("Operations Acceptance");
      }

  //Meetings
  public void meetings() throws IOException, InterruptedException{

	  login.loginSL();
	 	
	  
	  b.projectTaskName("Meeting Notes by Sales Leader");
		 	
	  driver().findElement(By.xpath("//textarea[@id='salesLeaderNotes']")).sendKeys("Sales Leader meeting notes");
	  ab.getComments().sendKeys("Sales leader meeting notes");
	  ab.getSubmitbutton().click();
	  login.logout();
		 	
	  cu.waitForPageToLoad();
	  login.loginPL();
		 	
	  b.projectTaskName("Meeting Notes by Project Lead");
		 	
	  driver().findElement(By.xpath("//textarea[@id='projectLeaderNotes']")).sendKeys("Project Leader meeting notes");
	  ab.getComments().sendKeys("Project leader meeting notes");
	  ab.getSubmitbutton().click();
	  login.logout();	  
  }
  }
