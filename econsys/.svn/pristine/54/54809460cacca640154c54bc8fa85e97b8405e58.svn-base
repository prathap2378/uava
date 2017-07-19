package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;
import com.econsys.UIobjectrepositary.Preparequote;
import com.econsys.UIobjectrepositary.RtqFormUIodj;

public class SmallWorks extends Driver{
	RtqFormUIodj rtq = PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	Preparequote quoteform = PageFactory.initElements(Driver.driver(), Preparequote.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	//Import class
	Login login = new Login();
	Workbook wb = new Workbook();
	static Monorail preparequote=new Monorail();
	Robotqq r = new Robotqq();
	
	//Varibles
	String url;
	String userName;
	String password;
	String projectName;
	String productSpecified;
	String smallWorksType;
	String typeofBuilding;
	String haveweworkedonthissitebefore;
	String enquiryFormat;
	String location;
	String endUserIndustrySector;
	String typeofProject;
	String retention_Advised;
	String damage_Advised;
	String filepath = System.getProperty("user.dir");
	HSSFWorkbook wb1;
	Iterator<?> rowIterator;
	
	
	@Test()
	public void quoteForm() throws IOException, InterruptedException, AWTException{
		login.url();
		login.user();
		ab.getNewform().click();
		ab.getSmallWorks().click();
		
		//Project name validation
		projectName=wb.getXLData(1,2,1);
		rtq.getProjectName().sendKeys(projectName);
		/*WebElement projectNameinputBox = rtq.getProjectName();
		// Check whether input field is blank
		if(projectNameinputBox.getAttribute("value").isEmpty())
		{
		   System.out.println("ProjectName is empty");
		}*/
		//Customer details
		String customer = wb.getXLData(2,1,1);
		rtq.getCustomerName().sendKeys(customer);
		
		smallWorksType = wb.getXLData(2,3,1);
		cu.selectByVisibleText(rtq.getSmallWorksType(),smallWorksType);
		
		productSpecified=wb.getXLData(12,1,1);
		cu.selectByVisibleText(rtq.getProductSpecifieddd(), productSpecified);
		
		typeofBuilding=wb.getXLData(18, 1, 1);
		cu.selectByVisibleText(rtq.getTypeofBuildingdd(), typeofBuilding);
		
		endUserIndustrySector=wb.getXLData(14, 1, 1);
		cu.selectByVisibleText(rtq.getEndUserIndustrySectordd(), endUserIndustrySector);
		  
		typeofProject=wb.getXLData(16, 1, 1);
		cu.selectByVisibleText(rtq.getTypeofProjectdd(), typeofProject);
		  
		enquiryFormat=wb.getXLData(3,2,1);
		cu.selectByVisibleText(rtq.getEnquiryFormatdd(), enquiryFormat);
		  
		location=wb.getXLData(9,2,1);
		cu.selectByVisibleText(rtq.getLocationdd(), location);	
		  
		haveweworkedonthissitebefore=wb.getXLData(11, 2, 1);
		cu.selectByVisibleText(rtq.getPreviousExperienceAtSitedd(), haveweworkedonthissitebefore);
		  
		retention_Advised=wb.getXLData(21,2,1);
		cu.selectByVisibleText(rtq.getRetention_Advised(),retention_Advised);
		  
		damage_Advised=wb.getXLData(22,1,1);
		cu.selectByVisibleText(rtq.getDamages_Advised(),damage_Advised);
		cu.waitForPageToLoad();
		rtq.getUploaddocument().click();
		StringSelection sel = new StringSelection(filepath+"\\Documentsuploded\\G1 Gateway Approval.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		r.actionfiles();
		Thread.sleep(500);

		  //@Quote form
		
		String ourformat=wb.getXLData(2, 5, 0);
		String bidsheetauthorised=wb.getXLData(4, 5, 0);
		String exeCP2=wb.getXLData(6, 5, 0);
		
		 ourformat=wb.getXLData(2, 5, 0);
		 cu.selectByVisibleText(quoteform.getQuotationonourFormat(), ourformat);
		 
		 cu.waitForPageToLoad();
		 quoteform.getQuotedocument_Linkfile().click();
		 ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();
		 
		 cu.waitForPageToLoad();
		 quoteform.getBidsheet_linkfile().click();
		 ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();
		 /*quoteform.getRiskopportunityregister_Linkfile().click();
		 ab.getLinkFileCheckbox().click();
		 ab.getAdd_LinkfilePopup().click();*/
		 
		 bidsheetauthorised=wb.getXLData(4, 5, 0);
		 cu.selectByVisibleText(quoteform.getBidSheetAuthorised(), bidsheetauthorised);
		  
		 quoteform.getComments().sendKeys("Prepare Quote");

		 //Reading cost and sell values
		 String testdataXLpath= filepath+"//src//com//econsys//TestData//Monorail_testdata.xls";
		 FileInputStream file = new FileInputStream(testdataXLpath);
		 wb1 = new HSSFWorkbook(file);
		 int sheetname=2;
		 HSSFSheet Firstpage=wb1.getSheetAt(sheetname);
		  
		 double overallCost=Firstpage.getRow(1).getCell(4).getNumericCellValue();
		 quoteform.getOverallProjectCost().sendKeys(""+overallCost);
		  
		 double overallSell=Firstpage.getRow(1).getCell(5).getNumericCellValue();
		 quoteform.getOverallProjectSell().sendKeys(""+overallSell);
			  
		 rowIterator = Firstpage.rowIterator();	
				
		 while(rowIterator.hasNext()){
		 HSSFRow row = (HSSFRow) rowIterator.next();
		 int rowNum = row.getRowNum();
				
				
		 if (rowNum !=0) {
		 String cell1Value = row.getCell(0).getStringCellValue();
		       
		 double Cost = row.getCell(1).getNumericCellValue();
		          	
		 double sell = row.getCell(2).getNumericCellValue();
		           	
		 quoteform.getAddnewpopup().click();
		 quoteform.getCostCodeCategorytextfield().sendKeys(cell1Value);
		 cu.waitForPageToLoad();
		 quoteform.getCost().sendKeys(""+Cost);
		 quoteform.getSell().sendKeys(""+sell);
		 Thread.sleep(500);
		 quoteform.getSaveAddcostsellpopup().click();
		 Thread.sleep(500);
		 }
	     	 }
		 /*exeCP2=wb.getXLData(6, 5, 0);
		 cu.selectByVisibleText(quoteform.getExpliciteapprovalatgateway2(),exeCP2);*/
		}
	
	
}
