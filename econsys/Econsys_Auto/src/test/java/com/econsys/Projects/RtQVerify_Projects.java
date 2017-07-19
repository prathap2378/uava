package com.econsys.Projects;
import java.awt.*;
import java.io.*;
import java.util.logging.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.TestData.*;
import com.econsys.UIobjectrepositary.*;

/**
 * RTQsave class provides all the action in rtq form that is Save, Reset and Cancel
 * @author bhanu.pk
 */
public class RtQVerify_Projects extends Driver{
	RtqFormUi nrtq=PageFactory.initElements(Driver.driver(), RtqFormUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	ActionButtonsUi ab = PageFactory.initElements(Driver.driver(), ActionButtonsUi.class);
	Basic b = new Basic();
	Workbook wb = new Workbook();
	static Login login = new Login();
	Logger log = Logger.getLogger(RtQVerify_Projects.class.getName());
	EconsysVariables ev = new EconsysVariables();
	Alerts alerts = new Alerts();
	
/*//Save RTQ form Project
@Test(priority=0)
public void rtq_Save() throws IOException, InterruptedException, AWTException{
		login.user();
		b.rtqForm(wb.getXLData(20, 4, 1),wb.getXLData(20, 5, 1));
		cu.blindWait();
		nrtq.getSave().click();
		cu.blindWait();
		nrtq.getSaved_RTQ_Link().click();
		log.info("RtQ Saved");
		}*/
	
//Rest RTQ Project
@Test(priority=1)
public void rtq_Reset() throws InterruptedException, IOException, AWTException{
	login.user();	
	cu.waitForPageToLoad();
		b.rtqForm1(ev.location,ev.estimatedSize);
		//nrtq.getProjectName().sendKeys(Basic.prjname);
		cu.blindWait();
		nrtq.getReset().click();
		//Reset aleart OK button
		cu.blindWait();
		driver.findElement(By.xpath("//div[div[contains(text(),'Are you sure you want to clear all the form fields. This will also clear the comments you have entered.')]]/div/a[1]")).click();
		String project_Name = nrtq.getProjectName().getText();
			if(project_Name.isEmpty()){
				log.info("rtq_Reset success*");
			}
}
//Cancel RTQ Projects
@Test(priority=2)
public void rtq_Cancel() throws IOException, InterruptedException, AWTException{
		login.user();
		cu.waitForPageToLoad();
		b.rtqForm1(ev.location,ev.estimatedSize);
		cu.blindWait();
		nrtq.getCancel().click();
		//home page verification
		boolean homepage = driver.findElement(By.xpath("//div[@id='homePage']")).isDisplayed();
			if(homepage){
					log.info("Cancel RTQ form success");
								}
}
@Test
//mandatory check in RTQ form of projects 
public void mandatoryChek_RtQForm() throws IOException, InterruptedException, AWTException{
	login.user();
	  b.rtqForm1(ev.location,ev.estimatedSize);
	  //String customer=wb.getXLData(2,1,1);
	  log.info("clear the customer field");
	  nrtq.getCustomerName().clear();
	  log.info("clearead");
	  ab.getSubmitbutton().click();
	  cu.blindWait();
	  boolean alertPresent = driver.findElement(By.xpath("//div[contains(text(),'Please fix the errors which are marked in red')]")).isDisplayed();
	  if(alertPresent){
		  driver.findElement(By.xpath("//div/a[contains(text(),'OK')]")).click();
		  log.info("Alert is displayed, mandatory check is correct");
	  }
}
}