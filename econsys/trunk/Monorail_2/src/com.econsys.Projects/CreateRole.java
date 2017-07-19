package adminpage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIobjectrepositary.in.AdminUIlibrery;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

public class CreateRole {
	
	//Log details
			private static Logger log = Logger.getLogger(CreateRole.class.getName());
			CreateOrg co=new CreateOrg();
  @Test
  public void f() throws IOException {
	  
	  AdminUIlibrery ad=PageFactory.initElements(Driver.driver(), AdminUIlibrery.class);
	  CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	  
	  String admin=PropertiesUtil.getPropValues("Admin");
	  String Board=PropertiesUtil.getPropValues("Board");
	  String Sl=PropertiesUtil.getPropValues("Sl");
	  String Sd=PropertiesUtil.getPropValues("Sd");
	  String El=PropertiesUtil.getPropValues("El");
	  String Cl=PropertiesUtil.getPropValues("Cl");
	  String Ol=PropertiesUtil.getPropValues("Ol");
	  String Pl=PropertiesUtil.getPropValues("Pl");
	  
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
