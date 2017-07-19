package com.econsys.Projects;
import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.*;
import com.econsys.SmallWorks.ProjectMethods_Small_Works;
import com.econsys.TestData.*;

public class Basic extends Driver {
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	Logger log = Logger.getLogger(Basic.class.getName());
	//import classes
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static Login login=new Login();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	static EconsysVariables ev = new EconsysVariables();
	
	//Variables
	static String productSpecified,Consultant,projectAddress,size=null;
	String isEnqueryOpentoAll,performanceBond,pCG,termsandconditionsadvised,endUserIndustrySector=null;
	String haveweworkedonthissitebefore,areweNamedSpecified,documentationReceived,points,typeofBuilding=null;
	String enquiryFormat,typeofProject;
	
  @Test
  //******RTQ form inputs******
	public void rtqForm(String estimatedSize,String location) throws InterruptedException, IOException,AWTException {
		
	  cu.waitForPageToLoad();
	  nrtq.getRtqLink().click();
	  nrtq.getProjectLink().click();
	  
	  log.info("Project name basic: "+ev.projectName());
	  nrtq.getProjectName().sendKeys(ev.projectName());
	  
	  String paddress=wb.getXLData(6,1,1);
	  nrtq.getProjectAddres().sendKeys(paddress);
	  
	  String consultant=wb.getXLData(4,1,1);
	  nrtq.getConsultantName().sendKeys(consultant);
	  
	  String customer=wb.getXLData(2,1,1);
	  nrtq.getCustomerName().sendKeys(customer);
	  
	  // select Size
	  // estimatedSize=wb.getXLData(8, 1, 1);
	  cu.selectByVisibleText(nrtq.getEstimatedSize(), estimatedSize);
	  
	  points=wb.getXLData(10,1,1);
	  nrtq.getPoints().sendKeys(""+points);
	  
	  //Engineering
	  productSpecified=wb.getXLData(12,1,1);
	  cu.selectByVisibleText(nrtq.getProductSpecifieddd(), productSpecified);
	  
	  typeofBuilding=wb.getXLData(18, 1, 1);
	  cu.selectByVisibleText(nrtq.getTypeofBuildingdd(), typeofBuilding);
	  
	  endUserIndustrySector=wb.getXLData(14, 1, 1);
	  cu.selectByVisibleText(nrtq.getEndUserIndustrySectordd(), endUserIndustrySector);
	  
	  typeofProject=wb.getXLData(16, 1, 1);
	  cu.selectByVisibleText(nrtq.getTypeofProjectdd(), typeofProject);
	  
	  //commercial
	  enquiryFormat=wb.getXLData(3,2,1);
	  cu.selectByVisibleText(nrtq.getEnquiryFormatdd(), enquiryFormat);
	  
	  documentationReceived=wb.getXLData(5, 2, 1);
	  cu.selectByVisibleText(nrtq.getDocumentationReceiveddd(), documentationReceived);
	  
	  areweNamedSpecified=wb.getXLData(7, 2, 1);
	  cu.selectByVisibleText(nrtq.getGANameddd(), areweNamedSpecified);
	  
	  //select Location
	  cu.selectByVisibleText(nrtq.getLocationdd(), location);	  
	  	  
	  haveweworkedonthissitebefore=wb.getXLData(11, 2, 1);
	  cu.selectByVisibleText(nrtq.getPreviousExperienceAtSitedd(), haveweworkedonthissitebefore);
	  
	  termsandconditionsadvised=wb.getXLData(13, 2, 1);
	  cu.selectByVisibleText(nrtq.getTermsConditionsAdviseddd(), termsandconditionsadvised);
	   
	  pCG=wb.getXLData(15,2,1);
	  cu.selectByVisibleText(nrtq.getPCGdd(), pCG);
	  
	  performanceBond=wb.getXLData(17, 2,1);
	  cu.selectByVisibleText(nrtq.getPerformanceBond(), performanceBond);
	  	
	  isEnqueryOpentoAll=wb.getXLData(19, 2, 1);
	  cu.selectByVisibleText(nrtq.getIsenqueryopentoall(), isEnqueryOpentoAll);
	  
	  String damage_Advised=wb.getXLData(22,1,1);
	  cu.selectByVisibleText(nrtq.getDamages_Advised(),damage_Advised);
	  
	  String retention_Advised=wb.getXLData(21,2,1);
	  cu.selectByVisibleText(nrtq.getRetention_Advised(),retention_Advised);
	  
	  String dir_Path = System.getProperty("user.dir");
	  
	  //File upload in RTQ fom
	  //driver.findElement(By.name("flm_rtqForm")).sendKeys(dir_Path+"\\Documentsuploded\\G1 Gateway Approval.doc");
	  //nrtq.getUploaddocument().sendKeys(dir_Path+"\\Documentsuploded\\G1 Gateway Approval.doc");
	  
	  //driver.findElement(By.name("flm_rtqForm")).sendKeys(dir_Path+"\\Documentsuploded\\G1 Gateway Approval.doc");
	   
	  
	  String classs = driver.findElement(By.xpath("//div[@id='rtqForm-dropzone']")).getAttribute("class");
	  
	  nrtq.getUploaddocument().click();
	  
	  ProjectMethods_Small_Works project_Metods = new ProjectMethods_Small_Works();
	  project_Metods.uploadFile("Milestone Document 1.txt");

	  //Below line executes autoIT script
	  //Runtime.getRuntime().exec("D:\\Selenium\\AutoIT\\FileUpload.exe");
	  
	  cu.waitForPageToLoad();
	  String rtqComments=wb.getXLData(20,1,1);
	  nrtq.getComments().sendKeys(rtqComments);
	  
  }

//green-amber-red 'Decide path'
public void pathdession(String estimatedSize,String location) throws InterruptedException, IOException{
		
		if(estimatedSize.equals("C 250-500k")){
			System.out.println("Eng review path");
		ri.reviewEL();
		}
		if(location.equals("South East")){
			
		ri.reviewCL();
		}
		if(estimatedSize.equals("D 500+")){
			System.out.println("Eng Involve path");
			ri.involveEL();
		}
		if(location.equals("Other")){
			System.out.println("Comer Involve path");
			ri.involveCL();
		}
				
	}
	
