package unusedclass;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminpage.Basic;
import adminpage.Login;
import adminpage.Monorail;
import adminpage.PropertiesUtil;
import adminpage.ReviewInvolve;
import adminpage.TaskCP3CP4;
import adminpage.TasksCP4toCP5;
import adminpage.TasksCP5toCP9;

import com.UIobjectrepositary.in.ActionButtonsUi;
import com.UIobjectrepositary.in.Assignsalesleader;
import com.UIobjectrepositary.in.CosCommitQuoteStatusUi;
import com.UIobjectrepositary.in.Preparequote;
import com.UIobjectrepositary.in.RtqFormUIodj;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

public class PrepareQuote extends Driver {
	
	
	
	
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
	
  /*@Test
//********Prepare Quote task***********
	 public void Preparequote() throws InterruptedException, IOException {
	  
	  String sl=wb.getXLData(10, 0, 0);
	  String psw=wb.getXLData(10,1, 0);
	  login.user(sl, psw);
		  cu.waitForPageToLoad();
		  String prjname=wb.getXLData(4,3, 0);
		  Thread.sleep(2000);
		  String exactXpathForProject = "//tr[td[@title='"+prjname+"']]/td[8]/a[text()='Open']";
		  driver().findElement(By.xpath(exactXpathForProject)).click();
		  String ourformat=wb.getXLData(2, 5, 0);
		  cu.selectByVisibleText(pq.getQuotationonourFormat(), ourformat);
		  String bidsheetauthorised=wb.getXLData(4, 5, 0);
		  cu.selectByVisibleText(pq.getBidSheetAuthorised(), bidsheetauthorised);
		  pq.getRiskopportunityregister().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\Copy of Panel Production Schedule Template.xlsx");
		  pq.getQuotedocument().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\G1 Request to Quote - Procedure.docx");
		  pq.getBidsheet().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\G1 RtQ rev01_120220 amended.xlsx");
		  		  	  
		  pq.getComments().sendKeys("Prepare Quote");

		  //Reading cost ans sell values
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
	        System.out.println("cell1");
	          	double Cost = row.getCell(1).getNumericCellValue();
	          	System.out.println("cell2");
	          	double sell = row.getCell(2).getNumericCellValue();
	           	System.out.println("cell3");
		  pq.getAddnewpopup().click();
		  pq.getCostCodeCategorytextfield().sendKeys(cell1Value);
		  pq.getCost().sendKeys(""+Cost);
		  pq.getSell().sendKeys(""+sell);
		  pq.getSaveAddcostsellpopup().click();
		 
	  }
			}
		  String autoApprovalCondittion=wb.getXLData(6, 5, 0);
		  cu.selectByVisibleText(pq.getExpliciteapprovalatgateway2(), autoApprovalCondittion);
		  
		  pq.getQuoteprepared().click();
  }*/

	@Test(invocationCount = 5,threadPoolSize = 10)
	public void test1() throws IOException, InterruptedException, AWTException {
		
		System.out.printf("%n[START] Thread Id : %s is started!", 
                Thread.currentThread().getId());
		monorailTestFlow();
		
		System.out.printf("%n[END] Thread Id : %s", 
                Thread.currentThread().getId());
	}		
	public static void monorailTestFlow() throws IOException, InterruptedException, AWTException {
		
		//******URL&&&&&&&&&
				String url=wb.getXLData(1, 3, 0);
				login.url(url);
				//driver.manage().deleteAllCookies();
				//wb.setXLData(10, 10, 0);
				//*****Login as genral user******
				
				String un=wb.getXLData(1,0, 0);
				String pwd=wb.getXLData(1, 1, 0);
				login.user(un,pwd);
						
				//***********RTQ inputs
			
				//*****Prepare quote inputs*********
				
				
				//****intiation of rtq form*********
				b.rtqForm();
				
	}
}
/*<class name="adminpage.Usercreation"/>
<class name="adminpage.PageCreation"/>
<class name="adminpage.TasksCP4toCP5"/>
<class name="adminpage.CreateOrg"/>
<class name="adminpage.CreateRole"/>
<class name="db.DB"/>
<class name="unusedclass.PrepareQuote"/>
<class name="adminpage.Workflowmapping"/>
<class name="adminpage.ReviewInvolve"/>
<class name="adminpage.Porletassign"/>
<class name="adminpage.ReviewApproval"/> -->
*/