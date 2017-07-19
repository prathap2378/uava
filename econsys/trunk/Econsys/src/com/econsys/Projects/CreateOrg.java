package com.econsys.Projects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.*;

public class CreateOrg extends Driver {
	SadminUi sa=PageFactory.initElements(Driver.driver(), SadminUi.class);
	CreatePageUi page=PageFactory.initElements(Driver.driver(), CreatePageUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	
	//Log details
	private static Logger log = Logger.getLogger(CreateOrg.class.getName());
	
	//Org variable 
	public String Orgname;
	
	@Test
  public void f() throws IOException, InterruptedException {
		
		//The configering from the log4j xml file
		  DOMConfigurator.configure("log4j.xml");
		  
		Workbook wb=new Workbook();
		String Orgname=wb.getXLData(32, 0, 0);
		
		//implicite wait
		cu.waitForPageToLoad();
		log.info("wating for pagge load");
		
		sa.getAdminliferay().click();
		
		sa.getControlpanel().click();
		
		page.getUsrsandOrgstab().click();
		
		page.getAddorgbutton().click();
		
		page.getRegularorg().click();
		
		page.getOrgname().sendKeys(Orgname);
		
		page.getSaveOrgpage().click();
		log.info("organization created :"+Orgname+"");
			
		/*page.getOrgsitelikeorgcreationpage().click();
		log.info("site managment");
		
		page.getCreateSitecheckBox().click();
		log.info("creating site");
		
		Selecting theme for public pages at create site level
		String theme=wb.getXLData(35, 0);
		cu.selectByVisibleText(page.getPublicpagesthemeselectatcreatesite(), theme);
		log.info("@Create site "+theme+" theme is selected for public pages");
*/				
		/*page.getSaveOrgpage().click();
		log.info("organization created :"+Orgname+"");
		
		page.getUsrsandOrgstab().click();
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),'"+Orgname+"')]")).click();
		
		page.getAssigenuserlink().click();
		
		page.getAvilableuserbutton().click();
		
		//Serch for user
		String user=wb.getXLData(38, 0);
		page.getSearchinputfield().sendKeys(user);
		log.info("user for search to asine for org "+user);
		
		page.getSearchbutton().click();
		log.info("searched user provided");
		
		page.getCheckbox().click();
		log.info("selected the user from existing user list");
		
		page.getUpdateassociationbutton().click();
		log.info("The "+user+ "updated for "+Orgname);*/
		
		/*sa.getMysites().click();
		log.info("Checking for the the org in my sitees liferay");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'"+Orgname+"')]")).click();
		log.info("selected newly created org");
		
		sa.getAdminliferay().click();
		
		sa.getPages().click();*/
		
		
  }
}
