package com.econsys.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.econsys.Genriclibrery.*;
import com.econsys.Projects.*;
import com.econsys.SmallWorks.SmallWorks;
import com.econsys.TestData.Workbook;
import com.econsys.UIobjectrepositary.ActionButtonsUi;

public class RtQVerify_SmallWorks extends Driver{
	
	ActionButtonsUi ab=PageFactory.initElements(Driver.driver(),ActionButtonsUi.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	Alerts alerts = PageFactory.initElements(Driver.driver(), Alerts.class);
	SmallWorks smallworks = new SmallWorks();
	Workbook wb = new Workbook();
	Login login = new Login();
	EconsysVariables ev = new EconsysVariables();
	Logger log = Logger.getLogger(RtQVerify_SmallWorks.class.getName());
	
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		RtQVerify_SmallWorks q = new RtQVerify_SmallWorks();
		q.quoteForm_reset();
	}

  @Test
//Small works RTQ form reset verification
  public void quoteForm_reset() throws IOException, InterruptedException, AWTException{
	
	  smallworks.quoteForm();
	  ab.getResetButton().click();
	  cu.blindWait();
	  String resetalert = driver.findElement(By.xpath("//div[@class='modal-body']")).getText();
	  cu.blindWait();
	  log.info("click ok");
	  String elementClicking = driver.findElement(By.xpath("//div[7]/div[2]/a[1]")).getText();
	  driver.findElement(By.xpath("//div[7]/div[2]/a[1]")).click();
	  log.info("reseted");
	  cu.blindWait();
	  log.info(resetalert+"Accepted to reset?: "+elementClicking);
  }
  
@Test
//Small works RTQ form cancel button verification
  public void quoteForm_cancel() throws IOException, InterruptedException, AWTException{
	  smallworks.quoteForm();
	  //Quote form cancel
	  ab.getCancelbutton().click();
	  //home page is displayed-verification
	  boolean homePage = driver.findElement(By.xpath("//div[@id='homePage']")).isDisplayed();
	  cu.blindWait();
	  if(homePage){
		  log.info("cancel success");
	  }
  }
  @Test
  //mandatory check in Quote form of small works
  public void mandatoryChek_QuoteForm_SmallWorks() throws IOException, InterruptedException, AWTException{
	  
	  smallworks.quoteForm();
	  ab.getSubmitbutton().click();
	  cu.blindWait();
	  boolean alertPresent = driver.findElement(By.xpath("//div[contains(text(),'Please fix the errors which are marked in red')]")).isDisplayed();
	  if(alertPresent){
		  alerts.getAlert_Accept_Ok().click();
		  log.info("Alert is displayed, mandatory check is correct");
	  }
  }
}
