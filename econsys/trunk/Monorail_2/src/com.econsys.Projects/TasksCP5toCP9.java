package adminpage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.*;
import com.monorail.Genriclibrery.*;
import com.testdata.in.Workbook;

public class TasksCP5toCP9 extends Driver {
	/*page factory class*/
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	PDPui pdp=PageFactory.initElements(Driver.driver(),PDPui.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	
	/*import classes*/
	static Workbook wb=new Workbook();
	static Login login=new Login();
	static Basic b=new Basic();
	String filepath=System.getProperty("user.dir");
	
	public static void main(String[] args) {
	TasksCP5toCP9 test=new TasksCP5toCP9();
	try {
		test.pdp();
		//test.deveryreview();
		//test.obtainpracticalcomplition();
		//test.postpracticalcomplition();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
  @Test
  /*Project delivery plan(PDP) task*/
  public void pdp() throws IOException, InterruptedException {
	  String url=wb.getXLData(1, 3,0);
	  System.out.println("already loged in pdp");
	  login.url(url);
	  
	  login.loginPL();
	  ab.getViewalltasks().click();
	  b.projectname();
	  
	  List<WebElement> deletebutton=driver().findElements(By.xpath("//a[starts-with(@id,'delete_')]"));
	  for(int i=0;i<deletebutton.size();i++){
		  Thread.sleep(1000);
		  deletebutton.get(i).click();
		  Thread.sleep(1000);
		  driver().findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	  }
	  /*pdp.getPlandoc().sendKeys(filepath+"\\Documentsuploded\\plandoc.docx");*/
	  pdp.getProject_Programme_document().click();
	  ab.getLinkFileCheckbox().click();
	  ab.getAdd_LinkfilePopup().click();
	  
	  /*Value forecast grid details and adding milestone values*/
	  Thread.sleep(1000);
	  pdp.getAddnewvalueforcast().click();
	  pdp.getMilestone().sendKeys("Milestone");
	  driver().findElement(By.xpath("//input[@id='milestoneDate']")).click();
	  pdp.getDate().click();
	  double milestonevalue=wb.getXLDataint(2, 11, 0);
	  pdp.getAmount().sendKeys(""+milestonevalue);
	  pdp.getSavemilestone().click();
	  /*Mile stone Comments*/
	  cu.waitForPageToLoad();
	  driver.findElement(By.xpath("//textarea[starts-with(@id,'x_cmt_prodAppForcGrid_Row')]")).sendKeys("milestone");
	  driver.findElement(By.linkText("Save")).click();
	  /*Mile stone document*/
	  driver().findElement(By.xpath("//input[@id='fileList_flm_milestoneDocument']")).click();
	  ab.getLinkFileCheckbox().click();
	  ab.getAdd_LinkfilePopup().click();
	  /*Production schedule document*/	
	  pdp.getProductionscheduledoc().click();
	  ab.getLinkFileCheckbox().click();
	  ab.getAdd_LinkfilePopup().click();
	  
	  ab.getComments().sendKeys("PDP");
	  String execp6=wb.getXLData(4, 11, 0);
	  cu.selectByVisibleText(pdp.getExecp6(),execp6);
	  Thread.sleep(1000);
	  //driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  Thread.sleep(1000);
	  //login.logout();
  }
  
  /*Delivery review task*/
  public void deveryreview() throws IOException, InterruptedException{
	  /*String url=wb.getXLData(1, 3,0);
	  login.url(url);*/
	  String deliveryReview_dission=wb.getXLData(10,12,0);
	  
	  /*login as PL to *********** submit*/
	  if(deliveryReview_dission.equals("Submit")){
	  login.loginPL();
	  ab.getViewalltasks().click();
	  b.projectname();
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrProgDocument']")).sendKeys(filepath+"\\Documentsuploded\\Project programme document 1.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrPlanDocument']")).sendKeys(filepath+"\\Documentsuploded\\Plan document 1.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrMilestoneDocument']")).sendKeys(filepath+"\\Documentsuploded\\Milestone Document 1.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrRiskRegisterupdated']")).sendKeys(filepath+"\\Documentsuploded\\Updated Risk and Opportunity Register 2.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrPanelProductionSchedule']")).sendKeys(filepath+"\\Documentsuploded\\Production Schedule 1.txt");
	  ab.getComments().sendKeys("Delivery review submit");
	  ab.getSubmitbutton().click();
	  login.logout();
	  }
	 
	  /*login as PL for ************ Monthly Review*/
	  if(deliveryReview_dission.equals("Submit")){
	  login.loginPL();
	  ab.getViewalltasks().click();
	  b.projectname();
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrProgDocument']")).sendKeys(filepath+"\\Documentsuploded\\Project programme document 2.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrPlanDocument']")).sendKeys(filepath+"\\Documentsuploded\\Plan document 2.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrMilestoneDocument']")).sendKeys(filepath+"\\Documentsuploded\\Milestone Document 2.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrRiskRegisterupdated']")).sendKeys(filepath+"\\Documentsuploded\\Updated Risk and Opportunity Register 2.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrPanelProductionSchedule']")).sendKeys(filepath+"\\Documentsuploded\\Production Schedule 2.txt");
	  ab.getComments().sendKeys("Delivery review to monthly review");
	  driver().findElement(By.xpath("//input[@value='To Monthly Review']")).click();
	  login.logout();
	  }

	  /*Login as ****** OD*/
	  login.loginOD();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  ab.getComments().sendKeys("Approved monthly review");
	  ab.getBoardapprovebutton().click();
	  login.logout();
	
