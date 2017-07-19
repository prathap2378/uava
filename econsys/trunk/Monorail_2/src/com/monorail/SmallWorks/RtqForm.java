package com.monorail.SmallWorks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import adminpage.Login;
import adminpage.Monorail;

import com.UIobjectrepositary.in.Preparequote;
import com.UIobjectrepositary.in.RtqFormUIodj;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

public class RtqForm extends Driver{
	RtqFormUIodj rtq = PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	Preparequote quoteform = PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils commonutils = PageFactory.initElements(Driver.driver(), CommonUtils.class);
	
	//Import class
	Login login = new Login();
	Workbook wb = new Workbook();
	static Monorail preparequote=new Monorail();
	
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
	
	{
		try {
			url=wb.getXLData(1, 3, 0);
			userName=wb.getXLData(1,0, 0);
			password=wb.getXLData(1, 1, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test()
	public void rtqForm() throws IOException, InterruptedException{
		login.url(url);
		commonutils.waitForPageToLoad();
		login.user(userName,password);
		rtq.getNewform().click();
		rtq.getSmallWorks().click();
		
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
		
		/*smallWorksType = wb.getXLData(2,3,1);
		commonutils.selectByVisibleText(rtq.getSmallWorksType(),smallWorksType);*/
		
		productSpecified=wb.getXLData(12,1,1);
		commonutils.selectByVisibleText(rtq.getProductSpecifieddd(), productSpecified);
		
		typeofBuilding=wb.getXLData(18, 1, 1);
		commonutils.selectByVisibleText(rtq.getTypeofBuildingdd(), typeofBuilding);
		
		endUserIndustrySector=wb.getXLData(14, 1, 1);
		commonutils.selectByVisibleText(rtq.getEndUserIndustrySectordd(), endUserIndustrySector);
		  
		typeofProject=wb.getXLData(16, 1, 1);
		commonutils.selectByVisibleText(rtq.getTypeofProjectdd(), typeofProject);
		  
		enquiryFormat=wb.getXLData(3,2,1);
		commonutils.selectByVisibleText(rtq.getEnquiryFormatdd(), enquiryFormat);
		  
		location=wb.getXLData(9,2,1);
		commonutils.selectByVisibleText(rtq.getLocationdd(), location);	
		  
		haveweworkedonthissitebefore=wb.getXLData(11, 2, 1);
		commonutils.selectByVisibleText(rtq.getPreviousExperienceAtSitedd(), haveweworkedonthissitebefore);
		  
		retention_Advised=wb.getXLData(21,2,1);
		commonutils.selectByVisibleText(rtq.getRetention_Advised(),retention_Advised);
		  
		damage_Advised=wb.getXLData(22,1,1);
		commonutils.selectByVisibleText(rtq.getDamages_Advised(),damage_Advised);
		
		preparequote.preparequote();
		}
	
	
}
