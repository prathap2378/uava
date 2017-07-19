package com.econsys.Projects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.AdminUIlibrery;


public class CreateRole {
	
	//Log details
			private static Logger log = Logger.getLogger(CreateRole.class.getName());
			CreateOrg co=new CreateOrg();
  @Test
  public void f() throws IOException {
	  
	  AdminUIlibrery ad=PageFactory.initElements(Driver.driver(), AdminUIlibrery.class);
	  CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	  PropertiesUtil p = new PropertiesUtil();
	  String admin=p.getPropValues("Admin");
	  String Board=p.getPropValues("Board");
	  String Sl=p.getPropValues("Sl");
	  String Sd=p.getPropValues("Sd");
	  String El=p.getPropValues("El");
	  String Cl=p.getPropValues("Cl");
	  String Ol=p.getPropValues("Ol");
	  String Pl=p.getPropValues("Pl");
	  
	  Workbook wb=new Workbook();
	  String Orgname=wb.getXLData(32, 0, 0);
	  
	  cu.waitForPageToLoad();
	  ad.getMonorailAdmintab().click();
	  log.info("Monorail admin page");
	  
	  ad.getRolemanagmenttab().click();
	  
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(),Orgname);
	  ad.getEnterRoletextfield().sendKeys(admin);
	  ad.getSubmitRolebutton().click();
	  log.info("***********Admin created");
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(), Orgname);
	  ad.getEnterRoletextfield().sendKeys(Board);
	  ad.getSubmitRolebutton().click();
	  log.info("***********Board created");
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(), Orgname);
	  ad.getEnterRoletextfield().sendKeys(Sl);
	  ad.getSubmitRolebutton().click();
	  log.info("***********"+Sl+" created");
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(), Orgname);
	  ad.getEnterRoletextfield().sendKeys(Sd);
	  ad.getSubmitRolebutton().click();
	  log.info("***********"+Sd+" created");
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(), Orgname);
	  ad.getEnterRoletextfield().sendKeys(El);
	  ad.getSubmitRolebutton().click();
	  log.info("***********"+El+" created");
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(), Orgname);
	  ad.getEnterRoletextfield().sendKeys(Cl);
	  ad.getSubmitRolebutton().click();
	  log.info("***********"+Cl+" created");
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(), Orgname);
	  ad.getEnterRoletextfield().sendKeys(Ol);
	  ad.getSubmitRolebutton().click();
	  log.info("***********"+Ol+" created");
	  
	  ad.getCreatRolebutton().click();
	  
	  cu.selectByVisibleText(ad.getSelectingorgcreatingRole(), Orgname);
	  ad.getEnterRoletextfield().sendKeys(Pl);
	  ad.getSubmitRolebutton().click();
	  log.info("***********"+Pl+" created");
	  
  }
}
