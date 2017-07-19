package com.econsys.SmallWorks;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.econsys.Projects.*; 
import com.econsys.UIobjectrepositary.*;
import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.TestData.*;

public class submitQuote {
	RtqFormUIodj rtq = PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	Preparequote quoteform = PageFactory.initElements(Driver.driver(), Preparequote.class);
	CommonUtils commonutils = PageFactory.initElements(Driver.driver(), CommonUtils.class);
	Basic basic=PageFactory.initElements(Driver.driver(),Basic.class);
	smallWorkPageElements swPageelements=PageFactory.initElements(Driver.driver(), smallWorkPageElements.class);
	//Import class
	Login login = new Login();
	Workbook wb = new Workbook();
	
	//Variables
	String url;
	String userName;
	String password;
	boolean flag=false;
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
	
	
	@Test
	public void testsubmitQuoteform(){
		try {
		    /*login.url(url);
			login.loginSL();
			basic.projectname();*/
			Thread.sleep(1000);
			//**Verify the Quote form 
			if(swPageelements.getProInfo_accordion().isDisplayed()
					&&swPageelements.getQuoteInfo_accordion().isDisplayed()){
				flag=true;
						System.out.println("All elements present in the Quote form");
			}
			rtq.getComments().sendKeys("Submit Quote");
			swPageelements.getSubmitBtn().click();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Assert.assertEquals(flag, true);
	}
}
