package com.econsys.ukasProjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.Projects.*;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class ProjectMethodsUKAS extends Driver{
	
	RtqFormUi rtq = PageFactory.initElements(driver(), RtqFormUi.class);
	Preparequote pq = PageFactory.initElements(driver(),Preparequote.class);
	ActionButtonsUi ab = PageFactory.initElements(driver(), ActionButtonsUi.class);
	PDPui pdpui = PageFactory.initElements(driver(),PDPui.class);
	//class
	Login login = new Login();
	EconsysVariables ev = new EconsysVariables();
	CommonUtils cu = new CommonUtils();
	ProjectMethods_Small_Works pm = new ProjectMethods_Small_Works();
	Workbook wb = new Workbook();
	Basic b = new Basic();
 
  public void rtqForm() throws IOException, InterruptedException {
	  //url
	  login.url();
	  //login user
	  login.user();
	  
	  rtq.getRtqLink().click();
	  rtq.getProjectLink().click();
	  
	  //RTQ details
	  rtq.getProjectName().sendKeys(ev.projectName());
	  String customer=wb.getXLData(2,1,1);
	  rtq.getCustomerName().sendKeys(customer);
	  cu.selectByIndex(rtq.getProduct_Type(),1);
	  cu.selectByIndex(rtq.getCtegory_of_Project(),1);
	  cu.selectByIndex(rtq.getType_Of_Building(),1);
	  rtq.getLocationUkas().sendKeys("Location");
	  cu.selectByVisibleText(rtq.getHas_Quote_Submitted(),"Yes");
	  
	  String filepath = System.getProperty("user.dir");
	  String testdataXLpath=filepath+"\\src\\main\\java\\com\\econsys\\TestData\\Monorail_testdata.xls";
	  
	  FileInputStream file = new FileInputStream(testdataXLpath);
	  HSSFWorkbook excel = new HSSFWorkbook(file);
	  HSSFSheet sheet = excel.getSheetAt(2);
	  double overallProjectCost = sheet.getRow(1).getCell(4).getNumericCellValue();
	  double overallProjectSell = sheet.getRow(1).getCell(5).getNumericCellValue();
	  pq.getOverallProjectCost().sendKeys(""+overallProjectCost);
	  pq.getOverallProjectSell().sendKeys(""+overallProjectSell);
	  Thread.sleep(1000);
	  Iterator it = sheet.rowIterator();
	  	while(it.hasNext()){
		 HSSFRow row = (HSSFRow) it.next();
		 int rowNum = row.getRowNum();
		 	if(rowNum!=0){
		 		String costCode = row.getCell(0).getStringCellValue();
		 		double cost = row.getCell(1).getNumericCellValue();
			 	double sell = row.getCell(2).getNumericCellValue();
			 	cu.blindWait();
			 	pq.getAddnewpopup().click();
			 	cu.blindWait();
			 	pq.getCostCodeCategorytextfield().sendKeys(costCode);
			 	pq.getCost().sendKeys(""+cost);
			 	pq.getSell().sendKeys(""+sell);
			 	pq.getSaveAddcostsellpopup().click();
			 	cu.blindWait();
		 	}
	  	}
	  cu.blindWait();
	  Driver.driver().findElement(By.xpath("//div[@id='quoteDocument-dropzone']")).click();
	  pm.uploadFile("Copy of Panel Production Schedule Template.xlsx");
	  cu.blindWait();
	  pq.getRiskopportunityregister_Linkfile().click();
	  pm.linktoFileupload();
	  cu.selectByIndex(rtq.getContract_Value_Type(),1);
	  ab.getComments().sendKeys("RTQ form ukas projects");
  }
  @Test
  public void new_GridsPDP() throws InterruptedException, IOException{
	  /*login.url();
	  login.user();
	  b.projectname();*/
	  //Instructions grids action details
	  cu.blindWait();
	  pdpui.getAddNew_InstructionGrid().click();
	  pdpui.getDescription().sendKeys("Ins");
	  pdpui.getComments_PDPpopup().sendKeys("Instructions");
	  pdpui.getSaveButton_PDPpopup().click();
	  cu.blindWait();
	  pdpui.getDoc_instructions().click();
	  pdpui.getLinktoFile_instructions().click();
	  pm.linktoFileupload();
	  
	  //Day work sheets
	  cu.waitForPageToLoad();
	  pdpui.getAddnew_DayWorkSheetsGrid().click();
	  pdpui.getDescription().sendKeys("Day work");
	  pdpui.getComments_PDPpopup().sendKeys("Day work sheets");
	  pdpui.getSaveButton_PDPpopup().click();
	  cu.blindWait();
	  pdpui.getDoc_DayWorkSheetsGrid().click();
	  pdpui.getLinktoFile_daywork_sheets().click();
	  pm.linktoFileupload();
	  
	  //Commercial correspondence/important Email
	  cu.blindWait();
	  pdpui.getAddnew_CommercialCorrespondenceGrid().click();
	  pdpui.getDescription().sendKeys("Email");
	  pdpui.getComments_PDPpopup().sendKeys("Commercial correspondence/important Email");
	  pdpui.getSaveButton_PDPpopup().click();
	  cu.blindWait();
	  pdpui.getDoc_CommercialCorrespondenceGrid().click();
	  pdpui.getLinktoFile_CommercialCorrespondenceGrid().click();
	  pm.linktoFileupload();
	  
	  //Non Compliance reports
	  cu.blindWait();
	  pdpui.getAddnew_NonComplianceReportsGrid().click();
	  pdpui.getDescription().sendKeys("NCR");
	  pdpui.getComments_PDPpopup().sendKeys("Non Compliance reports");
	  cu.selectByIndex(pdpui.getStatus_NonComplianceReportsGrid(), 1);
	  pdpui.getSaveButton_PDPpopup().click();
	  cu.blindWait();
	  pdpui.getDoc_NonComplianceReportsGrid().click();
	  pdpui.getLinktoFile_NonComplianceReportsGrid().click();
	  pm.linktoFileupload();
	  
	  //Sample Acceptance
	  cu.blindWait();
	  pdpui.getAddnew_SampleAcceptanceGrid().click();
	  pdpui.getType_SampleAcceptanceGrid().sendKeys("Type sample");
	  pdpui.getDescription().sendKeys("Sample");
	  pdpui.getComments_PDPpopup().sendKeys("Sample Acceptance");
	  cu.selectByIndex(pdpui.getStatus_SampleAcceptanceGrid(), 1);
	  pdpui.getSaveButton_PDPpopup().click();
	  cu.blindWait();
	  pdpui.getDoc_SampleAcceptanceGrid().click();
	  pdpui.getLinktoFile_SampleAcceptanceGrid().click();
	  pm.linktoFileupload();
  }
  
  public void pdpProjectsUKAS() throws IOException, InterruptedException{
	  login.url();
	  
	  login.loginPL();
	  b.projectname();
	  
	  List<WebElement> deletebutton=Driver.driver().findElements(By.xpath("//a[starts-with(@id,'delete_')]"));
	  for(int i=0;i<deletebutton.size();i++){
		  cu.blindWait();
		  deletebutton.get(i).click();
		  cu.blindWait();
		  Driver.driver().findElement(By.xpath("//a[@class='btn btn-small btn-info']")).click();
	  }
	  cu.blindWait();
	  pdpui.getProject_Programme_document().click();
	  pm.linktoFileupload();
	  new_GridsPDP();
	  ab.getComments().sendKeys("PDP UKAS");
  }
  
  public void submit_Delivery_Review() throws InterruptedException, IOException{
	  login.loginPL();
	  b.projectname();
	  
	  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
	  pm.uploadFile("Project programme document 1.txt");
	  
	  ab.getComments().sendKeys("Delivery review submit");
  }
  
  public void review_Delivery_Review() throws IOException, InterruptedException{
		  login.loginPL();
		  b.projectname();
		  
		  Driver.driver().findElement(By.id("mdrProgDocument-dropzone")).click();
		  pm.uploadFile("Project programme document 2.txt");
		  
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
		  pm.uploadFile("Project programme document 3.txt");
		  
		  ab.getComments().sendKeys("Delivery review project completed with out changes");
		  cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='explicit_approval']")), "Yes");
		  
		  Driver.driver().findElement(By.xpath("//input[@value='Project Completed']")).click();
		  cu.blindWait();
		  Driver.driver().findElement(By.xpath("//a[@class='btn btn-small btn-info']")).click();
		  cu.blindWait();
		  login.logout();
	}
//Delivery Review
  public void deliveryreview() throws IOException, InterruptedException{
	  ProjectMethodsUKAS dr = new ProjectMethodsUKAS();
		  
		  login.url();
		  String deliveryReview_dission=wb.getXLData(10,12,0);
		  
		  //login as PL to Delivery Review *********** submit
		  if(deliveryReview_dission.equals("Submit")){
			  dr.submit_Delivery_Review();
			  ab.getSubmitbutton().click();
			  login.logout();
		  }
		 // login as PL for ************ Monthly Review
		  if(deliveryReview_dission.equals("Monthly Review")){
			  dr.review_Delivery_Review();
			  Driver.driver().findElement(By.xpath("//input[@value='To Monthly Review']")).click();
			  login.logout();
		  }

		  dr.od_approval();
	
		  dr.project_complted_DeliveryReview();
		  
		  dr.od_approval();
		
	  }
}