	  /*login as PL *********** Project Completed*/
	  login.loginPL();
	  ab.getViewalltasks().click();
	  b.projectname();
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrProgDocument']")).sendKeys(filepath+"\\Documentsuploded\\Project programme document 3.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrPlanDocument']")).sendKeys(filepath+"\\Documentsuploded\\Plan document 3.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrMilestoneDocument']")).sendKeys(filepath+"\\Documentsuploded\\Milestone Document 3.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrRiskRegisterupdated']")).sendKeys(filepath+"\\Documentsuploded\\Updated Risk and Opportunity Register 3.txt");
	  driver.findElement(By.xpath("//input[@id='flm_att_0multifile_hidden_mdrPanelProductionSchedule']")).sendKeys(filepath+"\\Documentsuploded\\Production Schedule 3.txt");
	  ab.getComments().sendKeys("Delivery review project completed with out changes");
	  driver().findElement(By.xpath("//input[@value='Project Completed']")).click();
	  login.logout();
	  
	  /*Login as ****** OD*/
	  login.loginOD();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  ab.getComments().sendKeys("Approved monthly review");
	  ab.getBoardapprovebutton().click();
	  login.logout();
  }
  
  /*Obtain Practical Completion task*/
  public void obtainpracticalcomplition() throws IOException, InterruptedException{
	  /*String url=wb.getXLData(1, 3);
	  login.url(url);*/
	  String certificateobtained=wb.getXLData(6,11, 0);
	  String retationapplied=wb.getXLData(8,11, 0);
	  String onmSubmitted=wb.getXLData(10,11, 0);
	  String snagListIdentified=wb.getXLData(12,11, 0);
	  String internalCompletionDocument=wb.getXLData(14,11, 0);
	  String execp8=wb.getXLData(16,11, 0);
	  
	  login.loginPL();
	  ab.getViewalltasks().click();
	  b.projectname();

	  cu.selectByVisibleText(pdp.getOpc_certificateobtained(), certificateobtained);
	  if(certificateobtained.equals("Yes")){
	     pdp.getOpcdoc_certificateobtained().click();
	     ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getOpc_retationapplied(), retationapplied);
	  if(retationapplied.equals("Yes")){
		  pdp.getOpcdoc_retentinApplied().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getOpc_onmSubmitted(), onmSubmitted);
	  if(onmSubmitted.equals("Yes")){
		  pdp.getOpcdoc_onmSubmitted().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getOpc_snagListIdentified(), snagListIdentified);
	  if(snagListIdentified.equals("Yes")){
		  pdp.getOpcdoc_snagListIdentified().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getOpc_internalCompletionDocument(), internalCompletionDocument);
	  if(internalCompletionDocument.equals("Yes")){
		  pdp.getOpcdoc_internalCompletionDocument().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  
	  ab.getComments().sendKeys("Obtain practical complition");
	  cu.selectByVisibleText(pdp.getOpc_cp8(), execp8);
	  		  
	  ab.getSubmitbutton().click();
	  login.logout();
  }
  
  /*Post Practical completion task*/
  public void postpracticalcomplition() throws IOException, InterruptedException{
	  /*String url=wb.getXLData(1, 3,0);
	  login.url(url);*/
	  
	  String finalAccountAgreement=wb.getXLData(18,11, 0);
	  String finalRetentionPaid=wb.getXLData(20,11, 0);
	  String projectDocumentArchived=wb.getXLData(22,11, 0);
	  String projectDebrief=wb.getXLData(18,11, 0);
	  String subContractAccountSettled=wb.getXLData(1,12, 0);
	  String closureofProject=wb.getXLData(3,12, 0);
	  String bondsGuarantees_Resolved=wb.getXLData(5,12, 0);
	  String execp9=wb.getXLData(7,12, 0);
	 	    
	  login.loginPL();
	  //Thread.sleep(1000);
	  ab.getViewalltasks().click();
	  b.projectname();
	  //Thread.sleep(1000);
	 
	  cu.selectByVisibleText(pdp.getPpc_finalAccountAgreement(), finalAccountAgreement);
	  if(finalAccountAgreement.equals("Yes")){
		  pdp.getPpcdoc_finalAccountAgreement().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getPpc_finalRetentionPaid(), finalRetentionPaid);
	  if(finalRetentionPaid.equals("Yes")){
		  pdp.getPpcdoc_finalRetentionPaid().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getPpc_projectDocumentArchived(), projectDocumentArchived);
	  if(projectDocumentArchived.equals("Yes")){
		  pdp.getPpcdoc_projectDocumentArchived().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getPpc_projectDebrief(), projectDebrief);
	  cu.selectByVisibleText(pdp.getPpc_subContractAccountSettled(), subContractAccountSettled);
	  if(subContractAccountSettled.equals("Yes")){
		  pdp.getPpcdoc_subContractAccountSettled().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getPpc_closureofProject(), closureofProject);
	  if(closureofProject.equals("Yes")){
		  pdp.getPpcdoc_closureofProject().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  cu.selectByVisibleText(pdp.getPpc_bondsGuaranteesResolved(), bondsGuarantees_Resolved);
	  if(bondsGuarantees_Resolved.equals("Yes")){
		  pdp.getPpcdoc_bondsGuaranteesResolved().click();
		  ab.getLinkFileCheckbox().click();
		  ab.getAdd_LinkfilePopup().click();
	  }
	  
	  ab.getComments().sendKeys("Post practical complition");
	  cu.selectByVisibleText(pdp.getPpc_cp9(), execp9);
	  ab.getSubmitbutton().click();
	  login.logout();
	  //driver.close();
  }
}
