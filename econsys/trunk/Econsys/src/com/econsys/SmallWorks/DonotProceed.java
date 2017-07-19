package com.econsys.SmallWorks;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.CommonUtils;
import com.econsys.Genriclibrery.Driver;
import com.econsys.Projects.*;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;
import com.econsys.UIobjectrepositary.CosCommitQuoteStatusUi;
import com.econsys.UIobjectrepositary.Preparequote;

public class DonotProceed extends Driver{
	CommonUtils cu = PageFactory.initElements(Driver.driver() , CommonUtils.class);
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	CosCommitQuoteStatusUi ccq=PageFactory.initElements(Driver.driver(), CosCommitQuoteStatusUi.class);
	Preparequote quoteform = PageFactory.initElements(Driver.driver(), Preparequote.class);
	Login login = new Login();
	Basic b = new Basic();
	Workbook wb= new Workbook();
	SmallWorks sw = new SmallWorks();
	Monorail monorail = new Monorail();
	TaskCP3CP4 cuc = new TaskCP3CP4();
	TasksCP4toCP5 cp4_cp5 = new TasksCP4toCP5();
	projectMethods swMethods = new projectMethods();
	String projectName;
	{
	try {
		projectName=wb.getXLData(1,2,1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
@Test
public void CP2donotproceed() throws IOException, InterruptedException, AWTException {
	  DonotProceed donotproceed = new DonotProceed();  
	  System.out.println("Project name = "+projectName);
	  sw.quoteForm();
	  cu.selectByVisibleText(quoteform.getExpliciteapprovalatgateway2(), "Yes");
	  ab.getSubmitbutton().click();
	  //login.logout();
	  login.url();
	  login.loginboard();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  ab.getComments().sendKeys("Do not proceed at CP2");
	  ab.getDonotproccedbutton().click();
	  String allert = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	  Thread.sleep(1000);
	  ab.getDonotproceed_allret_Ok().click();
	  System.out.println(allert+"project deleted");
	  donotproceed.search();
  }
public void CP3donotproceed() throws IOException, InterruptedException, AWTException {
	  DonotProceed donotproceed = new DonotProceed();  
	  login.url();
	  sw.quoteForm();
	  cu.selectByVisibleText(quoteform.getExpliciteapprovalatgateway2(), "No");
	  ab.getSubmitbutton().click();
	  login.logout();
	  monorail.board();
	  monorail.submitandresubmit();
	  b.projectname();
	  cu.selectByVisibleText(driver.findElement(By.xpath("//select[@id='st_quoteStatus']")),"Amend Bid");
	  ab.getComments().sendKeys("Amend bid");
	  ab.getSubmitbutton().click();
	  monorail.prepareQuotecp2cp3();
	  login.loginboard();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  ab.getComments().sendKeys("Do not proceed at CP3");
	  ab.getDonotproccedbutton().click();
	  String allert = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	  Thread.sleep(1000);
	  ab.getDonotproceed_allret_Ok().click();
	  System.out.println(allert+"project deleted");
	  donotproceed.search();
  }
public void CP4donotproceed() throws IOException, InterruptedException, AWTException {
	  DonotProceed donotproceed = new DonotProceed();
	  login.url();
	  sw.quoteForm();
	  cu.selectByVisibleText(quoteform.getExpliciteapprovalatgateway2(), "No");
	  ab.getSubmitbutton().click();
	  login.logout();
	  monorail.board();
	  monorail.submitandresubmit();
	  b.projectname();
	  cu.waitForPageToLoad();
	  cu.selectByVisibleText(ccq.getQuoteStatus(),"Customer Commitment Received");
	  cu.waitForPageToLoad();
	  cu.selectByVisibleText(ccq.getCustomerCommitmentType(),"PO Received - Under Review");
	  ccq.getUploadDoc_StatusofSubmitQuote().click();
	  ab.getLinkFileCheckbox().click();
	  ab.getAdd_LinkfilePopup().click();
	  ab.getComments().sendKeys("Customer Commitment recived-PO Received - Under Review");
	  ab.getSubmitbutton().click();
	  cuc.customercommit();
	  login.loginboard();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  ab.getComments().sendKeys("Do not proceed at CP4");
	  ab.getDonotproccedbutton().click();
	  String allert = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	  Thread.sleep(1000);
	  ab.getDonotproceed_allret_Ok().click();
	  System.out.println(allert+"project deleted");
	  donotproceed.search();
  }
public void CP5donotproceed() throws IOException, InterruptedException, AWTException {
	  DonotProceed donotproceed = new DonotProceed();
	  login.url();
	  sw.quoteForm();
	  cu.selectByVisibleText(quoteform.getExpliciteapprovalatgateway2(), "No");
	  ab.getSubmitbutton().click();
	  login.logout();
	  //monorail.board();
	  monorail.submitandresubmit();
	  b.projectname();
	  cu.waitForPageToLoad();
	  cu.selectByVisibleText(ccq.getQuoteStatus(),"Customer Commitment Received");
	  cu.waitForPageToLoad();
	  cu.selectByVisibleText(ccq.getCustomerCommitmentType(),"PO Received - Under Review");
	  ccq.getUploadDoc_StatusofSubmitQuote().click();
	  ab.getLinkFileCheckbox().click();
	  ab.getAdd_LinkfilePopup().click();
	  ab.getComments().sendKeys("Customer Commitment recived-PO Received - Under Review");
	  ab.getSubmitbutton().click();
	  cuc.customercommit();
	  //monorail.boardcp4();
	  cp4_cp5.apointkeystaf();
	  cp4_cp5.commerSuit();
	  swMethods.salesToOperation();
	  swMethods.operation_acceptance();
	  login.loginboard();
	  driver().findElement(By.xpath("//div[@id='gate3']/div/ul/li[1]/a")).click();
	  b.projectnameboard();
	  ab.getComments().sendKeys("Do not proceed at CP5");
	  ab.getDonotproccedbutton().click();
	  String allert = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='modal-footer']/a[2]")).click();
	  System.out.println(allert+"project deleted");
	  donotproceed.search();
  }
public void search() throws InterruptedException{
	//Project archive action
	  Thread.sleep(500);
	  ab.getProject_Archive().click();
	  ab.getSearch().click();
	  Thread.sleep(500);
	  ab.getSearchProjectname().sendKeys(projectName);
	  Thread.sleep(500);
	  ab.getFind().click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//tr[td[span[@title='"+projectName+"']]]//td[13]/a[text()='Details']")).click();
	  Thread.sleep(500);
	  String projectName1=driver.findElement(By.xpath("//table[@id='rtqProjectInfoTable']/tbody/tr[2]/td[2]/label")).getText();
	  Thread.sleep(500);
	  System.out.println(projectName1+" : project do not proceeded");
	  Thread.sleep(500);
	  Assert.assertEquals(projectName1, projectName);
  }
}
