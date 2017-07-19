package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.Projects.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class SmallWorks extends Driver{
	RtqFormUi rtq = PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	Preparequote quoteform = PageFactory.initElements(Driver.driver(), Preparequote.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	//Import class
	Login login = new Login();
	Workbook wb = new Workbook();
	static Monorail preparequote=new Monorail();
	ProjectMethods_Small_Works pm = new ProjectMethods_Small_Works();
	EconsysVariables ev = new EconsysVariables();
	
	//Varibles
	String typeofBuilding, smallWorksType, productSpecified, password, url, userName;
	String haveweworkedonthissitebefore, enquiryFormat, location, endUserIndustrySector;
	String typeofProject, retention_Advised, damage_Advised;
	String filepath = System.getProperty("user.dir");
	HSSFWorkbook wb1;
	Iterator<?> rowIterator;
	//boolean flag=false;
	
	@Test()
	public void quoteForm() throws IOException, InterruptedException, AWTException{
		login.url();
		login.user();
		ab.getNewform().click();
		ab.getSmallWorks().click();
		
		rtq.getProjectName().sendKeys(ev.projectName());
		
		//Customer details
		String customer = wb.getXLData(2,1,1);
		rtq.getCustomerName().sendKeys(customer);
		
		smallWorksType = wb.getXLData(2,3,1);
		cu.selectByIndex(rtq.getSmallWorksType(), 1);
		
		//@Quote form
		 cu.selectByVisibleText(quoteform.getQuotationonourFormat(), ev.ourformat);
		 
		 cu.selectByVisibleText(quoteform.getBidSheetAuthorised(), ev.bidsheetauthorised);
		  
		 quoteform.getComments().sendKeys("Prepare Quote");
		 
		}
}