	public void pathdessioncp2cp3(String estimatedSize,String location) throws InterruptedException, IOException{
		
		if(estimatedSize.equals("C 250-500k")){
			
		ri.reviewEL();
		}
		if(location.equals("South East")){
			
		ri.reviewCL();
		}
		if(estimatedSize.equals("D 500+")){
			
			ri.involveEL();
		}
		if(location.equals("Other")){
			
			ri.involveCLcp2cp3();
		}
	}
	//to get Action button of Project any where in portal 
	//this can be used to find Action button for specific project
	public void actionButton() throws IOException{
		driver.findElement(By.xpath("//td[@title="+ev.projectName()+"]//following-sibling::td/div/button")).click();
	}
	
public void projectname() throws InterruptedException, IOException{
	cu.waitForPageToLoad();
	ab.getViewalltasks().click();
	cu.blindWait();
	List<WebElement> a = driver.findElements(By.xpath("//td[@title="+ev.projectName()+"]//following-sibling::td/div/button"));
	int b = a.size();
	if(b>0){
	driver.findElement(By.xpath("//td[@title="+ev.projectName()+"]//following-sibling::td/div/button")).click();
	cu.blindWait();   //td[@title="+ev.projectName()+"]//following-sibling::td/div/button
	//td[@title="+ev.projectName()+"]//following-sibling::td/a[contains(text(),'Open')]
	driver.findElement(By.xpath("//div[@id='action-items-div']/table/tbody/tr[1]/td/span[contains(text(),'Open')]")).click();
	}
	else {
		String exactXpathForProject = "//td[@title="+ev.projectName()+"]//following-sibling::td/a[contains(text(),'Open')]";
		//String exactXpathForProject = "//tr[td[@title='"+ev.projectName()+"']]/td[13]/a[text()='Open']";
		driver().findElement(By.xpath(exactXpathForProject)).click();	
	}
}

public void projectname_ReviewApproval() throws InterruptedException, IOException{
		cu.waitForPageToLoad();
		cu.blindWait();
		ab.getBoard_Newtask_button().click();
		String exactXpathForProject = "//td[@title="+ev.projectName()+"]//following-sibling::td/a[contains(text(),'Open')]";
		//String exactXpathForProject = "//tr[td[@title='"+ev.projectName()+"']]/td[13]/a[text()='Open']";
		driver().findElement(By.xpath(exactXpathForProject)).click();
	}
	//task listed under by me list
	public void projectName_Board_Byme() throws InterruptedException, IOException{
		cu.blindWait();
		driver.findElement(By.xpath("//label[@id='myApprovals']")).click();
		cu.blindWait();
		driver().findElement(By.xpath("//td[@title="+ev.projectName()+"]//following-sibling::td/a[contains(text(),'Open')]")).click();
	}
	public void projectName_Board_ByGroupApprovals() throws InterruptedException, IOException{
		cu.blindWait();
		driver.findElement(By.xpath("//label[@id='groupApprovals']")).click();
		driver().findElement(By.xpath("//td[@title="+ev.projectName()+"]//following-sibling::td/a[contains(text(),'Open')]")).click();
	}
	
