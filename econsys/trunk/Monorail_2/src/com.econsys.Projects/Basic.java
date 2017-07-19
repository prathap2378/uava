package adminpage;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.jws.soap.SOAPBinding.Use;

import org.eclipse.jetty.server.Authentication.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.ActionButtonsUi;
import com.UIobjectrepositary.in.Assignsalesleader;
import com.UIobjectrepositary.in.CosCommitQuoteStatusUi;
import com.UIobjectrepositary.in.Preparequote;
import com.UIobjectrepositary.in.RtqFormUIodj;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

public class Basic extends Driver{
	Preparequote pq=PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	RtqFormUIodj nrtq=PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	Assignsalesleader sla=PageFactory.initElements(Driver.driver(), Assignsalesleader.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	
	//import classes
	static Workbook wb=new Workbook();
	static Monorail rtq=new Monorail();
	static Login login=new Login();
	static ReviewInvolve ri=new ReviewInvolve();
	static TasksCP4toCP5 g45=new TasksCP4toCP5();
	static TaskCP3CP4 g34=new TaskCP3CP4();
	Robotqq r = new Robotqq();
	
	
	//Variables
	public static String estimatedSize=null;
	public static String location=null;
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
	String productSpecified;
	String prjname;
	String Customer;
	String Consultant;
	String projectAddress=null;
	String size=null;
	double points;
	String typeofBuilding;
	String endUserIndustrySector;
	String typeofProject;
	String enquiryFormat;
	String documentationReceived;
	String areweNamedSpecified;
	String haveweworkedonthissitebefore;
	String termsandconditionsadvised;
	String pCG;
	String performanceBond;
	String isEnqueryOpentoAll;
	
  @Test
//Deside path
	public void pathdession() throws InterruptedException, IOException{
	    estimatedSize=wb.getXLData(8, 1, 1);
		location=wb.getXLData(9,2,1);
		
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
		System.out.println("Searched path");		
	}
	
	public void pathdessioncp2cp3() throws InterruptedException, IOException{
		estimatedSize=wb.getXLData(8, 1, 1);
		location=wb.getXLData(9,2,1);
		//C 250-500k
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
	
	public void projectname() throws IOException, InterruptedException{
		cu.waitForPageToLoad();
		String prjname=wb.getXLData(1,2,1);
		Thread.sleep(2000);
		String exactXpathForProject = "//tr[td[@title='"+prjname+"']]/td[9]/a[text()='Open']";
		driver().findElement(By.xpath(exactXpathForProject)).click();
	}
	public void projectnameboard() throws InterruptedException, IOException{
		cu.waitForPageToLoad();
		String prjname=wb.getXLData(1,2,1);
		Thread.sleep(2000);
		String exactXpathForProject = "//tr[td[@title='"+prjname+"']]/td[13]/a[text()='Open']";
		driver().findElement(By.xpath(exactXpathForProject)).click();
	}
	
	public void projectnamerevieinvolve() throws InterruptedException, IOException{
		cu.waitForPageToLoad();
		String prjname=wb.getXLData(1,2,1);
		 Thread.sleep(2000);
		 String exactXpathForProject = "//tr[td[@title='"+prjname+"']]/td[12]/a[text()='Open']";
		 driver().findElement(By.xpath(exactXpathForProject)).click();
	}
	
	
	//******RTQ form inputs******
	public void rtqForm() throws InterruptedException, IOException, AWTException {
		
	  cu.waitForPageToLoad();
	  driver().findElement(By.linkText("New RTQ")).click();
	  
	  String prjname=wb.getXLData(1,2,1);
	  nrtq.getProjectName().sendKeys(prjname);
	  
	  String paddress=wb.getXLData(6,1,1);
	  nrtq.getProjectAddres().sendKeys(paddress);
	  
	  String consultant=wb.getXLData(4,1,1);
	  nrtq.getConsultantName().sendKeys(consultant);
	  
	  String customer=wb.getXLData(2,1,1);
	  nrtq.getCustomerName().sendKeys(customer);
	  
	  // select Size
	  estimatedSize=wb.getXLData(8, 1, 1);
	  cu.selectByVisibleText(nrtq.getEstimatedSize(), estimatedSize);
	  
	  points=wb.getXLDataint(10,1,1);
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
	  location=wb.getXLData(9,2,1);
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
	  
	  String retention_Advised=wb.getXLData(21,2,1);
	  cu.selectByVisibleText(nrtq.getRetention_Advised(),retention_Advised);
	  
	  String damage_Advised=wb.getXLData(22,1,1);
	  cu.selectByVisibleText(nrtq.getDamages_Advised(),damage_Advised);
	  
	  System.out.println("doc");
	  String filepath=System.getProperty("user.dir");
	  Thread.sleep(1000);
	  
	  //nrtq.getUploaddocument().click();
	  //driver.findElement(By.name("flm_rtqForm")).sendKeys(filepath+"\\Documentsuploded\\G1 Gateway Approval.doc");
	  //nrtq.getUploaddocument().sendKeys(filepath+"\\Documentsuploded\\G1 Gateway Approval.doc");

	  nrtq.getUploaddocument().click();
	  StringSelection sel = new StringSelection(filepath+"\\Documentsuploded\\G1 Gateway Approval.doc");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	  r.actionfiles();
	  System.out.println("doc2");  
	  String rtqComments=wb.getXLData(20,1,1);
	  nrtq.getComments().sendKeys(rtqComments);
	  
	  //submit rtq
	  nrtq.getSubmit().click();
	  //ab.getSavebutton().click();
	  //driver.quit();
	  Thread.sleep(2000);
	  login.logout();

  }
	

}