	//Submit the form and logOut 
	public void submit_Logout() throws InterruptedException{
		//submit form
		  ab.getSubmitbutton().click();
		  cu.waitForPageToLoad();
		//log out  
		  login.logout();
	}
//RTQ form with out file upload
	public void rtqForm1(String location, String estimatedSize) throws IOException{
		cu.waitForPageToLoad();
		  nrtq.getRtqLink().click();
		  nrtq.getProjectLink().click();
		  
		  log.info("Project name basic: "+ev.projectName());
		  nrtq.getProjectName().sendKeys(ev.projectName());
		  
		  String paddress=wb.getXLData(6,1,1);
		  nrtq.getProjectAddres().sendKeys(paddress);
		  
		  String consultant=wb.getXLData(4,1,1);
		  nrtq.getConsultantName().sendKeys(consultant);
		  
		  String customer=wb.getXLData(2,1,1);
		  nrtq.getCustomerName().sendKeys(customer);
		  
		  // select Size
		  // estimatedSize=wb.getXLData(8, 1, 1);
		  cu.selectByVisibleText(nrtq.getEstimatedSize(), estimatedSize);
		  
		  points=wb.getXLData(10,1,1);
		  nrtq.getPoints().sendKeys(""+points);
		  
		  //Engineering
		  productSpecified=wb.getXLData(12,1,1);
		  cu.selectByVisibleText(nrtq.getProductSpecifieddd(), productSpecified);
		  
		  typeofBuilding=wb.getXLData(18, 1, 1);
		  cu.selectByVisibleText(nrtq.getTypeofBuildingdd(), typeofBuilding);
		  
		  endUserIndustrySector=wb.getXLData(14, 1, 1);
		  cu.selectByVisibleText(nrtq.getEndUserIndustrySectordd(), endUserIndustrySector);
		  
		  typeofProject=wb.getXLData(16, 1, 1);
		  cu.selectByVisibleText(nrtq.getTypeofProjectdd(), typeofProject);
		  
		  //commercial
		  enquiryFormat=wb.getXLData(3,2,1);
		  cu.selectByVisibleText(nrtq.getEnquiryFormatdd(), enquiryFormat);
		  
		  documentationReceived=wb.getXLData(5, 2, 1);
		  cu.selectByVisibleText(nrtq.getDocumentationReceiveddd(), documentationReceived);
		  
		  areweNamedSpecified=wb.getXLData(7, 2, 1);
		  cu.selectByVisibleText(nrtq.getGANameddd(), areweNamedSpecified);
		  
		  //select Location
		  cu.selectByVisibleText(nrtq.getLocationdd(), location);	  
		  	  
		  haveweworkedonthissitebefore=wb.getXLData(11, 2, 1);
		  cu.selectByVisibleText(nrtq.getPreviousExperienceAtSitedd(), haveweworkedonthissitebefore);
		  
		  termsandconditionsadvised=wb.getXLData(13, 2, 1);
		  cu.selectByVisibleText(nrtq.getTermsConditionsAdviseddd(), termsandconditionsadvised);
		   
		  pCG=wb.getXLData(15,2,1);
		  cu.selectByVisibleText(nrtq.getPCGdd(), pCG);
		  
		  performanceBond=wb.getXLData(17, 2,1);
		  cu.selectByVisibleText(nrtq.getPerformanceBond(), performanceBond);
		  	
		  isEnqueryOpentoAll=wb.getXLData(19, 2, 1);
		  cu.selectByVisibleText(nrtq.getIsenqueryopentoall(), isEnqueryOpentoAll);
		  
		  String damage_Advised=wb.getXLData(22,1,1);
		  cu.selectByVisibleText(nrtq.getDamages_Advised(),damage_Advised);
		  
		  String retention_Advised=wb.getXLData(21,2,1);
		  cu.selectByVisibleText(nrtq.getRetention_Advised(),retention_Advised);
		  		  
		  cu.waitForPageToLoad();
		  String rtqComments=wb.getXLData(20,1,1);
		  nrtq.getComments().sendKeys(rtqComments);
	}
}
